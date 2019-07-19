package com.crjjason.fizzbuzz.business;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class FizzBuzzBOTests {
	@Test
	public void testGenerateArray(){
		FizzBuzzBO bo = new FizzBuzzBO(15);
		List<String> words = bo.generateArray();
		long fizzCount = words.stream().filter(word -> "fizz".equals(word)).count();
		long buzzCount = words.stream().filter(word -> "buzz".equals(word)).count();
		long fizzBuzzCount = words.stream().filter(word -> "fizzbuzz".equals(word)).count();
		Assert.assertEquals(4, fizzCount);
		Assert.assertEquals(2, buzzCount);
		Assert.assertEquals(1, fizzBuzzCount);
	}
	
	@Test
	public void testGenerateArrayInvalidCount(){
		try{
			FizzBuzzBO bo = new FizzBuzzBO(0);
			Assert.assertFalse(true);
		} catch(Exception ex) {
			Assert.assertTrue(true);
		}
	}
}
