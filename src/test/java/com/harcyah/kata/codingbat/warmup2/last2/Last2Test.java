package com.harcyah.kata.codingbat.warmup2.last2;

import org.junit.Assert;
import org.junit.Test;

public class Last2Test {

	@Test
	public void testlast2() {
		Last2 last2 = new Last2();
		Assert.assertEquals(1, last2.last2("hixxhi"));
		Assert.assertEquals(1, last2.last2("xaxxaxaxx"));
		Assert.assertEquals(2, last2.last2("axxxaaxx"));
		Assert.assertEquals(3, last2.last2("xxaxxaxxaxx"));
		Assert.assertEquals(0, last2.last2("xaxaxaxx"));
		Assert.assertEquals(2, last2.last2("xxxx"));
		Assert.assertEquals(1, last2.last2("13121312"));
		Assert.assertEquals(1, last2.last2("11212"));
		Assert.assertEquals(0, last2.last2("13121311"));
		Assert.assertEquals(2, last2.last2("1717171"));
		Assert.assertEquals(0, last2.last2("hi"));
		Assert.assertEquals(0, last2.last2("h"));
		Assert.assertEquals(0, last2.last2(""));
	}

}
