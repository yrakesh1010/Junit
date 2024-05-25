package com.rk.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.rk.Calculator;

public class TestCalculator {
     
	@Test
	public void AddTest() {
		Calculator cal=new Calculator();
		int actualResult = cal.add(10, 20);
		int expectedResult= 30;
		assertEquals(expectedResult, actualResult);
	}
}
