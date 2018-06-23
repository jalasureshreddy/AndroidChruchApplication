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

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.user)
    EditText user;
    @BindView(R.id.pass)
    EditText pass;
    @BindView(R.id.login)
    TextView login;
    @BindView(R.id.signup)
    TextView signup;

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
        signup.setTypeface(custom_font);

    }

    @OnClick(R.id.signup)
    public void signUp()
    {
        Intent it = new Intent(MainActivity.this, SignUpActivity.class);
        startActivity(it);
    }
    @OnClick(R.id.login)
    public void login()
    {
        Intent intent = new Intent(MainActivity.this,Dashboard.class);
        startActivity(intent);
    }
}
