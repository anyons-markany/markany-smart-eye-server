package com.markany.mysite.vo;

public class RTSPVo {
	private Long id;
	private String manufacturer;
	private String model;
	private String paths;
	
	
	public long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getPaths() {
		return paths;
	}
	public void setPaths(String paths) {
		this.paths = paths;
	}
	
	@Override
	public String toString() {
		return "RTSPVo [id=" + id + ", manufacturer=" + manufacturer + ", model=" + model + ", paths=" + paths + "]";
	}
	
	
}

