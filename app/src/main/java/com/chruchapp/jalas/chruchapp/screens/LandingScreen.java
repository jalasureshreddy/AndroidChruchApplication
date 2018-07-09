package com.chruchapp.jalas.chruchapp.screens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.chruchapp.jalas.chruchapp.R;
import com.chruchapp.jalas.chruchapp.network.ApiCall;
import com.chruchapp.jalas.chruchapp.utils.Constant;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class LandingScreen extends AppCompatActivity {

    /*@BindView(R.id.aboutus) TextView aboutus;
    @BindView(R.id.visitorsform) TextView visitorsform;
    @BindView(R.id.cellgroup) TextView cellgroup;
    @BindView(R.id.becomemember) TextView becomemember;
    @BindView(R.id.aboutus) TextView aboutus;*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_screen);
        ButterKnife.bind(this);
        createApiCall();

    }

    private void createApiCall()
    {
        ApiCall.get(Constant.BASE_URL, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                if(response.isSuccessful())
                {
                    System.out.println("Response ==== "+response.body().string());
                }
            }
        });
    }

    @OnClick(R.id.becomemember)
    public void becomeMember()
    {
        Intent intent = new Intent(this,SignUpActivity.class);
        startActivity(intent);
    }
    @OnClick(R.id.aboutus)
    public void aboutUs()
    {

    }
    @OnClick(R.id.visitorsform)
    public void visitorsForm()
    {

    }
    @OnClick(R.id.cellgroup)
    public void cellGroup()
    {

    }
    @OnClick(R.id.giving)
    public void giving()
    {
        Intent intent = new Intent(this,Donation.class);
        startActivity(intent);
    }
    @OnClick(R.id.contactdetails)
    public void contactDetails()
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}
