package com.objectedge.wireless.rest.service;

import java.util.ArrayList;
import java.util.List;

import com.objectedge.wireless.rest.model.Offer;

public class OfferService {
	
	public List<Offer> getOffers() {
		List<Offer> resultList = new ArrayList<Offer>();
		//System.out.println("Here in service class getting zipcde "+userOfferReq.getZipcode());
		
		/*"description": "3-Play Select (59/53/19) #407523 NC",
	      "displayName": "Triple Play Select",
	      "code": "3-Play_Select_(59/53/19)_#407523_NC",
	      "id": "10001",
	      "price": 59.99*/
		Offer o1 = new Offer();
		o1.setDesc("3-Play Select (59/53/19) #407523 NC");
		o1.setDisplayName("Triple Play Select");
		o1.setCode("3-Play_Select_(59/53/19)_#407523_NC");
		o1.setId("10001");
		o1.setPrice(59.99);
		resultList.add(o1);
		
		Offer o2 = new Offer();
		o2.setDesc("4-Play Select (59/53/19) #407523 NC");
		o2.setDisplayName("Double Play Select");
		o2.setCode("4-Play_Select_(59/53/19)_#407523_NC");
		o2.setId("20001");
		o2.setPrice(90.99);
		
		resultList.add(o2);
		return resultList;
	}
}
