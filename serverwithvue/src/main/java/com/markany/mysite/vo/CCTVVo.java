package com.markany.mysite.vo;

import java.util.Date;

public class CCTVVo {
	
	private Long id;
	private String name;
	private boolean ptz_control_usage;
	private boolean alarm;
	private boolean emergency_bell;
	private String comment;
	private String ip_address;
	private String area1;
	private String area2;
	private String area3;
	private double latitude;
	private double longitude;
	private String manufacturer;
	private String model;
	private String rtsp_path;
	private String rtsp_port;
	private String onvif_profile;
	private String onvif_port;
	private String username;
	private String password;
	private String camera_type;
	private String manage_port;
	private boolean forwarded;
	private Date updated_at;
	private String health_comment;
	private String user_comment;
	private boolean cent_con;
	
	public boolean isCent_con() {
		return cent_con;
	}
	public void setCent_con(boolean cent_con) {
		this.cent_con = cent_con;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isPtz_control_usage() {
		return ptz_control_usage;
	}
	public void setPtz_control_usage(boolean ptz_control_usage) {
		this.ptz_control_usage = ptz_control_usage;
	}
	public boolean isAlarm() {
		return alarm;
	}
	public void setAlarm(boolean alarm) {
		this.alarm = alarm;
	}
	public boolean isEmergency_bell() {
		return emergency_bell;
	}
	public void setEmergency_bell(boolean emergency_bell) {
		this.emergency_bell = emergency_bell;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getIp_address() {
		return ip_address;
	}
	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}
	public String getArea1() {
		return area1;
	}
	public void setArea1(String area1) {
		this.area1 = area1;
	}
	public String getArea2() {
		return area2;
	}
	public void setArea2(String area2) {
		this.area2 = area2;
	}
	public String getArea3() {
		return area3;
	}
	public void setArea3(String area3) {
		this.area3 = area3;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getRtsp_path() {
		return rtsp_path;
	}
	public void setRtsp_path(String rtsp_path) {
		this.rtsp_path = rtsp_path;
	}
	public String getRtsp_port() {
		return rtsp_port;
	}
	public void setRtsp_port(String rtsp_port) {
		this.rtsp_port = rtsp_port;
	}
	public String getOnvif_profile() {
		return onvif_profile;
	}
	public void setOnvif_profile(String onvif_profile) {
		this.onvif_profile = onvif_profile;
	}
	public String getOnvif_port() {
		return onvif_port;
	}
	public void setOnvif_port(String onvif_port) {
		this.onvif_port = onvif_port;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCamera_type() {
		return camera_type;
	}
	public void setCamera_type(String camera_type) {
		this.camera_type = camera_type;
	}
	public String getManage_port() {
		return manage_port;
	}
	public void setManage_port(String manage_port) {
		this.manage_port = manage_port;
	}
	public boolean isForwarded() {
		return forwarded;
	}
	public void setForwarded(boolean forwarded) {
		this.forwarded = forwarded;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	public String getHealth_comment() {
		return health_comment;
	}
	public void setHealth_comment(String health_comment) {
		this.health_comment = health_comment;
	}
	public String getUser_comment() {
		return user_comment;
	}
	public void setUser_comment(String user_comment) {
		this.user_comment = user_comment;
	}
	@Override
	public String toString() {
		return "CCTVVo [id=" + id + ", name=" + name + ", ptz_control_usage=" + ptz_control_usage + ", alarm=" + alarm
				+ ", emergency_bell=" + emergency_bell + ", comment=" + comment + ", ip_address=" + ip_address
				+ ", area1=" + area1 + ", area2=" + area2 + ", area3=" + area3 + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", manufacturer=" + manufacturer + ", model=" + model + ", rtsp_path="
				+ rtsp_path + ", rtsp_port=" + rtsp_port + ", onvif_profile=" + onvif_profile + ", onvif_port="
				+ onvif_port + ", username=" + username + ", password=" + password + ", camera_type=" + camera_type
				+ ", manage_port=" + manage_port + ", forwarded=" + forwarded + ", updated_at=" + updated_at
				+ ", health_comment=" + health_comment + ", user_comment=" + user_comment + ", cent_con=" + cent_con
				+ "]";
	}
}