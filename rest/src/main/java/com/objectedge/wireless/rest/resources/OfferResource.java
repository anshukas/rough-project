package com.objectedge.wireless.rest.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.objectedge.wireless.rest.model.Items;
import com.objectedge.wireless.rest.model.UserRequest;
import com.objectedge.wireless.rest.service.OfferService;

@Path("/offers")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class OfferResource {
	
	OfferService os = new OfferService();

	/*@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getOffers(){
		return "Hello I'm offers Resourcs";
	}*/

	@POST
	public Items getOffers(UserRequest userRequest){
		
		// Request Process
		System.out.println(userRequest.getZip());
		
		//For response process
		Items item = new Items();
		item.setItems(os.getOffers());
		return item; 
	}
	
	
}
