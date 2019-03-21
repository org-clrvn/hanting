package com.sy.hting.pojo;import org.springframework.format.annotation.DateTimeFormat;import java.util.Date;@SuppressWarnings("all")public class Putforwardrecord {    private String bankAccount;// 银行账号    private String adminOpinion;// 审批备注    private Integer bankID;// 外键，银行类别    private Date submitTime;// 提交申请时间    private Float money;// 提现金额    private Date completeTime;// 完成审核时间    private Integer pfrID;// 提现记录id，主键    private Integer userID;// 外键，用户ID    public Putforwardrecord() {        super();    }    /**     * @param bankAccount  银行账号     * @param adminOpinion 审批备注     * @param bankID       外键，银行类别     * @param submitTime   提交申请时间     * @param money        提现金额     * @param completeTime 完成审核时间     * @param pfrID        提现记录id     * @param userID       外键，用户ID     * @description: 含主键的构造函数     */    public Putforwardrecord(String bankAccount, String adminOpinion, Integer bankID, Date submitTime, Float money, Date completeTime, Integer pfrID, Integer userID) {        super();        this.bankAccount = bankAccount;        this.adminOpinion = adminOpinion;        this.bankID = bankID;        this.submitTime = submitTime;        this.money = money;        this.completeTime = completeTime;        this.pfrID = pfrID;        this.userID = userID;    }    public String getBankAccount() {        return this.bankAccount;    }    public void setBankAccount(String bankAccount) {        this.bankAccount = bankAccount;    }    public String getAdminOpinion() {        return this.adminOpinion;    }    public void setAdminOpinion(String adminOpinion) {        this.adminOpinion = adminOpinion;    }    public Integer getBankID() {        return this.bankID;    }    public void setBankID(Integer bankID) {        this.bankID = bankID;    }    public Date getSubmitTime() {        return this.submitTime;    }    public void setSubmitTime(Date submitTime) {        this.submitTime = submitTime;    }    public Float getMoney() {        return this.money;    }    public void setMoney(Float money) {        this.money = money;    }    public Date getCompleteTime() {        return this.completeTime;    }    public void setCompleteTime(Date completeTime) {        this.completeTime = completeTime;    }    public Integer getPfrID() {        return this.pfrID;    }    public void setPfrID(Integer pfrID) {        this.pfrID = pfrID;    }    public Integer getUserID() {        return this.userID;    }    public void setUserID(Integer userID) {        this.userID = userID;    }}	