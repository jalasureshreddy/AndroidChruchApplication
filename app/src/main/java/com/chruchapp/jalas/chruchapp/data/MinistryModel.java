package com.chruchapp.jalas.chruchapp.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinistryModel
{
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("ministryName")
    @Expose
    private String ministryName;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("leader")
    @Expose
    private String leader;
    @SerializedName("maxMembers")
    @Expose
    private Integer maxMembers;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMinistryName() {
        return ministryName;
    }

    public void setMinistryName(String ministryName) {
        this.ministryName = ministryName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public Integer getMaxMembers() {
        return maxMembers;
    }

    public void setMaxMembers(Integer maxMembers) {
        this.maxMembers = maxMembers;
    }
}
