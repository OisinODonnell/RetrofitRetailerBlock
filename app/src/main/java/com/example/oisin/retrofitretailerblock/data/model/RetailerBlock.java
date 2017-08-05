package com.example.oisin.retrofitretailerblock.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RetailerBlock {

    @SerializedName("retailerid")
    @Expose
    private int retailerid;
    @SerializedName("contentPage1")
    @Expose
    private String contentPage1;
    @SerializedName("contentPage2")
    @Expose
    private String contentPage2;
    @SerializedName("contentPage3")
    @Expose
    private String contentPage3;
    @SerializedName("loyaltyRewardImage")
    @Expose
    private String loyaltyRewardImage;
    @SerializedName("facebookUrl")
    @Expose
    private String facebookUrl;
    @SerializedName("headerBackgroundImage")
    @Expose
    private String headerBackgroundImage;
    @SerializedName("logoImage")
    @Expose
    private String logoImage;
    @SerializedName("managerid")
    @Expose
    private int managerid;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("shoppingCentreid")
    @Expose
    private int shoppingCentreid;
    @SerializedName("storeName")
    @Expose
    private String storeName;
    @SerializedName("twitterUrl")
    @Expose
    private String twitterUrl;
    @SerializedName("websiteUrl")
    @Expose
    private String websiteUrl;
    @SerializedName("zoneid")
    @Expose
    private Object zoneid;
//    @SerializedName("cEndDate")
//    @Expose
//    private Timestamp cEndDate;
//    @SerializedName("cStartDate")
//    @Expose
//    private Timestamp cStartDate;
//    @SerializedName("lrEndDate")
//    @Expose
//    private Timestamp lrEndDate;
    @SerializedName("lrPointsPerVisit")
    @Expose
    private int lrPointsPerVisit;
    @SerializedName("lrImage")
    @Expose
    private String lrImage;
    @SerializedName("lrTitle")
    @Expose
    private String lrTitle;
//    @SerializedName("lrStartDate")
//    @Expose
//    private int lrStartDate;
    @SerializedName("lrVisitTime")
    @Expose
    private int lrVisitTime;
    @SerializedName("upPoints")
    @Expose
    private int upPoints;

    public int getRetailerid() {
        return retailerid;
    }

    public void setRetailerid(int retailerid) {
        this.retailerid = retailerid;
    }

    public String getContentPage1() {
        return contentPage1;
    }

    public void setContentPage1(String contentPage1) {
        this.contentPage1 = contentPage1;
    }

    public String getContentPage2() {
        return contentPage2;
    }

    public void setContentPage2(String contentPage2) {
        this.contentPage2 = contentPage2;
    }

    public String getContentPage3() {
        return contentPage3;
    }

    public void setContentPage3(String contentPage3) {
        this.contentPage3 = contentPage3;
    }

    public String getLoyaltyRewardImage() {
        return loyaltyRewardImage;
    }

    public void setLoyaltyRewardImage(String loyaltyRewardImage) {
        this.loyaltyRewardImage = loyaltyRewardImage;
    }

    public String getFacebookUrl() {
        return facebookUrl;
    }

    public void setFacebookUrl(String facebookUrl) {
        this.facebookUrl = facebookUrl;
    }

    public String getHeaderBackgroundImage() {
        return headerBackgroundImage;
    }

    public void setHeaderBackgroundImage(String headerBackgroundImage) {
        this.headerBackgroundImage = headerBackgroundImage;
    }

    public String getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(String logoImage) {
        this.logoImage = logoImage;
    }

    public int getManagerid() {
        return managerid;
    }

    public void setManagerid(int managerid) {
        this.managerid = managerid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getShoppingCentreid() {
        return shoppingCentreid;
    }

    public void setShoppingCentreid(int shoppingCentreid) {
        this.shoppingCentreid = shoppingCentreid;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getTwitterUrl() {
        return twitterUrl;
    }

    public void setTwitterUrl(String twitterUrl) {
        this.twitterUrl = twitterUrl;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public Object getZoneid() {
        return zoneid;
    }

    public void setZoneid(Object zoneid) {
        this.zoneid = zoneid;
    }

//    public Object getCEndDate() {
//        return cEndDate;
//    }
//
//    public void setCEndDate(Timestamp cEndDate) {
//        this.cEndDate = cEndDate;
//    }
//
//    public Object getCStartDate() {
//        return cStartDate;
//    }
//
//    public void setCStartDate(Timestamp cStartDate) {
//        this.cStartDate = cStartDate;
//    }
//
//    public Timestamp getLrEndDate() {
//        return lrEndDate;
//    }
//
//    public void setLrEndDate(Timestamp lrEndDate) {
//        this.lrEndDate = lrEndDate;
//    }

    public int getLrPointsPerVisit() {
        return lrPointsPerVisit;
    }

    public void setLrPointsPerVisit(int lrPointsPerVisit) {
        this.lrPointsPerVisit = lrPointsPerVisit;
    }

    public String getLrImage() {
        return lrImage;
    }

    public void setLrImage(String lrImage) {
        this.lrImage = lrImage;
    }

    public String getLrTitle() {
        return lrTitle;
    }

    public void setLrTitle(String lrTitle) {
        this.lrTitle = lrTitle;
    }
//
//    public int getLrStartDate() {
//        return lrStartDate;
//    }
//
//    public void setLrStartDate(int lrStartDate) {
//        this.lrStartDate = lrStartDate;
//    }

    public int getLrVisitTime() {
        return lrVisitTime;
    }

    public void setLrVisitTime(int lrVisitTime) {
        this.lrVisitTime = lrVisitTime;
    }

    public int getUpPoints() {
        return upPoints;
    }

    public void setUpPoints(int upPoints) {
        this.upPoints = upPoints;
    }

}