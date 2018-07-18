package com.chruchapp.jalas.chruchapp.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataModelUpdate {

    @SerializedName("Id")
    @Expose
    private int Id;
    @SerializedName("Name")
    @Expose
    private String Name;
    @SerializedName("Surname")
    @Expose
    private String Surname;
    @SerializedName("KnownAs")
    @Expose
    private String KnownAs;
    @SerializedName("Gender")
    @Expose
    private String Gender;
    @SerializedName("Age")
    @Expose
    private int Age;
    @SerializedName("EmailAddress")
    @Expose
    private String EmailAddress;
    @SerializedName("MobileNumber")
    @Expose
    private String MobileNumber;
    @SerializedName("Address")
    @Expose
    private String Address;
    @SerializedName("Profession")
    @Expose
    private String Profession;
    @SerializedName("Interests")
    @Expose
    private String Interests;
    @SerializedName("OtherActivities")
    @Expose
    private String OtherActivities;
    @SerializedName("Username")
    @Expose
    private String Username;
    @SerializedName("Password")
    @Expose
    private String Password;
    @SerializedName("ChurchId")
    @Expose
    private int ChurchId;
    @SerializedName("UserStatusId")
    @Expose
    private int UserStatusId;
    @SerializedName("CellGroupId")
    @Expose
    private int CellGroupId;
    @SerializedName("MinistryId")
    @Expose
    private int MinistryId;
    @SerializedName("BranchId")
    @Expose
    private int BranchId;
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
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

    public String getKnownAs() {
        return KnownAs;
    }

    public void setKnownAs(String knownAs) {
        this.KnownAs = knownAs;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        this.Gender = gender;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.EmailAddress = emailAddress;
    }

    public String getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.MobileNumber = mobileNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getProfession() {
        return Profession;
    }

    public void setProfession(String profession) {
        this.Profession = profession;
    }

    public String getInterests() {
        return Interests;
    }

    public void setInterests(String interests) {
        this.Interests = interests;
    }

    public String getOtherActivities() {
        return OtherActivities;
    }

    public void setOtherActivities(String otherActivities) {
        this.OtherActivities = otherActivities;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        this.Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public int getChurchId() {
        return ChurchId;
    }

    public void setChurchId(int churchId) {
        this.ChurchId = churchId;
    }


    public int getUserStatusId() {
        return UserStatusId;
    }

    public void setUserStatusId(int userStatusId) {
        this.UserStatusId = userStatusId;
    }

    public int getCellGroupId() {
        return CellGroupId;
    }

    public void setCellGroupId(int cellGroupId) {
        this.CellGroupId = cellGroupId;
    }
    public int getMinistryId() {
        return MinistryId;
    }

    public void setMinistryId(int ministryId) {
        this.MinistryId = ministryId;
    }

    public int getBranchId() {
        return BranchId;
    }

    public void setBranchId(int branchId) {
        this.BranchId = branchId;
    }

    @Override
    public String toString() {
        return "DataModelUpdate{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", KnownAs='" + KnownAs + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Age=" + Age +
                ", EmailAddress='" + EmailAddress + '\'' +
                ", MobileNumber='" + MobileNumber + '\'' +
                ", Address='" + Address + '\'' +
                ", Profession='" + Profession + '\'' +
                ", Interests='" + Interests + '\'' +
                ", OtherActivities='" + OtherActivities + '\'' +
                ", Username='" + Username + '\'' +
                ", Password='" + Password + '\'' +
                ", ChurchId=" + ChurchId +
                ", UserStatusId=" + UserStatusId +
                ", CellGroupId=" + CellGroupId +
                ", MinistryId=" + MinistryId +
                ", BranchId=" + BranchId +
                '}';
    }

}
