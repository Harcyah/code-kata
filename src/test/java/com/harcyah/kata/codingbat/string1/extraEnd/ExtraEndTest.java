package com.harcyah.kata.codingbat.string1.extraEnd;

import org.junit.Assert;
import org.junit.Test;

public class ExtraEndTest {

	@Test
	public void testExtraEnd() {
		ExtraEnd extraEnd = new ExtraEnd();
		Assert.assertEquals("lololo", extraEnd.extraEnd("Hello"));
		Assert.assertEquals("ababab", extraEnd.extraEnd("ab"));
		Assert.assertEquals("HiHiHi", extraEnd.extraEnd("Hi"));
		Assert.assertEquals("dydydy", extraEnd.extraEnd("Candy"));
		Assert.assertEquals("dedede", extraEnd.extraEnd("Code"));
	}

}
