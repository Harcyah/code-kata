package com.harcyah.kata.codingbat.warmup2.frontTimes;

import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTest {

	@Test
	public void testFrontTimes() {
		FrontTimes frontTimes = new FrontTimes();
		Assert.assertEquals("ChoCho", frontTimes.frontTimes("Chocolate", 2));
		Assert.assertEquals("ChoChoCho", frontTimes.frontTimes("Chocolate", 3));
		Assert.assertEquals("AbcAbcAbc", frontTimes.frontTimes("Abc", 3));
		Assert.assertEquals("AbAbAbAb", frontTimes.frontTimes("Ab", 4));
		Assert.assertEquals("AAAA", frontTimes.frontTimes("A", 4));
		Assert.assertEquals("", frontTimes.frontTimes("", 4));
		Assert.assertEquals("", frontTimes.frontTimes("Abc", 0));
	}

}
