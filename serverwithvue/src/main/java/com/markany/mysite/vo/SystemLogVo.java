package com.markany.mysite.vo;

import java.util.Date;

public class SystemLogVo {
	private Long id;
	private Date createdAt;
	private Date updatedAt;
	private Date deletedAt;
	private String userInfoId;
	private String userName;
	private String remoteIp;
	private String action;
	private String state;
	
	private String fDateTime;
	private String lDateTime;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public Date getDeletedAt() {
		return deletedAt;
	}
	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}
	public String getUserInfoId() {
		return userInfoId;
	}
	public void setUserInfoId(String userInfoId) {
		this.userInfoId = userInfoId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRemoteIp() {
		return remoteIp;
	}
	public void setRemoteIp(String remoteIp) {
		this.remoteIp = remoteIp;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getfDateTime() {
		return fDateTime;
	}
	public void setfDateTime(String fDateTime) {
		this.fDateTime = fDateTime;
	}
	public String getlDateTime() {
		return lDateTime;
	}
	public void setlDateTime(String lDateTime) {
		this.lDateTime = lDateTime;
	}
	@Override
	public String toString() {
		return "SystemLogVo [id=" + id + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", deletedAt="
				+ deletedAt + ", userInfoId=" + userInfoId + ", userName=" + userName + ", remoteIp=" + remoteIp
				+ ", action=" + action + ", state=" + state + ", fDateTime=" + fDateTime + ", lDateTime=" + lDateTime
				+ "]";
	}
	
	
	
}
