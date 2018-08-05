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
import com.chruchapp.jalas.chruchapp.data.RegisterViewModel;
import com.chruchapp.jalas.chruchapp.network.APIService;
import com.chruchapp.jalas.chruchapp.network.ApiCall;
import com.chruchapp.jalas.chruchapp.screens.MainActivity;
import com.chruchapp.jalas.chruchapp.screens.SignUpActivity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Register extends Fragment {

    private Context context;
    private View v;

    @BindView(R.id.firstname)
    EditText firstname;
    @BindView(R.id.lastname)
    EditText lastname;
    @BindView(R.id.email)
    EditText email;
    @BindView(R.id.mob)
    EditText mob;
    @BindView(R.id.username)
    EditText username;
    @BindView(R.id.pass)
    EditText pass;
    @BindView(R.id.repass)
    EditText repass;
    @BindView(R.id.login)
    TextView login;
    @BindView(R.id.signup)
    TextView signup;

    RegisterViewModel registerViewModel = new RegisterViewModel();
    private APIService mAPIService;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.activity_sign_up, container, false);
        context = getActivity();
        ButterKnife.bind(context,v);

        // Typeface custom_font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/LatoLight.ttf");
        //user.setTypeface(custom_font);
        //pass.setTypeface(custom_font);

        mAPIService = ApiCall.getAPIService();

        //Typeface custom_font1 = Typeface.createFromAsset(context.getAssets(), "fonts/LatoRegular.ttf");

        //login.setTypeface(custom_font1);

        return v;
    }
   /* @OnClick(R.id.login)
    public void login()
    {
        Intent intent =new Intent(context,MainActivity.class);
        startActivity(intent);
    }*/

    @OnClick(R.id.signup)
    public void signUp()
    {
        boolean valid = validate();
        if (valid)
        {
            registerViewModel.setChurchId(1);
            registerViewModel.setName(firstname.getText().toString());
            registerViewModel.setSurname(lastname.getText().toString());
            registerViewModel.setEmailId(email.getText().toString());
            registerViewModel.setPhoneNumber(mob.getText().toString());
            registerViewModel.setUserName(username.getText().toString());
            registerViewModel.setPassword(pass.getText().toString());
            registerViewModel.setConfirmPassword(repass.getText().toString());
            //createApi();
            createApiService(registerViewModel);
        }
    }

    private void createApiService(RegisterViewModel registerViewModel) {

        mAPIService.savePost(registerViewModel).enqueue(new retrofit2.Callback<RegisterViewModel>() {
            @Override
            public void onResponse(retrofit2.Call<RegisterViewModel> call, retrofit2.Response<RegisterViewModel> response) {
                System.out.println("response ==== "+response);
                Toast.makeText(context,"Account Created...",Toast.LENGTH_LONG).show();
                firstname.getText().clear();
                lastname.getText().clear();
                email.getText().clear();
                mob.getText().clear();
                username.getText().clear();
                pass.getText().clear();
                repass.getText().clear();

               /* if(response.isSuccessful()) {
                    System.out.println(("response === "+response.body().toString()));
                    //   Log.i(TAG, "post submitted to API." + response.body().toString());
                }*/
            }

            @Override
            public void onFailure(retrofit2.Call<RegisterViewModel> call, Throwable t) {
                Log.e("Suresh", "Unable to submit post to API.");

            }
        });


    }

    private boolean validate() {
        if(firstname.getText().toString().length() == 0)
        {
            firstname.setError("Enter FirstName");
            firstname.requestFocus();
        }
        else if(lastname.getText().toString().length() == 0)
        {
            lastname.setError("Enter SurName");
            lastname.requestFocus();
        }
        else if(email.getText().toString().length() == 0)
        {
            email.setError("Enter Email");
            email.requestFocus();
        }
        else if(!emailValidator(email.getText().toString()))
        {
            email.setError("Enter Valid Email");
            email.requestFocus();
        }
        else if(mob.getText().toString().length() == 0)
        {
            mob.setError("Enter MobileNumber");
            mob.requestFocus();
        }
        else if(username.getText().toString().length() == 0)
        {
            username.setError("Enter userName");
            username.requestFocus();
        }
        else if(pass.getText().toString().length() == 0)
        {
            pass.setError("Enter Password");
            pass.requestFocus();
        }
        else if(repass.getText().toString().length() == 0)
        {
            repass.setError("Please confirm password");
            repass.requestFocus();
        }
        else if(!pass.getText().toString().equals(repass.getText().toString())){
            repass.setError("Password Not matched");
            repass.requestFocus();
        }
        else
        {
            return true;
        }
        return false;
    }
    public boolean emailValidator(String email)
    {
        Pattern pattern;
        Matcher matcher;
        final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
