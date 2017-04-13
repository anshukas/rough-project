package br.com.netshoes.ws.claimable.v2.service.impl;

import javax.xml.ws.Endpoint;

import org.apache.ws.java2wsdl.Java2WSDL;

public class Tester {
 public static void main(String[] args){
	 /*Endpoint.publish("http://localhost:8180/ClaimableWebServiceImpl", new ClaimableWebServiceImpl());*/
	 try {
		Java2WSDL.main("-cn br.com.netshoes.ws.claimable.v2.service.impl.ClaimableWebServiceImpl".split("\\s+"));
	} catch (Exception e) {
		e.printStackTrace();
	}
 }
}
