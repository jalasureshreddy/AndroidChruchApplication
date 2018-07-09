package com.chruchapp.jalas.chruchapp.screens;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.chruchapp.jalas.chruchapp.R;
import com.chruchapp.jalas.chruchapp.data.DataModelLogin;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/LatoLight.ttf");
        user.setTypeface(custom_font);
        pass.setTypeface(custom_font);

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

        //createApiCallTest(userName,password);

    }

  /*  private void createApiCallTest(String userName,String password)
    {
        ApiCall.post(Constant.BASE_URL+Constant.ACCOUNT_URL+Constant.ACCOUNT_URL_LOGIN+userName+"/"+password)

    }*/

    private void createApiCall(String userName,String password)
    {
        ApiCall.get(Constant.BASE_URL+Constant.ACCOUNT_URL+Constant.ACCOUNT_URL_LOGIN+userName+"/"+password, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

                System.out.println("exception "+e);
            }

            @Override
            public void onResponse(Call call,final Response response) throws IOException {

                if(response.isSuccessful())
                {
                    System.out.println("Response ==== "+response.body().string());
                    final Gson gson = new GsonBuilder().create();
                 /*   new Thread(new Runnable() {
                        @Override
                        public void run() {

                                System.out.println("coming here ");
                                DataModelLogin data = gson.fromJson(response.body().toString(),DataModelLogin.class);
                                 System.out.println("data ===== "+data.getName());
                                Intent intent = new Intent(MainActivity.this,EditProfile.class);
                                startActivity(intent);


                        }
                    }).start();
*/
                }
                else
                {
                    System.out.println("No Response ==== "+response.body().string());
                }
            }
        });
    }
}
