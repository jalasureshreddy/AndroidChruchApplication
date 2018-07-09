package com.chruchapp.jalas.chruchapp.screens;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import com.chruchapp.jalas.chruchapp.R;
import com.chruchapp.jalas.chruchapp.data.RegisterViewModel;
import com.chruchapp.jalas.chruchapp.network.APIService;
import com.chruchapp.jalas.chruchapp.network.ApiCall;
import com.chruchapp.jalas.chruchapp.utils.Constant;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class SignUpActivity extends AppCompatActivity {

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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        ButterKnife.bind(this);

        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/LatoLight.ttf");

        mAPIService = Constant.getAPIService();

        firstname.setTypeface(custom_font);
        lastname.setTypeface(custom_font);
        username.setTypeface(custom_font);
        pass.setTypeface(custom_font);
        repass.setTypeface(custom_font);
        email.setTypeface(custom_font);
        mob.setTypeface(custom_font);


        Typeface custom_font1 = Typeface.createFromAsset(getAssets(), "fonts/LatoRegular.ttf");
        signup.setTypeface(custom_font1);
        login.setTypeface(custom_font);

    }
    @OnClick(R.id.login)
    public void login()
    {

        //validate();
        //createApi();
        /*Intent it = new Intent(SignUpActivity.this,MainActivity.class);
        startActivity(it);*/
    }

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

        mAPIService.savePost(registerViewModel.getChurchId(),registerViewModel.getName(),registerViewModel.getSurname(),registerViewModel.getEmailId(),
                             registerViewModel.getPassword(),registerViewModel.getPhoneNumber(),registerViewModel.getConfirmPassword()).enqueue(new retrofit2.Callback<RegisterViewModel>() {
            @Override
            public void onResponse(retrofit2.Call<RegisterViewModel> call, retrofit2.Response<RegisterViewModel> response) {

                System.out.println("response ==== "+response);
                if(response.isSuccessful()) {
                    System.out.println(("response === "+response.body().toString()));
                 //   Log.i(TAG, "post submitted to API." + response.body().toString());
                }
            }

            @Override
            public void onFailure(retrofit2.Call<RegisterViewModel> call, Throwable t) {
                Log.e("Suresh", "Unable to submit post to API.");

            }
        });

       /* mAPIService.savePost(registerViewModel).enqueue(new retrofit2.Callback<RegisterViewModel>() {
            @Override
            public void onResponse(retrofit2.Call<RegisterViewModel> call, retrofit2.Response<RegisterViewModel> response) {

                System.out.println("response ==== "+response);
                if(response.isSuccessful()) {
                    System.out.println(("response === "+response.body().toString()));
                    //   Log.i(TAG, "post submitted to API." + response.body().toString());
                }
            }

            @Override
            public void onFailure(retrofit2.Call<RegisterViewModel> call, Throwable t) {
                Log.e("Suresh", "Unable to submit post to API.");

            }
        });*/


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

    private void createApi()
    {
        ApiCall.postUserDetails(Constant.BASE_URL + Constant.ACCOUNT_URL, registerViewModel, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                System.out.println("response data === "+response.body().string());
                if(response.isSuccessful())
                {
                    System.out.println("response successful ");
                }

            }
        });
    }
}
