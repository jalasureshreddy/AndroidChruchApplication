package com.chruchapp.jalas.chruchapp.network;

import com.chruchapp.jalas.chruchapp.data.RegisterViewModel;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

public class ApiCall {

    public static OkHttpClient client = new OkHttpClient();
    public static final MediaType JSON
            = MediaType.parse("application/json; charset=utf-8");


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

    public static Call postUserDetails(String url, RegisterViewModel registerViewModel, Callback callback)
    {

       // RegisterViewModel registerViewModel = new RegisterViewModel();
        System.out.println("name === "+ registerViewModel.getName());
       /* RequestBody requestBody = new FormBody.Builder()
                .add("ChurchId","1")
                .add("Name", registerViewModel.getName())
                .add("Surname",registerViewModel.getSurname())
                .add("EmailAddress",registerViewModel.getEmailId())
                .add("Username",registerViewModel.getUserName())
                .add("Password",registerViewModel.getPassword())
                .add("ConfirmPassword",registerViewModel.getConfirmPassword())
                .add("PhoneNumber",registerViewModel.getPhoneNumber())
                .build();*/

        RequestBody requestBody = RequestBody.create(JSON, registerViewModel.toString());

        Request request = new Request.Builder()
                .url(url)
                .post(requestBody)
                .build();

        Call call = client.newCall(request);
        call.enqueue(callback);

        return call;

    }


}
