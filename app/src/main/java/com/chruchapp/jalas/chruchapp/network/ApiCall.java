package com.chruchapp.jalas.chruchapp.network;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

public class ApiCall {

    public static OkHttpClient client = new OkHttpClient();

    //Creating api request
    public static Call get(String url, Callback callback)
    {
        Request request = new Request.Builder()
                              .url(url)
                              .build();

        Call call = client.newCall(request);
        call.enqueue(callback);

        return call;
    }
    //posting to api
    public static Call post(String url, String userName, String password, Callback callback)
    {

        RequestBody requestBody = new FormBody.Builder()
                                      .add("username",userName)
                                      .add("password",password)
                                      .build();

        Request request = new Request.Builder()
                              .url(url)
                              .post(requestBody)
                              .build();

        Call call = client.newCall(request);
        call.enqueue(callback);

        return call;
    }


}
