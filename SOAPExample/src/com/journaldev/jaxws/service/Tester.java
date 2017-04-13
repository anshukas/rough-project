package com.journaldev.jaxws.service;

import javax.xml.ws.Endpoint;

public class Tester {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/person", new PersonServiceImpl());
	}
}
