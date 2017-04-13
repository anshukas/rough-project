package com.objectedge.wireless.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Offer {
	private String id;
	private String code;
	private String displayName;
	private String desc;
	private Double price;
	
	//coponent -only if we get single offer i.e with offer id 
	
	public Offer() {}
	
	public Offer(String id, String code, String displayName, String desc,
			Double price) {
		this.id = id;
		this.code = code;
		this.displayName = displayName;
		this.desc = desc;
		this.price = price;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
}
