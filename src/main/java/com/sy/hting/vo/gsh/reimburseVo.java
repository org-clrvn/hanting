package com.sy.hting.vo.gsh;

import java.util.Date;

public class reimburseVo {
	private int refundID;
	private String orderID;
	private Date applicationTime;
	private String userName;
	private String stName;
	private float applyRefundMoney;
	private int refundstatus;
	public int getRefundID() {
		return refundID;
	}
	public void setRefundID(int refundID) {
		this.refundID = refundID;
	}
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public Date getApplicationTime() {
		return applicationTime;
	}
	public void setApplicationTime(Date applicationTime) {
		this.applicationTime = applicationTime;
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
	public float getApplyRefundMoney() {
		return applyRefundMoney;
	}
	public void setApplyRefundMoney(float applyRefundMoney) {
		this.applyRefundMoney = applyRefundMoney;
	}
	public int getRefundstatus() {
		return refundstatus;
	}
	public void setRefundstatus(int refundstatus) {
		this.refundstatus = refundstatus;
	}
}
