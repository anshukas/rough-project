package br.com.netshoes.ws.claimable.v2.service.impl;

import javax.xml.ws.Endpoint;

public class Tester {
 public static void main(String[] args){
	 Endpoint.publish("http://localhost:8080/person", new ClaimableWebServiceImpl());
 }
}
