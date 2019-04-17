package com.sy.hting.vo.lzy;

import java.util.Date;

/**
 * @param
 * @author lizeyun
 * @return
 * @exception
 * @Time 2019/4/16 0:41
 */
public class UserOrderServicesRefundVo {

    private int userID;

    private String userName;

    private String orderID;

    private int serviceID;

    private int refundID;

    private Date applicationTime;

    private String serviceTitle;

    private float applyRefundMoney;

    private int orderStatus;

    private Date auditTime;

    private String remarks;

    private float totalPrice;

    private String refundReason;

    private String refundImg;

    private int refundstatus;

    private String businessRemarks;

    private float actualRefundMoney;

    private int adminStatus;

    private String adminRemarks;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public int getRefundID() {
        return refundID;
    }

    public void setRefundID(int refundID) {
        this.refundID = refundID;
    }

    public Date getApplicationTime() {
        return applicationTime;
    }

    public void setApplicationTime(Date applicationTime) {
        this.applicationTime = applicationTime;
    }

    public String getServiceTitle() {
        return serviceTitle;
    }

    public void setServiceTitle(String serviceTitle) {
        this.serviceTitle = serviceTitle;
    }

    public float getApplyRefundMoney() {
        return applyRefundMoney;
    }

    public void setApplyRefundMoney(float applyRefundMoney) {
        this.applyRefundMoney = applyRefundMoney;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    public String getRefundImg() {
        return refundImg;
    }

    public void setRefundImg(String refundImg) {
        this.refundImg = refundImg;
    }

    public int getRefundstatus() {
        return refundstatus;
    }

    public void setRefundstatus(int refundstatus) {
        this.refundstatus = refundstatus;
    }

    public String getBusinessRemarks() {
        return businessRemarks;
    }

    public void setBusinessRemarks(String businessRemarks) {
        this.businessRemarks = businessRemarks;
    }

    public float getActualRefundMoney() {
        return actualRefundMoney;
    }

    public void setActualRefundMoney(float actualRefundMoney) {
        this.actualRefundMoney = actualRefundMoney;
    }

    public int getAdminStatus() {
        return adminStatus;
    }

    public void setAdminStatus(int adminStatus) {
        this.adminStatus = adminStatus;
    }

    public String getAdminRemarks() {
        return adminRemarks;
    }

    public void setAdminRemarks(String adminRemarks) {
        this.adminRemarks = adminRemarks;
    }

    public UserOrderServicesRefundVo(int userID, String userName, String orderID, int serviceID, int refundID, Date applicationTime, String serviceTitle, float applyRefundMoney, int orderStatus, Date auditTime, String remarks, float totalPrice, String refundReason, String refundImg, int refundstatus, String businessRemarks, float actualRefundMoney, int adminStatus, String adminRemarks) {
        this.userID = userID;
        this.userName = userName;
        this.orderID = orderID;
        this.serviceID = serviceID;
        this.refundID = refundID;
        this.applicationTime = applicationTime;
        this.serviceTitle = serviceTitle;
        this.applyRefundMoney = applyRefundMoney;
        this.orderStatus = orderStatus;
        this.auditTime = auditTime;
        this.remarks = remarks;
        this.totalPrice = totalPrice;
        this.refundReason = refundReason;
        this.refundImg = refundImg;
        this.refundstatus = refundstatus;
        this.businessRemarks = businessRemarks;
        this.actualRefundMoney = actualRefundMoney;
        this.adminStatus = adminStatus;
        this.adminRemarks = adminRemarks;
    }

    public UserOrderServicesRefundVo() {
        super();
    }

    @Override
    public String toString() {
        return "UserOrderServicesRefundVo{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", orderID='" + orderID + '\'' +
                ", serviceID=" + serviceID +
                ", refundID=" + refundID +
                ", applicationTime=" + applicationTime +
                ", serviceTitle='" + serviceTitle + '\'' +
                ", applyRefundMoney=" + applyRefundMoney +
                ", orderStatus=" + orderStatus +
                ", auditTime=" + auditTime +
                ", remarks='" + remarks + '\'' +
                ", totalPrice=" + totalPrice +
                ", refundReason='" + refundReason + '\'' +
                ", refundImg='" + refundImg + '\'' +
                ", refundstatus=" + refundstatus +
                ", businessRemarks='" + businessRemarks + '\'' +
                ", actualRefundMoney=" + actualRefundMoney +
                ", adminStatus=" + adminStatus +
                ", adminRemarks='" + adminRemarks + '\'' +
                '}';
    }
}
