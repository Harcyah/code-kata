package com.harcyah.kata.codingbat.warmup1.in3050;

import org.junit.Assert;
import org.junit.Test;

public class In3050Test {

	@Test
	public void testIn3050() {
		In3050 in3050 = new In3050();
		Assert.assertTrue(in3050.in3050(30, 31));
		Assert.assertFalse(in3050.in3050(30, 41));
		Assert.assertTrue(in3050.in3050(40, 50));
		Assert.assertFalse(in3050.in3050(40, 51));
		Assert.assertFalse(in3050.in3050(39, 50));
		Assert.assertFalse(in3050.in3050(50, 39));
		Assert.assertTrue(in3050.in3050(40, 39));
		Assert.assertTrue(in3050.in3050(49, 48));
		Assert.assertTrue(in3050.in3050(50, 40));
		Assert.assertFalse(in3050.in3050(50, 51));
		Assert.assertTrue(in3050.in3050(35, 36));
		Assert.assertFalse(in3050.in3050(35, 45));
	}

}