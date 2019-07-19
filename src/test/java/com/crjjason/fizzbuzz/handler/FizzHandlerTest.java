package com.crjjason.fizzbuzz.handler;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FizzHandlerTest {
	private Handler handler;
	
	@Before
	public void setUp(){
		handler = new FizzHandler();
	}
	
	@Test
	public void testFizzHandlerPositive(){
		Assert.assertEquals("fizz", handler.handleRequest(3));
		Assert.assertEquals("fizz", handler.handleRequest(33));
		Assert.assertEquals("fizz", handler.handleRequest(99));
	}
	
	@Test
	public void testFizzHandlerNegative(){
		Assert.assertNull(handler.handleRequest(1));
		Assert.assertNull(handler.handleRequest(100));
	}
}
