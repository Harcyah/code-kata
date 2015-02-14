package com.harcyah.kata.codingbat.warmup1.or35;

import org.junit.Assert;
import org.junit.Test;

public class Or35Test {

	@Test
	public void testOr35() {
		Or35 or35 = new Or35();
		Assert.assertTrue(or35.or35(3));
		Assert.assertTrue(or35.or35(10));
		Assert.assertFalse(or35.or35(8));
		Assert.assertTrue(or35.or35(15));
		Assert.assertTrue(or35.or35(5));
		Assert.assertTrue(or35.or35(9));
		Assert.assertFalse(or35.or35(4));
		Assert.assertFalse(or35.or35(7));
		Assert.assertTrue(or35.or35(6));
		Assert.assertFalse(or35.or35(17));
		Assert.assertTrue(or35.or35(18));
		Assert.assertFalse(or35.or35(29));
		Assert.assertTrue(or35.or35(20));
		Assert.assertTrue(or35.or35(21));
		Assert.assertFalse(or35.or35(22));
		Assert.assertTrue(or35.or35(45));
		Assert.assertTrue(or35.or35(99));
		Assert.assertTrue(or35.or35(100));
		Assert.assertFalse(or35.or35(101));
		Assert.assertFalse(or35.or35(121));
		Assert.assertFalse(or35.or35(122));
		Assert.assertTrue(or35.or35(123));
	}

}