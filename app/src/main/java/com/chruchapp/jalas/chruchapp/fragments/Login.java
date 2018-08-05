package com.chruchapp.jalas.chruchapp.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.chruchapp.jalas.chruchapp.R;
import com.chruchapp.jalas.chruchapp.data.DataModelLogin;
import com.chruchapp.jalas.chruchapp.network.APIService;
import com.chruchapp.jalas.chruchapp.network.ApiCall;
import com.chruchapp.jalas.chruchapp.screens.LandingScreen;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Login extends Fragment {
    private Context context;
    private View v;
    //@BindView(R.id.user)
    EditText user;
    //@BindView(R.id.pass)
    EditText pass;
    //@BindView(R.id.login)
    TextView login;

    TextView logintext;
    String userName;
    String password;

    private APIService mAPIService;

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.activity_login, container, false);
        context = getActivity();
        ButterKnife.bind(context,v);
        logintext = v.findViewById(R.id.login);
        user = v.findViewById(R.id.user);
        pass = v.findViewById(R.id.pass);

       // Typeface custom_font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/LatoLight.ttf");
        //user.setTypeface(custom_font);
        //pass.setTypeface(custom_font);

        mAPIService = ApiCall.getAPIService();
        System.out.println("coming here");
        //Typeface custom_font1 = Typeface.createFromAsset(context.getAssets(), "fonts/LatoRegular.ttf");

        //login.setTypeface(custom_font1);


        logintext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userName = user.getText().toString();
                password = pass.getText().toString();
                createApiCall(userName,password);
            }
        });
        return v;
    }


    private void createApiCall(String userName, String password) {

        mAPIService.login(userName,password).enqueue(new retrofit2.Callback<DataModelLogin>() {
            @Override
            public void onResponse(retrofit2.Call<DataModelLogin> call, retrofit2.Response<DataModelLogin> response) {

                if(response.isSuccessful()) {
                    System.out.println("response ===== "+response.message());
                    if(response.message().equalsIgnoreCase("OK")) {
                       /* Intent intent = new Intent(MainActivity.this, EditProfile.class);
                        intent.putExtra("DataModelLogin", response.body());
                        startActivity(intent);*/
                        //Intent intent = new Intent(MainActivity.this, LandingScreen.class);
                        // intent.putExtra("DataModelLogin", response.body());
                        //startActivity(intent);
                        Intent intent = new Intent(context, LandingScreen.class);
                        startActivity(intent);
                    }
                    else {
                        Toast.makeText(context,"Wrong Credentials...",Toast.LENGTH_LONG).show();
                    }

                }
                else {
                    Toast.makeText(context,"Wrong Credentials...",Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(retrofit2.Call<DataModelLogin> call, Throwable t) {
                Log.e("Suresh", "Unable to submit post to API.");
            }
        });
    }
}
