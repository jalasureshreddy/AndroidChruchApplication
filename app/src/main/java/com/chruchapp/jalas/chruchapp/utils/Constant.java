package com.chruchapp.jalas.chruchapp.utils;

import com.chruchapp.jalas.chruchapp.network.APIService;
import com.chruchapp.jalas.chruchapp.network.RetrofitClient;

public class Constant {

    public static  final String BASE_URL = "http://apiwebanddata.azurewebsites.net/";
    public static  final String ACCOUNT_URL_LOGIN = "CheckUserForLogin/";
    public static  final String ACCOUNT_URL = "api/Account/";


    public static APIService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}
