package com.crjjason.fizzbuzz.handler;

public class NumberHandler extends Handler {

	@Override
	public String handleRequest(int number) {
		return String.valueOf(number);
	}

}
