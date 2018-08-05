package com.chruchapp.jalas.chruchapp.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SermonsModel {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("sermonname")
    @Expose
    private String sermonname;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("videoFile")
    @Expose
    private String videoFile;
    @SerializedName("speaker")
    @Expose
    private String speaker;
    @SerializedName("dateOfEvent")
    @Expose
    private String dateOfEvent;
    @SerializedName("dtCreated")
    @Expose
    private String dtCreated;
    @SerializedName("churchId")
    @Expose
    private int churchId;
    @SerializedName("published")
    @Expose
    private boolean published;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSermonname() {
        return sermonname;
    }

    public void setSermonname(String sermonname) {
        this.sermonname = sermonname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVideoFile() {
        return videoFile;
    }

    public void setVideoFile(String videoFile) {
        this.videoFile = videoFile;
    }

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public String getDateOfEvent() {
        return dateOfEvent;
    }

    public void setDateOfEvent(String dateOfEvent) {
        this.dateOfEvent = dateOfEvent;
    }

    public String getDtCreated() {
        return dtCreated;
    }

    public void setDtCreated(String dtCreated) {
        this.dtCreated = dtCreated;
    }

    public int getChurchId() {
        return churchId;
    }

    public void setChurchId(int churchId) {
        this.churchId = churchId;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }
}
