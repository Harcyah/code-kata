package com.harcyah.kata.codingbat.posNeg;

import org.junit.Assert;
import org.junit.Test;

public class PosNegTest {

	@Test
	public void testPosNeg() {
		PosNeg posNeg = new PosNeg();
		Assert.assertTrue(posNeg.posNeg(1, -1, false));
		Assert.assertTrue(posNeg.posNeg(-1, 1, false));
		Assert.assertTrue(posNeg.posNeg(-4, -5, true));
		Assert.assertFalse(posNeg.posNeg(-4, -5, false));
		Assert.assertTrue(posNeg.posNeg(-4, 5, false));
		Assert.assertFalse(posNeg.posNeg(-4, 5, true));
		Assert.assertFalse(posNeg.posNeg(1, 1, false));
		Assert.assertFalse(posNeg.posNeg(-1, -1, false));
		Assert.assertFalse(posNeg.posNeg(1, -1, true));
		Assert.assertFalse(posNeg.posNeg(-1, 1, true));
		Assert.assertFalse(posNeg.posNeg(1, 1, true));
		Assert.assertTrue(posNeg.posNeg(-1, -1, true));
		Assert.assertTrue(posNeg.posNeg(5, -5, false));
		Assert.assertTrue(posNeg.posNeg(-6, 6, false));
		Assert.assertFalse(posNeg.posNeg(-5, -6, false));
		Assert.assertFalse(posNeg.posNeg(-2, -1, false));
		Assert.assertFalse(posNeg.posNeg(1, 2, false));
		Assert.assertFalse(posNeg.posNeg(-5, 6, true));
		Assert.assertTrue(posNeg.posNeg(-5, -5, true));
	}

}