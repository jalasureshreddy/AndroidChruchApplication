package com.chruchapp.jalas.chruchapp.screens;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.chruchapp.jalas.chruchapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        ButterKnife.bind(this);

        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/LatoLight.ttf");

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
        Intent it = new Intent(SignUpActivity.this,MainActivity.class);
        startActivity(it);
    }
}
