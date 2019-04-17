package com.sy.hting.vo.lzy;

import java.util.Date;

/**
 * @param
 * @author lizeyun
 * @return
 * @exception
 * @Time 2019/4/15 9:46
 */
public class SerUserSertypeVo {

    private int serviceID;

    private int stid;

    private int userID;

    private int resourceID;

    private String serviceTitle;

    private int auditStatus;

    private int shelfState;

    private Date releaseTime;

    private int recommendBool;

    private String userName;

    private String stName;

    private int sort;

    private String serviceCoverImg;

    private int servicePrice;

    private String serviceCostInclude;

    public String getServiceCoverImg() {
        return serviceCoverImg;
    }

    public void setServiceCoverImg(String serviceCoverImg) {
        this.serviceCoverImg = serviceCoverImg;
    }

    public int getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(int servicePrice) {
        this.servicePrice = servicePrice;
    }

    public String getServiceCostInclude() {
        return serviceCostInclude;
    }

    public void setServiceCostInclude(String serviceCostInclude) {
        this.serviceCostInclude = serviceCostInclude;
    }

    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public int getStid() {
        return stid;
    }

    public void setStid(int stid) {
        this.stid = stid;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getResourceID() {
        return resourceID;
    }

    public void setResourceID(int resourceID) {
        this.resourceID = resourceID;
    }

    public String getServiceTitle() {
        return serviceTitle;
    }

    public void setServiceTitle(String serviceTitle) {
        this.serviceTitle = serviceTitle;
    }

    public int getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(int auditStatus) {
        this.auditStatus = auditStatus;
    }

    public int getShelfState() {
        return shelfState;
    }

    public void setShelfState(int shelfState) {
        this.shelfState = shelfState;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public int getRecommendBool() {
        return recommendBool;
    }

    public void setRecommendBool(int recommendBool) {
        this.recommendBool = recommendBool;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public SerUserSertypeVo(){
        super();
    }

    public SerUserSertypeVo(int serviceID, int stid, int userID, int resourceID, String serviceTitle, int auditStatus, int shelfState, Date releaseTime, int recommendBool, String userName, String stName, int sort, String serviceCoverImg, int servicePrice, String serviceCostInclude) {
        this.serviceID = serviceID;
        this.stid = stid;
        this.userID = userID;
        this.resourceID = resourceID;
        this.serviceTitle = serviceTitle;
        this.auditStatus = auditStatus;
        this.shelfState = shelfState;
        this.releaseTime = releaseTime;
        this.recommendBool = recommendBool;
        this.userName = userName;
        this.stName = stName;
        this.sort = sort;
        this.serviceCoverImg = serviceCoverImg;
        this.servicePrice = servicePrice;
        this.serviceCostInclude = serviceCostInclude;
    }

    @Override
    public String toString() {
        return "SerUserSertypeVo{" +
                "serviceID=" + serviceID +
                ", stid=" + stid +
                ", userID=" + userID +
                ", resourceID=" + resourceID +
                ", serviceTitle='" + serviceTitle + '\'' +
                ", auditStatus=" + auditStatus +
                ", shelfState=" + shelfState +
                ", releaseTime=" + releaseTime +
                ", recommendBool=" + recommendBool +
                ", userName='" + userName + '\'' +
                ", stName='" + stName + '\'' +
                ", sort=" + sort +
                ", serviceCoverImg='" + serviceCoverImg + '\'' +
                ", servicePrice=" + servicePrice +
                ", serviceCostInclude='" + serviceCostInclude + '\'' +
                '}';
    }
}
