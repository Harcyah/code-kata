package com.harcyah.kata.stringcalculator;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void testAddEmptyString() {
		StringCalculator sc = new StringCalculator("");
		Assert.assertEquals(0, sc.add());
	}

	@Test
	public void testAddOneDigit() {
		StringCalculator sc = new StringCalculator("1");
		Assert.assertEquals(1, sc.add());
	}

	@Test
	public void testAddTwoDigits() {
		StringCalculator sc = new StringCalculator("2,3");
		Assert.assertEquals(5, sc.add());
	}

	@Test
	public void testAddFiveDigits() {
		StringCalculator sc = new StringCalculator("1,2,3,4,5");
		Assert.assertEquals(15, sc.add());
	}

	@Test
	public void testAddHandlesLineFeedSeparator() {
		StringCalculator sc = new StringCalculator("1\n2,3");
		Assert.assertEquals(6, sc.add());
	}

	@Test
	public void testAddHandlesCustomSeparator() {
		StringCalculator sc = new StringCalculator("#\n1#2#3#34");
		Assert.assertEquals(40, sc.add());
	}

}
