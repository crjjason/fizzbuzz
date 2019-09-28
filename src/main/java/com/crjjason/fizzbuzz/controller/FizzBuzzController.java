package com.crjjason.fizzbuzz.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crjjason.fizzbuzz.business.FizzBuzzBO;

@RestController
@RequestMapping("/")
public class FizzBuzzController {
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<String> startFizzBuzz(){
		FizzBuzzBO bo = new FizzBuzzBO(100);
		List<String> array = bo.generateArray();
		String result = array.stream().reduce((e1,e2) -> "**" + e1 + "<br/>" + e2).get();
		return ResponseEntity.ok(result);
	}
}
