package com.harcyah.kata.codingbat.warmup1.makes10;

import org.junit.Assert;
import org.junit.Test;

public class Makes10Test {

	@Test
	public void testMakes10() {
		Makes10 makes10 = new Makes10();
		Assert.assertTrue(makes10.makes10(9, 10));
		Assert.assertFalse(makes10.makes10(9, 9));
		Assert.assertTrue(makes10.makes10(1, 9));
		Assert.assertTrue(makes10.makes10(10, 1));
		Assert.assertTrue(makes10.makes10(10, 10));
		Assert.assertTrue(makes10.makes10(8, 2));
		Assert.assertFalse(makes10.makes10(8, 3));
		Assert.assertTrue(makes10.makes10(10, 42));
		Assert.assertTrue(makes10.makes10(12, -2));
	}

}
