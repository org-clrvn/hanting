package com.sy.hting.vo.xmh;

import java.io.Serializable;
import java.util.Date;

import com.sy.hting.pojo.User;

/**
 * 站内信vo
 */
public class NewsVo implements Serializable {
	private Integer newsid;
	/**
	 * 发信人
	 */
    private Integer thesender;
	/**
	 * 收信人
	 */
    private Integer addressee;
	/**
	 * 发送时间
	 */
    private Date sendingtime;
	/**
	 * 是否阅读
	 */
    private Boolean readstate;
	/**
	 * 消息类型
	 */
    private Integer newstype;
	/**
	 * 消息组编号
	 */
    private Integer messagegroup;
	/**
	 * 内容
	 */
    private String content;
	/**
	 * 是否删除
	 */
	private Integer remove;
	/**
	 * we
	 */
	private Integer countt;
	/**
	 * 发送人
	 */
	private User Sender;
	/**
	 * 接收人
	 */
    private User Ressee;

	public NewsVo(Integer newsid, Integer thesender, Integer addressee, Date sendingtime, Boolean readstate,
			Integer newstype, Integer messagegroup, String content, User sender, User ressee,Integer remove,Integer countt) {
		super();
		this.newsid = newsid;
		this.thesender = thesender;
		this.addressee = addressee;
		this.sendingtime = sendingtime;
		this.readstate = readstate;
		this.newstype = newstype;
		this.messagegroup = messagegroup;
		this.content = content;
		this.countt=countt;
		this.remove=remove;
		Sender = sender;
		Ressee = ressee;
	}

	public NewsVo() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public Integer getRemove() {
		return remove;
	}

	public void setRemove(Integer remove) {
		this.remove = remove;
	}

	public Integer getCountt() {
		return countt;
	}

	public void setCountt(Integer countt) {
		this.countt = countt;
	}

	public Integer getNewsid() {
		return newsid;
	}

	public void setNewsid(Integer newsid) {
		this.newsid = newsid;
	}

	public Integer getThesender() {
		return thesender;
	}

	public void setThesender(Integer thesender) {
		this.thesender = thesender;
	}

	public Integer getAddressee() {
		return addressee;
	}

	public void setAddressee(Integer addressee) {
		this.addressee = addressee;
	}

	public Date getSendingtime() {
		return sendingtime;
	}

	public void setSendingtime(Date sendingtime) {
		this.sendingtime = sendingtime;
	}

	public Boolean getReadstate() {
		return readstate;
	}

	public void setReadstate(Boolean readstate) {
		this.readstate = readstate;
	}

	public Integer getNewstype() {
		return newstype;
	}

	public void setNewstype(Integer newstype) {
		this.newstype = newstype;
	}

	public Integer getMessagegroup() {
		return messagegroup;
	}

	public void setMessagegroup(Integer messagegroup) {
		this.messagegroup = messagegroup;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public User getSender() {
		return Sender;
	}

	public void setSender(User sender) {
		Sender = sender;
	}

	public User getRessee() {
		return Ressee;
	}

	public void setRessee(User ressee) {
		Ressee = ressee;
	}
}
