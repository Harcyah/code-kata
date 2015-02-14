package com.harcyah.kata.codingbat.warmup1.in1020;

import org.junit.Assert;
import org.junit.Test;

public class In1020Test {

	@Test
	public void testIn1020() {
		In1020 in1020 = new In1020();
		Assert.assertTrue(in1020.in1020(12, 99));
		Assert.assertTrue(in1020.in1020(21, 12));
		Assert.assertFalse(in1020.in1020(8, 99));
		Assert.assertTrue(in1020.in1020(99, 10));
		Assert.assertTrue(in1020.in1020(20, 20));
		Assert.assertFalse(in1020.in1020(21, 21));
		Assert.assertFalse(in1020.in1020(9, 9));
	}

}