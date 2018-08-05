package com.chruchapp.jalas.chruchapp.network;

import com.chruchapp.jalas.chruchapp.utils.Constant;

public class ApiCall {

    public static APIService getAPIService() {
        return RetrofitClient.getClient(Constant.BASE_URL).create(APIService.class);
    }
}
