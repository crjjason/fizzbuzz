package com.crjjason.fizzbuzz.handler;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BuzzHandlerTest {
	
	private Handler handler;
	
	@Before
	public void setUp(){
		handler = new BuzzHandler();
	}
	
	@Test
	public void testBuzzHandlerPositive(){
		Assert.assertEquals("buzz", handler.handleRequest(5));
		Assert.assertEquals("buzz", handler.handleRequest(50));
		Assert.assertEquals("buzz", handler.handleRequest(100));
	}
	
	@Test
	public void testBuzzHandlerNegative(){
		Assert.assertNull(handler.handleRequest(1));
		Assert.assertNull(handler.handleRequest(99));
	}
}
