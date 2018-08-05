package com.chruchapp.jalas.chruchapp.data;

public class MembersModel
{
    private int id;
    private String name;
    private String surname;
    private String knownAs;
    private String gender;
    private int age;
    private String emailAddress;
    private String mobileNumber;
    private String address;
    private String profession;
    private String interests;
    private String otherActivities;
    private String dtCreated;
    private String username;
    private String password;
    private int churchId;
    private ChurchBean church;
    private int userStatusId;
    private Object userStatus;
    private int cellGroupId;
    private Object cellGroup;
    private int ministryId;
    private Object ministry;
    private int branchId;
    private Object branch;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
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

    public String getDtCreated() {
        return dtCreated;
    }

    public void setDtCreated(String dtCreated) {
        this.dtCreated = dtCreated;
    }

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

    public int getChurchId() {
        return churchId;
    }

    public void setChurchId(int churchId) {
        this.churchId = churchId;
    }

    public ChurchBean getChurch() {
        return church;
    }

    public void setChurch(ChurchBean church) {
        this.church = church;
    }

    public int getUserStatusId() {
        return userStatusId;
    }

    public void setUserStatusId(int userStatusId) {
        this.userStatusId = userStatusId;
    }

    public Object getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Object userStatus) {
        this.userStatus = userStatus;
    }

    public int getCellGroupId() {
        return cellGroupId;
    }

    public void setCellGroupId(int cellGroupId) {
        this.cellGroupId = cellGroupId;
    }

    public Object getCellGroup() {
        return cellGroup;
    }

    public void setCellGroup(Object cellGroup) {
        this.cellGroup = cellGroup;
    }

    public int getMinistryId() {
        return ministryId;
    }

    public void setMinistryId(int ministryId) {
        this.ministryId = ministryId;
    }

    public Object getMinistry() {
        return ministry;
    }

    public void setMinistry(Object ministry) {
        this.ministry = ministry;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public Object getBranch() {
        return branch;
    }

    public void setBranch(Object branch) {
        this.branch = branch;
    }

    public static class ChurchBean {
        /**
         * id : 1
         * churchName : Test Church
         * churchDescription : church
         * dtCreated : 2018-06-23T20:06:13.043
         */

        private int id;
        private String churchName;
        private String churchDescription;
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
}
