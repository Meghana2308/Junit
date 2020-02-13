package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestHelloWorld {
	HelloWorld obj=new HelloWorld();
	@Test
	public void test1() {
		assertEquals(true,obj.even(10));
		assertEquals(false,obj.even(7));
	}
	
}
