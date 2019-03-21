package com.sy.hting.pojo;import org.springframework.format.annotation.DateTimeFormat;import java.util.Date;@SuppressWarnings("all")public class Trusteeship {    private Date applicationTime;// 申请时间    private Date auditTime;// 审核时间    private Integer auditStatus;// 审核状态(1待审核2审核通过3拒绝)    private Integer truID;// 托管申请id，主键    private Integer trusteeshipMonth;// 托管月数    private Integer userID;// 外键，用户编号    public Trusteeship() {        super();    }    /**     * @param applicationTime  申请时间     * @param auditTime        审核时间     * @param auditStatus      审核状态(1待审核2审核通过3拒绝)     * @param truID            托管申请id     * @param trusteeshipMonth 托管月数     * @param userID           外键，用户编号     * @description: 含主键的构造函数     */    public Trusteeship(Date applicationTime, Date auditTime, Integer auditStatus, Integer truID, Integer trusteeshipMonth, Integer userID) {        super();        this.applicationTime = applicationTime;        this.auditTime = auditTime;        this.auditStatus = auditStatus;        this.truID = truID;        this.trusteeshipMonth = trusteeshipMonth;        this.userID = userID;    }    public Date getApplicationTime() {        return this.applicationTime;    }    public void setApplicationTime(Date applicationTime) {        this.applicationTime = applicationTime;    }    public Date getAuditTime() {        return this.auditTime;    }    public void setAuditTime(Date auditTime) {        this.auditTime = auditTime;    }    public Integer getAuditStatus() {        return this.auditStatus;    }    public void setAuditStatus(Integer auditStatus) {        this.auditStatus = auditStatus;    }    public Integer getTruID() {        return this.truID;    }    public void setTruID(Integer truID) {        this.truID = truID;    }    public Integer getTrusteeshipMonth() {        return this.trusteeshipMonth;    }    public void setTrusteeshipMonth(Integer trusteeshipMonth) {        this.trusteeshipMonth = trusteeshipMonth;    }    public Integer getUserID() {        return this.userID;    }    public void setUserID(Integer userID) {        this.userID = userID;    }}	