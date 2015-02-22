package com.harcyah.kata.codingbat.logic1.fizzString;

import org.junit.Assert;
import org.junit.Test;

public class FizzStringTest {

	@Test
	public void testFizzString() {
		FizzString fizzString = new FizzString();
		Assert.assertEquals("Fizz", fizzString.fizzString("fig"));
		Assert.assertEquals("Buzz", fizzString.fizzString("dib"));
		Assert.assertEquals("FizzBuzz", fizzString.fizzString("fib"));
		Assert.assertEquals("abc", fizzString.fizzString("abc"));
		Assert.assertEquals("Fizz", fizzString.fizzString("fooo"));
		Assert.assertEquals("booo", fizzString.fizzString("booo"));
		Assert.assertEquals("Buzz", fizzString.fizzString("ooob"));
		Assert.assertEquals("FizzBuzz", fizzString.fizzString("fooob"));
		Assert.assertEquals("Fizz", fizzString.fizzString("f"));
		Assert.assertEquals("Buzz", fizzString.fizzString("b"));
		Assert.assertEquals("Buzz", fizzString.fizzString("abcb"));
		Assert.assertEquals("Hello", fizzString.fizzString("Hello"));
		Assert.assertEquals("Buzz", fizzString.fizzString("Hellob"));
		Assert.assertEquals("af", fizzString.fizzString("af"));
		Assert.assertEquals("bf", fizzString.fizzString("bf"));
		Assert.assertEquals("FizzBuzz", fizzString.fizzString("fb"));
	}

}
