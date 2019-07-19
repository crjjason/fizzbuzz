package com.crjjason.fizzbuzz.handler;

public class FizzHandler extends Handler {

	@Override
	public String handleRequest(int number) {		
		if(number % 3 == 0){
			return "fizz";
		}
		if(getNext() != null){
			return getNext().handleRequest(number);
		}
		return null;
	}

}
