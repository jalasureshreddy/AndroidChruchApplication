package com.chruchapp.jalas.chruchapp.data;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataModelLogin implements Parcelable{


   /* public DataModelLogin(Integer id, String name, String surname, String knownAs,
                          String gender, Integer age, String emailAddress, String mobileNumber,
                          String address, String profession, String interests, String otherActivities,
                          String dtCreated, String username, String password, Integer churchId, Object church, Integer userStatusId, Object userStatus,
                          Integer cellGroupId, Object cellGroup, Integer ministryId, Object ministry, Integer branchId, Object branch) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.knownAs = knownAs;
        this.gender = gender;
        this.age = age;
        this.emailAddress = emailAddress;
        this.mobileNumber = mobileNumber;
        this.address = address;
        this.profession = profession;
        this.interests = interests;
        this.otherActivities = otherActivities;
        this.dtCreated = dtCreated;
        this.username = username;
        this.password = password;
        this.churchId = churchId;
        this.church = church;
        this.userStatusId = userStatusId;
        this.userStatus = userStatus;
        this.cellGroupId = cellGroupId;
        this.cellGroup = cellGroup;
        this.ministryId = ministryId;
        this.ministry = ministry;
        this.branchId = branchId;
        this.branch = branch;
    }*/

    /**
     * id : 4

     * name : Srinivas
     * surname : D
     * knownAs : Srinivas
     * gender : UnKnown
     * age : 2
     * emailAddress : sdonthula@live.com
     * mobileNumber : 07645555555
     * address : dsaf
     * profession : adsf
     * interests : kdasfh
     * otherActivities : dfff,xyz
     * dtCreated : 2018-06-23T20:30:07.057865
     * username : Srini123
     * password : Asmitha@21
     * churchId : 1
     * church : null
     * userStatusId : 1
     * userStatus : null
     * cellGroupId : 1
     * cellGroup : null
     * ministryId : 1
     * ministry : null
     * branchId : 1
     * branch : null
     */

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("surname")
    @Expose
    private String surname;
    @SerializedName("knownAs")
    @Expose
    private String knownAs;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("age")
    @Expose
    private Integer age;
    @SerializedName("emailAddress")
    @Expose
    private String emailAddress;
    @SerializedName("mobileNumber")
    @Expose
    private String mobileNumber;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("profession")
    @Expose
    private String profession;
    @SerializedName("interests")
    @Expose
    private String interests;
    @SerializedName("otherActivities")
    @Expose
    private String otherActivities;
   /* @SerializedName("dtCreated")
    @Expose
    private String dtCreated;*/
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("churchId")
    @Expose
    private Integer churchId;
    @SerializedName("church")
    @Expose
    private Object church;
    @SerializedName("userStatusId")
    @Expose
    private Integer userStatusId;
    @SerializedName("userStatus")
    @Expose
    private Object userStatus;
    @SerializedName("cellGroupId")
    @Expose
    private Integer cellGroupId;
    @SerializedName("cellGroup")
    @Expose
    private Object cellGroup;
    @SerializedName("ministryId")
    @Expose
    private Integer ministryId;
    @SerializedName("ministry")
    @Expose
    private Object ministry;
    @SerializedName("branchId")
    @Expose
    private Integer branchId;
    @SerializedName("branch")
    @Expose
    private Object branch;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getKnownAs() {
        return knownAs;
    }

    public void setKnownAs(String knownAs) {
        this.knownAs = knownAs;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public String getOtherActivities() {
        return otherActivities;
    }

    public void setOtherActivities(String otherActivities) {
        this.otherActivities = otherActivities;
    }

   /* public String getDtCreated() {
        return dtCreated;
    }

    public void setDtCreated(String dtCreated) {
        this.dtCreated = dtCreated;
    }*/

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getChurchId() {
        return churchId;
    }

    public void setChurchId(Integer churchId) {
        this.churchId = churchId;
    }

    public Object getChurch() {
        return church;
    }

    public void setChurch(Object church) {
        this.church = church;
    }

    public Integer getUserStatusId() {
        return userStatusId;
    }

    public void setUserStatusId(Integer userStatusId) {
        this.userStatusId = userStatusId;
    }

    public Object getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Object userStatus) {
        this.userStatus = userStatus;
    }

    public Integer getCellGroupId() {
        return cellGroupId;
    }

    public void setCellGroupId(Integer cellGroupId) {
        this.cellGroupId = cellGroupId;
    }

    public Object getCellGroup() {
        return cellGroup;
    }

    public void setCellGroup(Object cellGroup) {
        this.cellGroup = cellGroup;
    }

    public Integer getMinistryId() {
        return ministryId;
    }

    public void setMinistryId(Integer ministryId) {
        this.ministryId = ministryId;
    }

    public Object getMinistry() {
        return ministry;
    }

    public void setMinistry(Object ministry) {
        this.ministry = ministry;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public Object getBranch() {
        return branch;
    }

    public void setBranch(Object branch) {
        this.branch = branch;
    }

    @Override
    public int describeContents() {
        return hashCode();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

        parcel.writeInt(id);
        parcel.writeString(name);
        parcel.writeString(surname);
        parcel.writeString(knownAs);
        parcel.writeString(gender);
        parcel.writeInt(age);
        parcel.writeString(emailAddress);
        parcel.writeString(mobileNumber);
        parcel.writeString(address);
        parcel.writeString(profession);
        parcel.writeString(interests);
        parcel.writeString(otherActivities);

        parcel.writeString(username);
        parcel.writeString(password);
        parcel.writeInt(churchId);
        parcel.writeValue(church);
        parcel.writeInt(userStatusId);
        parcel.writeValue(userStatus);
        parcel.writeInt(cellGroupId);
        parcel.writeValue(cellGroup);
        parcel.writeInt(ministryId);
        parcel.writeValue(ministry);
        parcel.writeInt(branchId);
        parcel.writeValue(branch);
    }

    public DataModelLogin(Parcel parcel) {
        id = parcel.readInt();
        name = parcel.readString();
        surname = parcel.readString();
        knownAs = parcel.readString();
        gender = parcel.readString();
        age = parcel.readInt();
        emailAddress =   parcel.readString();
        mobileNumber = parcel.readString();
        address = parcel.readString();
        profession = parcel.readString();
        interests = parcel.readString();
        otherActivities = parcel.readString();
        username = parcel.readString();
        password = parcel.readString();
        churchId = parcel.readInt();
        church = parcel.readString();
        userStatusId = parcel.readInt();
        userStatus = parcel.readString();
        cellGroupId = parcel.readInt();
        cellGroup = parcel.readString();
        ministryId = parcel.readInt();
        ministry =   parcel.readString();
        branchId = parcel.readInt();
        branch =   parcel.readString();
    }

    public static final Parcelable.Creator<DataModelLogin> CREATOR = new Parcelable.Creator<DataModelLogin>() {

        @Override
        public DataModelLogin createFromParcel(Parcel parcel) {
            return new DataModelLogin(parcel);
        }

        @Override
        public DataModelLogin[] newArray(int size) {
            return new DataModelLogin[0];
        }
    };


}
