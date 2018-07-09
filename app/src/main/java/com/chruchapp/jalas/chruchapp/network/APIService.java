package com.chruchapp.jalas.chruchapp.network;

import com.chruchapp.jalas.chruchapp.data.RegisterViewModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
  /*  @POST("api/Account/")
    @Headers({ "Content-Type: application/json;charset=UTF-8"})
    Call<RegisterViewModel> savePost(@Body RegisterViewModel post);*/

    @POST("api/Account/")
    @FormUrlEncoded
    Call<RegisterViewModel> savePost(@Field("ChurchId") int ChurchId,
                        @Field("Name") String Name,
                        @Field("Surname") String Surname,
                        @Field("EmailAddress") String EmailAddress,
                        @Field("Password") String Password,
                        @Field("PhoneNumber") String PhoneNumber,
                        @Field("ConfirmPassword") String ConfirmPassword);

}
