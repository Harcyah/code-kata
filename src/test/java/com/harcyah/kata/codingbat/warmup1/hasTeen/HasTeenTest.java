package com.harcyah.kata.codingbat.warmup1.hasTeen;

import org.junit.Assert;
import org.junit.Test;

public class HasTeenTest {

	@Test
	public void testHasTeen() {
		HasTeen hasTeen = new HasTeen();
		Assert.assertTrue(hasTeen.hasTeen(13, 20, 10));
		Assert.assertTrue(hasTeen.hasTeen(20, 19, 10));
		Assert.assertTrue(hasTeen.hasTeen(20, 10, 13));
		Assert.assertFalse(hasTeen.hasTeen(1, 20, 12));
		Assert.assertTrue(hasTeen.hasTeen(19, 20, 12));
		Assert.assertTrue(hasTeen.hasTeen(12, 20, 19));
		Assert.assertFalse(hasTeen.hasTeen(12, 9, 20));
		Assert.assertTrue(hasTeen.hasTeen(12, 18, 20));
		Assert.assertTrue(hasTeen.hasTeen(14, 2, 20));
		Assert.assertFalse(hasTeen.hasTeen(4, 2, 20));
		Assert.assertFalse(hasTeen.hasTeen(11, 22, 22));
	}

}