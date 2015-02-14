package com.harcyah.kata.codingbat.loneTeen;

import org.junit.Assert;
import org.junit.Test;

public class LoneTeenTest {

	@Test
	public void testLoneTeen() {
		LoneTeen loneTeen = new LoneTeen();
		Assert.assertTrue(loneTeen.loneTeen(13, 99));
		Assert.assertTrue(loneTeen.loneTeen(21, 19));
		Assert.assertFalse(loneTeen.loneTeen(13, 13));
		Assert.assertTrue(loneTeen.loneTeen(14, 20));
		Assert.assertTrue(loneTeen.loneTeen(20, 15));
		Assert.assertFalse(loneTeen.loneTeen(16, 17));
		Assert.assertTrue(loneTeen.loneTeen(16, 9));
		Assert.assertFalse(loneTeen.loneTeen(16, 18));
		Assert.assertFalse(loneTeen.loneTeen(13, 19));
		Assert.assertTrue(loneTeen.loneTeen(13, 20));
		Assert.assertTrue(loneTeen.loneTeen(6, 18));
		Assert.assertTrue(loneTeen.loneTeen(99, 13));
		Assert.assertFalse(loneTeen.loneTeen(99, 99));
	}

}