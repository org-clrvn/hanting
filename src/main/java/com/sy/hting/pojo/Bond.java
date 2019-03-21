package com.sy.hting.pojo;import org.springframework.format.annotation.DateTimeFormat;import java.util.Date;@SuppressWarnings("all")public class Bond {    private Date submitTime;// 提交申请时间    private String reviewNotes;// 审核备注    private Integer bondType;// 获取方式(1充值2线下充值)    private Float goldCoin;// 操作(-100|+100)    private Date completeTime;// 完成审核时间    private Integer auditStatus;// 审核状态(1待审核2审核成功3未通过)    private Integer bID;// 保证金id，主键    private Integer userID;// 用户ID    public Bond() {        super();    }    /**     * @param submitTime   提交申请时间     * @param reviewNotes  审核备注     * @param bondType     获取方式(1充值2线下充值)     * @param goldCoin     操作(-100|+100)     * @param completeTime 完成审核时间     * @param auditStatus  审核状态(1待审核2审核成功3未通过)     * @param bID          保证金id     * @param userID       用户ID     * @description: 含主键的构造函数     */    public Bond(Date submitTime, String reviewNotes, Integer bondType, Float goldCoin, Date completeTime, Integer auditStatus, Integer bID, Integer userID) {        super();        this.submitTime = submitTime;        this.reviewNotes = reviewNotes;        this.bondType = bondType;        this.goldCoin = goldCoin;        this.completeTime = completeTime;        this.auditStatus = auditStatus;        this.bID = bID;        this.userID = userID;    }    public Date getSubmitTime() {        return this.submitTime;    }    public void setSubmitTime(Date submitTime) {        this.submitTime = submitTime;    }    public String getReviewNotes() {        return this.reviewNotes;    }    public void setReviewNotes(String reviewNotes) {        this.reviewNotes = reviewNotes;    }    public Integer getBondType() {        return this.bondType;    }    public void setBondType(Integer bondType) {        this.bondType = bondType;    }    public Float getGoldCoin() {        return this.goldCoin;    }    public void setGoldCoin(Float goldCoin) {        this.goldCoin = goldCoin;    }    public Date getCompleteTime() {        return this.completeTime;    }    public void setCompleteTime(Date completeTime) {        this.completeTime = completeTime;    }    public Integer getAuditStatus() {        return this.auditStatus;    }    public void setAuditStatus(Integer auditStatus) {        this.auditStatus = auditStatus;    }    public Integer getBID() {        return this.bID;    }    public void setBID(Integer bID) {        this.bID = bID;    }    public Integer getUserID() {        return this.userID;    }    public void setUserID(Integer userID) {        this.userID = userID;    }}	