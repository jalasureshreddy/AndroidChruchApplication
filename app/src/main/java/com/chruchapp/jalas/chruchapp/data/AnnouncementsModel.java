package com.chruchapp.jalas.chruchapp.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AnnouncementsModel {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("churchId")
    @Expose
    private int churchId;
    @SerializedName("dtCreaated")
    @Expose
    private String dtCreaated;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("published")
    @Expose
    private boolean published;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getChurchId() {
        return churchId;
    }

    public void setChurchId(int churchId) {
        this.churchId = churchId;
    }

    public String getDtCreaated() {
        return dtCreaated;
    }

    public void setDtCreaated(String dtCreaated) {
        this.dtCreaated = dtCreaated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }
}
