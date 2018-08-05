package com.chruchapp.jalas.chruchapp.data;

public class CellGroupModel {

    /**
     * id : 1
     * groupname : CellGroup1
     * address : Address
     * leader : X
     * membersLimit : 10
     * userId : 1
     * isActive : true
     * createdOn : 2018-06-07T21:01:41.653
     * updatedOn : 1900-01-01T00:00:00
     * churchUsers : null
     */

    private int id;
    private String groupname;
    private String address;
    private String leader;
    private int membersLimit;
    private String userId;
    private boolean isActive;
    private String createdOn;
    private String updatedOn;
    private Object churchUsers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public int getMembersLimit() {
        return membersLimit;
    }

    public void setMembersLimit(int membersLimit) {
        this.membersLimit = membersLimit;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(String updatedOn) {
        this.updatedOn = updatedOn;
    }

    public Object getChurchUsers() {
        return churchUsers;
    }

    public void setChurchUsers(Object churchUsers) {
        this.churchUsers = churchUsers;
    }
}
