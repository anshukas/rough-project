package com.objectedge.wireless.rest.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Items {
	private List<Offer> items;
	
	public Items() {}

	public Items(List<Offer> items) {
		this.items = items;
	}

	public List<Offer> getItems() {
		return items;
	}

	public void setItems(List<Offer> items) {
		this.items = items;
	}
}
