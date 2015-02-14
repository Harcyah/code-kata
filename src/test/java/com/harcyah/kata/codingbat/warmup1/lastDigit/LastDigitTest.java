package com.harcyah.kata.codingbat.warmup1.lastDigit;

import org.junit.Assert;
import org.junit.Test;

public class LastDigitTest {

	@Test
	public void testLastDigit() {
		LastDigit lastDigit = new LastDigit();
		Assert.assertTrue(lastDigit.lastDigit(7, 17));
		Assert.assertFalse(lastDigit.lastDigit(6, 17));
		Assert.assertTrue(lastDigit.lastDigit(3, 113));
		Assert.assertFalse(lastDigit.lastDigit(114, 113));
		Assert.assertTrue(lastDigit.lastDigit(114, 4));
		Assert.assertTrue(lastDigit.lastDigit(10, 0));
		Assert.assertFalse(lastDigit.lastDigit(11, 0));
	}

}