package com.sy.hting.vo.lzy;

import java.util.Date;

/**
 * @param
 * @author lizeyun
 * @return
 * @exception
 * @Time 2019/5/14 15:14
 */
public class EvaUserSerVo {
    private Integer serviceAppraiseID;// 商品(服务)评价id，主键

    private Date serviceAppraiseDate;// 评价时间

    private String serviceAppraiseContent;// 内容

    private Integer serviceID;// 服务编号，外键，引用服务表

    private Integer userID;// 用户编号，外键，引用用户表

    private Integer serviceAppraiseLevel;// 星级

    private Integer serviceAppraisePID;// 上级编号，0：表示评价，其他：回复评价

    private String userImgPath;

    private Integer userName;

    private String serviceTitle;

    public Integer getServiceAppraiseID() {
        return serviceAppraiseID;
    }

    public void setServiceAppraiseID(Integer serviceAppraiseID) {
        this.serviceAppraiseID = serviceAppraiseID;
    }

    public Date getServiceAppraiseDate() {
        return serviceAppraiseDate;
    }

    public void setServiceAppraiseDate(Date serviceAppraiseDate) {
        this.serviceAppraiseDate = serviceAppraiseDate;
    }

    public String getServiceAppraiseContent() {
        return serviceAppraiseContent;
    }

    public void setServiceAppraiseContent(String serviceAppraiseContent) {
        this.serviceAppraiseContent = serviceAppraiseContent;
    }

    public Integer getServiceID() {
        return serviceID;
    }

    public void setServiceID(Integer serviceID) {
        this.serviceID = serviceID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getServiceAppraiseLevel() {
        return serviceAppraiseLevel;
    }

    public void setServiceAppraiseLevel(Integer serviceAppraiseLevel) {
        this.serviceAppraiseLevel = serviceAppraiseLevel;
    }

    public Integer getServiceAppraisePID() {
        return serviceAppraisePID;
    }

    public void setServiceAppraisePID(Integer serviceAppraisePID) {
        this.serviceAppraisePID = serviceAppraisePID;
    }

    public String getUserImgPath() {
        return userImgPath;
    }

    public void setUserImgPath(String userImgPath) {
        this.userImgPath = userImgPath;
    }

    public Integer getUserName() {
        return userName;
    }

    public void setUserName(Integer userName) {
        this.userName = userName;
    }

    public String getServiceTitle() {
        return serviceTitle;
    }

    public void setServiceTitle(String serviceTitle) {
        this.serviceTitle = serviceTitle;
    }

    public EvaUserSerVo(){ super(); }

    public EvaUserSerVo(Integer serviceAppraiseID, Date serviceAppraiseDate, String serviceAppraiseContent, Integer serviceID, Integer userID, Integer serviceAppraiseLevel, Integer serviceAppraisePID, String userImgPath, Integer userName, String serviceTitle) {
        this.serviceAppraiseID = serviceAppraiseID;
        this.serviceAppraiseDate = serviceAppraiseDate;
        this.serviceAppraiseContent = serviceAppraiseContent;
        this.serviceID = serviceID;
        this.userID = userID;
        this.serviceAppraiseLevel = serviceAppraiseLevel;
        this.serviceAppraisePID = serviceAppraisePID;
        this.userImgPath = userImgPath;
        this.userName = userName;
        this.serviceTitle = serviceTitle;
    }

    @Override
    public String toString() {
        return "EvaUserSerVo{" +
                "serviceAppraiseID=" + serviceAppraiseID +
                ", serviceAppraiseDate=" + serviceAppraiseDate +
                ", serviceAppraiseContent='" + serviceAppraiseContent + '\'' +
                ", serviceID=" + serviceID +
                ", userID=" + userID +
                ", serviceAppraiseLevel=" + serviceAppraiseLevel +
                ", serviceAppraisePID=" + serviceAppraisePID +
                ", userImgPath='" + userImgPath + '\'' +
                ", userName=" + userName +
                ", serviceTitle='" + serviceTitle + '\'' +
                '}';
    }
}
