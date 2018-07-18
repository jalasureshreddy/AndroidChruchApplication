package com.chruchapp.jalas.chruchapp.network;

import com.chruchapp.jalas.chruchapp.utils.Constant;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiCall {

    public static APIService getAPIService() {
        return RetrofitClient.getClient(Constant.BASE_URL).create(APIService.class);
    }

    public static APIService getAPIService1() {


       return new Retrofit.Builder()
                .baseUrl(Constant.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(APIService.class);
    }
}
