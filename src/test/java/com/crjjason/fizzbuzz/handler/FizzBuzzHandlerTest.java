package com.crjjason.fizzbuzz.handler;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FizzBuzzHandlerTest {
	private Handler handler;
	
	@Before
	public void setUp(){
		handler = new FizzBuzzHandler();
	}
	
	@Test
	public void testFizzBuzzHandlerPositive(){
		Assert.assertEquals("fizzbuzz", handler.handleRequest(15));
		Assert.assertEquals("fizzbuzz", handler.handleRequest(30));
		Assert.assertEquals("fizzbuzz", handler.handleRequest(90));
	}
	
	@Test
	public void testFizzBuzzHandlerNegative(){
		Assert.assertNull(handler.handleRequest(3));
		Assert.assertNull(handler.handleRequest(5));
	}
}
