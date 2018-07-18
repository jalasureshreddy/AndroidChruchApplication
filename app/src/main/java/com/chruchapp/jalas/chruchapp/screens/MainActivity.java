package com.chruchapp.jalas.chruchapp.screens;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.chruchapp.jalas.chruchapp.R;
import com.chruchapp.jalas.chruchapp.data.DataModelLogin;
import com.chruchapp.jalas.chruchapp.network.APIService;
import com.chruchapp.jalas.chruchapp.network.ApiCall;
import com.chruchapp.jalas.chruchapp.utils.Constant;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import org.json.JSONObject;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.user)
    EditText user;
    @BindView(R.id.pass)
    EditText pass;
    @BindView(R.id.login)
    TextView login;
   /* @BindView(R.id.signup)
    TextView signup;*/

    String userName;
    String password;

    private APIService mAPIService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/LatoLight.ttf");
        user.setTypeface(custom_font);
        pass.setTypeface(custom_font);

        mAPIService = ApiCall.getAPIService();

        Typeface custom_font1 = Typeface.createFromAsset(getAssets(), "fonts/LatoRegular.ttf");

        login.setTypeface(custom_font1);
      //  signup.setTypeface(custom_font);


    }

    /*@OnClick(R.id.signup)
    public void signUp()
    {
        Intent it = new Intent(MainActivity.this, SignUpActivity.class);
        startActivity(it);
    }*/
    @OnClick(R.id.login)
    public void login()
    {
        userName = user.getText().toString();
        password = pass.getText().toString();


        createApiCall(userName,password);
        //createApiCallTest(userName,password);

    }

    private void createApiCall(String userName, String password) {

        mAPIService.login(userName,password).enqueue(new retrofit2.Callback<DataModelLogin>() {
            @Override
            public void onResponse(retrofit2.Call<DataModelLogin> call, retrofit2.Response<DataModelLogin> response) {

                if(response.isSuccessful()) {
                    System.out.println("response ===== "+response.message());
                    if(response.message().equalsIgnoreCase("OK")) {
                        Intent intent = new Intent(MainActivity.this, EditProfile.class);
                        intent.putExtra("DataModelLogin", response.body());
                        startActivity(intent);
                    }
                    else {
                        Toast.makeText(MainActivity.this,"Wrong Credentials...",Toast.LENGTH_LONG).show();
                    }

                }
            }

            @Override
            public void onFailure(retrofit2.Call<DataModelLogin> call, Throwable t) {
                Log.e("Suresh", "Unable to submit post to API.");
            }
        });
    }
    }
