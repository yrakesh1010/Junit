package com.rk.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.rk.Calculator;

public class TestCalculator {
     
	private static Calculator cal=null;
	
	@BeforeClass
	public static void init() {
		System.out.println("init");
		cal=new Calculator();
	}
	
	@AfterClass
	public static void destroy() {
		System.out.println("destroy");
		cal=null;
	}
	
	@Test
	public void addTest() {
		Integer actualResult = cal.add(10, 20);
		Integer expectedResult= 30;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void mulTest() {
		Double actualResult = cal.mul(10.0, 20.0);
		Double expectedResult=200.0;
		assertEquals(actualResult, expectedResult);
	}
}
