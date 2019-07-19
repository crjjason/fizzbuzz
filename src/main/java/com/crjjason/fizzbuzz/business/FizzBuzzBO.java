package com.crjjason.fizzbuzz.business;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzzBO {
	private int count;
	
	public FizzBuzzBO(int count){
		if(count <= 0){
			throw new IllegalArgumentException("only positive number is allowed");
		}
		this.count = count;
	}
	
	public List<String> generateArray(){
		List<Integer> numbers = new ArrayList<Integer>();
		
		for(int i = 1; i <= count; i++){
			numbers.add(i);
		}
		
		List<String> words = numbers.stream().map(number -> {
			String value = "";
			if(number % 3 == 0){
				value += "fizz";
			}
			if(number % 5 ==0){
				value += "buzz";
			}
			if("".equals(value)){
				value += number;
			}
			return value;
		}).collect(Collectors.toList());
		return words;	
	}
}
