package com.chruchapp.jalas.chruchapp.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RegisterViewModel
{
    @SerializedName("ChurchId")
    @Expose
    private int ChurchId;
    @SerializedName("Name")
    @Expose
    private String Name;
    @SerializedName("Surname")
    @Expose
    private String Surname;
    @SerializedName("EmailAddress")
    @Expose
    private String EmailAddress;
    @SerializedName("Username")
    @Expose
    private String Username;
    @SerializedName("Password")
    @Expose
    private String Password;
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;
    @SerializedName("ConfirmPassword")
    @Expose
    private String ConfirmPassword;

    public String getConfirmPassword()
    {
        return ConfirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.ConfirmPassword = confirmPassword;
    }


    public int getChurchId() {
        return ChurchId;
    }

    public void setChurchId(int churchId) {
        ChurchId = churchId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        this.Surname = surname;
    }

    public String getEmailId() {
        return EmailAddress;
    }

    public void setEmailId(String emailId) {
        this.EmailAddress = emailId;
    }

    public String getUserName() {
        return Username;
    }

    public void setUserName(String userName) {
        this.Username = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "RegisterViewModel{" +
                "ChurchId=" + ChurchId +
                ", Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", EmailAddress='" + EmailAddress + '\'' +
                ", Username='" + Username + '\'' +
                ", Password='" + Password + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", ConfirmPassword='" + ConfirmPassword + '\'' +
                '}';
    }

}
