package com.chruchapp.jalas.chruchapp.screens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.chruchapp.jalas.chruchapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.editprofile)
    public void editProfile()
    {
        Intent intent = new Intent(Dashboard.this,EditProfile.class);
        startActivity(intent);
    }
    @OnClick(R.id.makedonation)
    public void makeDonation()
    {
        Intent intent = new Intent(Dashboard.this,Donation.class);
        startActivity(intent);
    }

}
