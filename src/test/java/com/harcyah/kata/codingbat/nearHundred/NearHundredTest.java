package com.harcyah.kata.codingbat.nearHundred;

import org.junit.Assert;
import org.junit.Test;

public class NearHundredTest {

	@Test
	public void testNearHundred() {
		NearHundred nearHundred = new NearHundred();
		Assert.assertTrue(nearHundred.nearHundred(93));
		Assert.assertTrue(nearHundred.nearHundred(90));
		Assert.assertFalse(nearHundred.nearHundred(89));
		Assert.assertTrue(nearHundred.nearHundred(110));
		Assert.assertFalse(nearHundred.nearHundred(111));
		Assert.assertFalse(nearHundred.nearHundred(121));
		Assert.assertFalse(nearHundred.nearHundred(0));
		Assert.assertFalse(nearHundred.nearHundred(5));
		Assert.assertTrue(nearHundred.nearHundred(191));
		Assert.assertFalse(nearHundred.nearHundred(189));
		Assert.assertTrue(nearHundred.nearHundred(190));
		Assert.assertTrue(nearHundred.nearHundred(200));
		Assert.assertTrue(nearHundred.nearHundred(210));
		Assert.assertFalse(nearHundred.nearHundred(211));
		Assert.assertFalse(nearHundred.nearHundred(290));
	}
}
