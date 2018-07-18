package com.chruchapp.jalas.chruchapp.network;

import com.chruchapp.jalas.chruchapp.data.DataModelLogin;
import com.chruchapp.jalas.chruchapp.data.DataModelUpdate;
import com.chruchapp.jalas.chruchapp.data.MinistryModel;
import com.chruchapp.jalas.chruchapp.data.RegisterViewModel;
import com.chruchapp.jalas.chruchapp.utils.Constant;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface APIService {
    @POST("api/Account/")
    @Headers({ "Content-Type: application/json;charset=UTF-8"})
    Call<RegisterViewModel> savePost(@Body RegisterViewModel post);

   /* @POST("api/Account/")
    @FormUrlEncoded
    Call<RegisterViewModel> savePost(@Field("ChurchId") int ChurchId,
                        @Field("Name") String Name,
                        @Field("Surname") String Surname,
                        @Field("EmailAddress") String EmailAddress,
                        @Field("Password") String Password,
                        @Field("PhoneNumber") String PhoneNumber,
                        @Field("ConfirmPassword") String ConfirmPassword);*/

    @GET(Constant.ACCOUNT_URL+Constant.ACCOUNT_URL_LOGIN+"{employeeCode}/{password}")
     Call<DataModelLogin> login(@Path("employeeCode") String employeeCode, @Path("password") String password);


   /* @POST("api/Account/")
    @FormUrlEncoded
    Call<DataModelUpdate> savePostUpdate(
            @Field("Id") int Id,
            @Field("Name") String Name,
            @Field("Surname") String Surname,
            @Field("KnownAs") String KnownAs,
            @Field("Gender") String Gender,
            @Field("Age") int Age,
            @Field("EmailAddress") String EmailAddress,
            @Field("MobileNumber") String MobileNumber,
            @Field("Address") String Address,
            @Field("Profession") String Profession,
            @Field("Interests") String Interests,
            @Field("OtherActivities") String OtherActivities,
            @Field("Username") String Username,
            @Field("Password") String Password,
            @Field("ChurchId") int ChurchId,
            @Field("UserStatusId") int UserStatusId,
            @Field("CellGroupId") int CellGroupId,
            @Field("MinistryId") int MinistryId,
            @Field("BranchId") int BranchId);*/

    @PUT("api/Account/")
    @Headers({ "Content-Type: application/json;charset=UTF-8"})
    Call<DataModelUpdate> savePostUpdate(@Body DataModelUpdate post);


    @POST(Constant.MINISTRIES_URL)
    Call<MinistryModel> doGetListMinistry();

}
