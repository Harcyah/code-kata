package com.harcyah.kata.codingbat.warmup2.altPairs;

import org.junit.Assert;
import org.junit.Test;

public class AltPairsTest {

	@Test
	public void testAltPairs() {
		AltPairs altPairs = new AltPairs();
		Assert.assertEquals("kien", altPairs.altPairs("kitten"));
		Assert.assertEquals("Chole", altPairs.altPairs("Chocolate"));
		Assert.assertEquals("Congrr", altPairs.altPairs("CodingHorror"));
		Assert.assertEquals("ya", altPairs.altPairs("yak"));
		Assert.assertEquals("ya", altPairs.altPairs("ya"));
		Assert.assertEquals("y", altPairs.altPairs("y"));
		Assert.assertEquals("", altPairs.altPairs(""));
		Assert.assertEquals("ThThThth", altPairs.altPairs("ThisThatTheOther"));
	}

}
