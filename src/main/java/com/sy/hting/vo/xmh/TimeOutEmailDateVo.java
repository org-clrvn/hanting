package com.sy.hting.vo.xmh;

import java.io.Serializable;
import java.util.Date;

public  class TimeOutEmailDateVo implements Serializable {
	/**
	 * 邮箱号
	 */
	private String email;
	/**
	 * 安全码
	 */
	private String codeId;
	/**
	 * 创建时间
	 */
	private Date time;
	/**
	 * 昵称
	 */
	private String nickName;
	/**
	 * 密码
	 */
	private String password;
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public TimeOutEmailDateVo(String email, String nickName) {
		super();
		this.email = email;
		this.nickName = nickName;
	}
	public TimeOutEmailDateVo(String email, String nickName, String password) {
		super();
		this.email = email;
		this.nickName = nickName;
		this.password = password;
	}
	public TimeOutEmailDateVo(String email, String codeId, String nickName, String password) {
		super();
		this.email = email;
		this.codeId = codeId;
		this.nickName = nickName;
		this.password = password;
	}
	public TimeOutEmailDateVo(String email, String codeId, Date time) {
		super();
		this.email = email;
		this.codeId = codeId;
		this.time = time;
	}
	public TimeOutEmailDateVo() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCodeId() {
		return codeId;
	}
	public void setCodeId(String codeId) {
		this.codeId = codeId;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
}
