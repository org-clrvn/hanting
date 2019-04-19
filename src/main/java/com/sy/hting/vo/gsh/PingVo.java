package com.sy.hting.vo.gsh;

import java.util.Date;

public class PingVo {
	private int pcID;
	private int userID;
	private String userName;
	private String title;
	private String content;
	private Date reviewTime;
	public int getPcID() {
		return pcID;
	}
	public void setPcID(int pcID) {
		this.pcID = pcID;
	}
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getReviewTime() {
		return reviewTime;
	}
	public void setReviewTime(Date reviewTime) {
		this.reviewTime = reviewTime;
	}
	
}
