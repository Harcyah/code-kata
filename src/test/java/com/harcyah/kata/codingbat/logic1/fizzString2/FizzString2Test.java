package com.harcyah.kata.codingbat.logic1.fizzString2;

import org.junit.Assert;
import org.junit.Test;

public class FizzString2Test {

	@Test
	public void testFizzString2() {
		FizzString2 fizzString2 = new FizzString2();
		Assert.assertEquals("1!", fizzString2.fizzString2(1));
		Assert.assertEquals("2!", fizzString2.fizzString2(2));
		Assert.assertEquals("Fizz!", fizzString2.fizzString2(3));
		Assert.assertEquals("4!", fizzString2.fizzString2(4));
		Assert.assertEquals("Buzz!", fizzString2.fizzString2(5));
		Assert.assertEquals("Fizz!", fizzString2.fizzString2(6));
		Assert.assertEquals("7!", fizzString2.fizzString2(7));
		Assert.assertEquals("8!", fizzString2.fizzString2(8));
		Assert.assertEquals("Fizz!", fizzString2.fizzString2(9));
		Assert.assertEquals("FizzBuzz!", fizzString2.fizzString2(15));
		Assert.assertEquals("16!", fizzString2.fizzString2(16));
		Assert.assertEquals("Fizz!", fizzString2.fizzString2(18));
		Assert.assertEquals("19!", fizzString2.fizzString2(19));
		Assert.assertEquals("Fizz!", fizzString2.fizzString2(21));
		Assert.assertEquals("44!", fizzString2.fizzString2(44));
		Assert.assertEquals("FizzBuzz!", fizzString2.fizzString2(45));
		Assert.assertEquals("Buzz!", fizzString2.fizzString2(100));
	}

}
