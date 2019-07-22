package com.crjjason.fizzbuzz.business;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.crjjason.fizzbuzz.handler.BuzzHandler;
import com.crjjason.fizzbuzz.handler.FizzBuzzHandler;
import com.crjjason.fizzbuzz.handler.FizzHandler;
import com.crjjason.fizzbuzz.handler.Handler;
import com.crjjason.fizzbuzz.handler.NumberHandler;

public class FizzBuzzBO {
	private int count;
	private Handler handler;
	
	public FizzBuzzBO(int count){
		if(count <= 0){
			throw new IllegalArgumentException("only positive number is allowed");
		}
		this.count = count;
		
		FizzBuzzHandler fizzBuzzHandler = new FizzBuzzHandler();
		FizzHandler fizzHandler = new FizzHandler();
		BuzzHandler buzzHandler = new BuzzHandler();
		NumberHandler numberHandler = new NumberHandler();
		
		buzzHandler.setNext(numberHandler);
		fizzHandler.setNext(buzzHandler);
		fizzBuzzHandler.setNext(fizzHandler);
		
		handler = fizzBuzzHandler;
	}
	
	public List<String> generateArray(){
		List<Integer> numbers = new ArrayList<Integer>();
		
		for(int i = 1; i <= count; i++){
			numbers.add(i);
		}
		
		List<String> words = numbers.stream()
				.map(number -> handler.handleRequest(number))
				.collect(Collectors.toList());
		return words;	
	}
}
