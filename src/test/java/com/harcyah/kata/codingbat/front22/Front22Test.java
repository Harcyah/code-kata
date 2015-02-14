package com.harcyah.kata.codingbat.front22;

import org.junit.Assert;
import org.junit.Test;

public class Front22Test {

	@Test
	public void testFront22() {
		Front22 front22 = new Front22();
		Assert.assertEquals("kikittenki", front22.front22("kitten"));
		Assert.assertEquals("HaHaHa", front22.front22("Ha"));
		Assert.assertEquals("ababcab", front22.front22("abc"));
		Assert.assertEquals("ababab", front22.front22("ab"));
		Assert.assertEquals("aaa", front22.front22("a"));
		Assert.assertEquals("", front22.front22(""));
		Assert.assertEquals("LoLogicLo", front22.front22("Logic"));
	}

}