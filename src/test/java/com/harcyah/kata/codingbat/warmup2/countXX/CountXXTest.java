package com.harcyah.kata.codingbat.warmup2.countXX;

import org.junit.Assert;
import org.junit.Test;

public class CountXXTest {

	@Test
	public void testCountXX() {
		CountXX countXX = new CountXX();
		Assert.assertEquals(1, countXX.countXX("abcxx"));
		Assert.assertEquals(2, countXX.countXX("xxx"));
		Assert.assertEquals(3, countXX.countXX("xxxx"));
		Assert.assertEquals(0, countXX.countXX("abc"));
		Assert.assertEquals(0, countXX.countXX("Hello there"));
		Assert.assertEquals(2, countXX.countXX("Hexxo thxxe"));
		Assert.assertEquals(0, countXX.countXX(""));
		Assert.assertEquals(0, countXX.countXX("Kittens"));
		Assert.assertEquals(2, countXX.countXX("Kittensxxx"));
	}

}
