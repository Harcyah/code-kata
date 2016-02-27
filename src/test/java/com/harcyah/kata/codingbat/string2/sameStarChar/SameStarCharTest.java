package com.harcyah.kata.codingbat.string2.sameStarChar;

import org.junit.Assert;
import org.junit.Test;

public class SameStarCharTest {

	@Test
	public void testSameStarChar() {
		SameStarChar sameStarChar = new SameStarChar();
		Assert.assertTrue(sameStarChar.sameStarChar("xy*yzz"));
		Assert.assertFalse(sameStarChar.sameStarChar("xy*zzz"));
		Assert.assertTrue(sameStarChar.sameStarChar("*xa*az"));
		Assert.assertFalse(sameStarChar.sameStarChar("*xa*bz"));
		Assert.assertTrue(sameStarChar.sameStarChar("*xa*a*"));
		Assert.assertTrue(sameStarChar.sameStarChar(""));
		Assert.assertTrue(sameStarChar.sameStarChar("*xa*a*a"));
		Assert.assertFalse(sameStarChar.sameStarChar("*xa*a*b"));
		Assert.assertTrue(sameStarChar.sameStarChar("*12*2*2"));
		Assert.assertFalse(sameStarChar.sameStarChar("12*2*3*"));
		Assert.assertTrue(sameStarChar.sameStarChar("abcDEF"));
		Assert.assertFalse(sameStarChar.sameStarChar("XY*YYYY*Z*"));
		Assert.assertTrue(sameStarChar.sameStarChar("XY*YYYY*Y*"));
		Assert.assertFalse(sameStarChar.sameStarChar("12*2*3*"));
		Assert.assertTrue(sameStarChar.sameStarChar("*"));
		Assert.assertTrue(sameStarChar.sameStarChar("**"));
	}

}
