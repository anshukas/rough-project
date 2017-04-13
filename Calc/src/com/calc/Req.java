package com.calc;

import java.util.Map;

public class Req {
	//private Msg msg;
	private Map<String, String> map;
	
	public Req() {
	}
	
	public Req(Map<String, String> map) {
		this.map = map;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}


	
}
