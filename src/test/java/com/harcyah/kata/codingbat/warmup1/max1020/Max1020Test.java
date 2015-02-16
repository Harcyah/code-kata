package com.harcyah.kata.codingbat.warmup1.max1020;

import org.junit.Assert;
import org.junit.Test;

public class Max1020Test {

	@Test
	public void testMax1020() {
		Max1020 max1020 = new Max1020();
		Assert.assertEquals(19, max1020.max1020(11, 19));
		Assert.assertEquals(19, max1020.max1020(19, 11));
		Assert.assertEquals(11, max1020.max1020(11, 9));
		Assert.assertEquals(0, max1020.max1020(9, 21));
		Assert.assertEquals(10, max1020.max1020(10, 21));
		Assert.assertEquals(10, max1020.max1020(21, 10));
		Assert.assertEquals(11, max1020.max1020(9, 11));
		Assert.assertEquals(10, max1020.max1020(23, 10));
		Assert.assertEquals(20, max1020.max1020(20, 10));
		Assert.assertEquals(20, max1020.max1020(7, 20));
		Assert.assertEquals(17, max1020.max1020(17, 16));
	}

}