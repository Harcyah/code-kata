package com.harcyah.kata.codingbat.string1.lastTwo;

import org.junit.Assert;
import org.junit.Test;

public class LastTwoTest {

	@Test
	public void testLastTwo() {
		LastTwo lastTwo = new LastTwo();
		Assert.assertEquals("codign", lastTwo.lastTwo("coding"));
		Assert.assertEquals("cta", lastTwo.lastTwo("cat"));
		Assert.assertEquals("ba", lastTwo.lastTwo("ab"));
		Assert.assertEquals("a", lastTwo.lastTwo("a"));
		Assert.assertEquals("", lastTwo.lastTwo(""));
	}

}
