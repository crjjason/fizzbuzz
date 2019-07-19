package com.crjjason.fizzbuzz.handler;

public class FizzBuzzHandler extends Handler {

	@Override
	public String handleRequest(int number) {		
		if(number % 3 == 0 && number % 5 == 0){
			return "fizzbuzz";
		}
		if(getNext() != null){
			return getNext().handleRequest(number);
		}
		return null;
	}

}
