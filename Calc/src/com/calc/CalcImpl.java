package com.calc;

import java.util.Map;

public class CalcImpl implements ICalc {

	@Override
	public int add(int x, int y) {
		int z = x+y;
		return z;
	}

	@Override
	public String test(Req req) {
		Map map = req.getMap();
		System.out.println(map);
		return null;
	}
}
