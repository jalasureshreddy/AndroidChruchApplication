package com.chruchapp.jalas.chruchapp.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EventsModel {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("eventName")
    @Expose
    private String eventName;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("eventDate")
    @Expose
    private String eventDate;
    @SerializedName("lastDateForRegistration")
    @Expose
    private String lastDateForRegistration;
    @SerializedName("venue")
    @Expose
    private String venue;
    @SerializedName("registrationAmount")
    @Expose
    private double registrationAmount;
    @SerializedName("hostingDepartment")
    @Expose
    private String hostingDepartment;
    @SerializedName("targetAudience")
    @Expose
    private String targetAudience;
    @SerializedName("eventSpeakers")
    @Expose
    private String eventSpeakers;
    @SerializedName("keyNoteSpeaker")
    @Expose
    private String keyNoteSpeaker;
    @SerializedName("published")
    @Expose
    private boolean published;
    @SerializedName("created")
    @Expose
    private String created;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getLastDateForRegistration() {
        return lastDateForRegistration;
    }

    public void setLastDateForRegistration(String lastDateForRegistration) {
        this.lastDateForRegistration = lastDateForRegistration;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public double getRegistrationAmount() {
        return registrationAmount;
    }

    public void setRegistrationAmount(double registrationAmount) {
        this.registrationAmount = registrationAmount;
    }

    public String getHostingDepartment() {
        return hostingDepartment;
    }

    public void setHostingDepartment(String hostingDepartment) {
        this.hostingDepartment = hostingDepartment;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public String getEventSpeakers() {
        return eventSpeakers;
    }

    public void setEventSpeakers(String eventSpeakers) {
        this.eventSpeakers = eventSpeakers;
    }

    public String getKeyNoteSpeaker() {
        return keyNoteSpeaker;
    }

    public void setKeyNoteSpeaker(String keyNoteSpeaker) {
        this.keyNoteSpeaker = keyNoteSpeaker;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

}
