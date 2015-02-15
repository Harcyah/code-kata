package com.harcyah.kata.codingbat.warmup2.doubleX;

import org.junit.Assert;
import org.junit.Test;

public class DoubleXTest {

	@Test
	public void testDoubleX() {
		DoubleX doubleX = new DoubleX();
		Assert.assertEquals(true, doubleX.doubleX("axxbb"));
		Assert.assertEquals(false, doubleX.doubleX("axaxax"));
		Assert.assertEquals(true, doubleX.doubleX("xxxxx"));
		Assert.assertEquals(false, doubleX.doubleX("xaxxx"));
		Assert.assertEquals(false, doubleX.doubleX("aaaax"));
		Assert.assertEquals(false, doubleX.doubleX(""));
		Assert.assertEquals(false, doubleX.doubleX("abc"));
		Assert.assertEquals(false, doubleX.doubleX("x"));
		Assert.assertEquals(true, doubleX.doubleX("xx"));
		Assert.assertEquals(false, doubleX.doubleX("xax"));
		Assert.assertEquals(false, doubleX.doubleX("xaxx"));
	}

}
