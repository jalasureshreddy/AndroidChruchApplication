package com.chruchapp.jalas.chruchapp.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChurchModel {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("churchName")
    @Expose
    private String churchName;
    @SerializedName("churchDescription")
    @Expose
    private String churchDescription;
    @SerializedName("dtCreated")
    @Expose
    private String dtCreated;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChurchName() {
        return churchName;
    }

    public void setChurchName(String churchName) {
        this.churchName = churchName;
    }

    public String getChurchDescription() {
        return churchDescription;
    }

    public void setChurchDescription(String churchDescription) {
        this.churchDescription = churchDescription;
    }

    public String getDtCreated() {
        return dtCreated;
    }

    public void setDtCreated(String dtCreated) {
        this.dtCreated = dtCreated;
    }
}
