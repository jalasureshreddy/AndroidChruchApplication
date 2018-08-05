package com.chruchapp.jalas.chruchapp.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PaymentsModel {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("paymentReferene")
    @Expose
    private Object paymentReferene;
    @SerializedName("transactionReference")
    @Expose
    private Object transactionReference;
    @SerializedName("captureDate")
    @Expose
    private String captureDate;
    @SerializedName("amountPaid")
    @Expose
    private double amountPaid;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("paymentTypeId")
    @Expose
    private int paymentTypeId;
    @SerializedName("paymentTypes")
    @Expose
    private Object paymentTypes;
    @SerializedName("userId")
    @Expose
    private int userId;
    @SerializedName("users")
    @Expose
    private Object users;
    @SerializedName("productId")
    @Expose
    private int productId;
    @SerializedName("products")
    @Expose
    private Object products;
    @SerializedName("churchId")
    @Expose
    private int churchId;
    @SerializedName("churches")
    @Expose
    private Object churches;
    @SerializedName("isCompleted")
    @Expose
    private boolean isCompleted;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getPaymentReferene() {
        return paymentReferene;
    }

    public void setPaymentReferene(Object paymentReferene) {
        this.paymentReferene = paymentReferene;
    }

    public Object getTransactionReference() {
        return transactionReference;
    }

    public void setTransactionReference(Object transactionReference) {
        this.transactionReference = transactionReference;
    }

    public String getCaptureDate() {
        return captureDate;
    }

    public void setCaptureDate(String captureDate) {
        this.captureDate = captureDate;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(int paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public Object getPaymentTypes() {
        return paymentTypes;
    }

    public void setPaymentTypes(Object paymentTypes) {
        this.paymentTypes = paymentTypes;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Object getUsers() {
        return users;
    }

    public void setUsers(Object users) {
        this.users = users;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Object getProducts() {
        return products;
    }

    public void setProducts(Object products) {
        this.products = products;
    }

    public int getChurchId() {
        return churchId;
    }

    public void setChurchId(int churchId) {
        this.churchId = churchId;
    }

    public Object getChurches() {
        return churches;
    }

    public void setChurches(Object churches) {
        this.churches = churches;
    }

    public boolean isIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

}
