package com.epam.ReportPortalDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

	private static final Logger log = LoggerFactory.getLogger(CalculatorTest.class);
	Calculator calculator = new Calculator();

	@Test
	public void testAddition() {
		int expected = 3 + 2;
		int actual = calculator.add(3, 2);
		log.info("Addition Test working..");
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void testSubtraction() {
		int expected = 9 - 6;
		int actual = calculator.subtract(9, 6);
		log.info("Subtraction Test working..");
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void testAdditionWithNegativeIntegers() {
		int expected = -10;
		int actual = calculator.add(-8, -2);
		log.info("Assert se pehle vla chal raha hai!");
		Assert.assertEquals(actual, expected);
		log.info("Assert se baad vla chal raha hai!");
	}

}
