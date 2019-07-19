package com.crjjason.fizzbuzz.handler;

public class BuzzHandler extends Handler {

	@Override
	public String handleRequest(int number) {		
		if(number % 5 == 0){
			return "buzz";
		}
		if(getNext() != null){
			return getNext().handleRequest(number);
		}
		return null;
	}

}
