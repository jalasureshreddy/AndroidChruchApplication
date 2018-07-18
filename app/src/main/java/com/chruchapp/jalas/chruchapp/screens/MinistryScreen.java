package com.chruchapp.jalas.chruchapp.screens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.chruchapp.jalas.chruchapp.R;
import com.chruchapp.jalas.chruchapp.data.MinistryModel;
import com.chruchapp.jalas.chruchapp.network.APIService;
import com.chruchapp.jalas.chruchapp.network.ApiCall;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MinistryScreen extends AppCompatActivity {

    private APIService mAPIService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ministry_screen);

        mAPIService = ApiCall.getAPIService1();

        createApiCallRequest();
    }

    private void createApiCallRequest() {


        mAPIService.doGetListMinistry().enqueue(new Callback<MinistryModel>() {
            @Override
            public void onResponse(Call<MinistryModel> call, Response<MinistryModel> response) {

                System.out.println("response ==== "+response.body());
                if(response.isSuccessful())
                {
                    System.out.println("data ==== "+response.body().toString());
                }
            }

            @Override
            public void onFailure(Call<MinistryModel> call, Throwable t) {

                Log.e("Suresh", "Unable to submit post to API."+t.getMessage());
            }
        });

    }
}
