package com.harcyah.kata.codingbat.warmup1.frontBack;

import org.junit.Assert;
import org.junit.Test;

public class FrontBackTest {

	@Test
	public void testFrontBack() {
		FrontBack frontBack = new FrontBack();
		Assert.assertEquals("eodc", frontBack.frontBack("code"));
		Assert.assertEquals("a", frontBack.frontBack("a"));
		Assert.assertEquals("ba", frontBack.frontBack("ab"));
		Assert.assertEquals("cba", frontBack.frontBack("abc"));
		Assert.assertEquals("", frontBack.frontBack(""));
		Assert.assertEquals("ehocolatC", frontBack.frontBack("Chocolate"));
		Assert.assertEquals("Java", frontBack.frontBack("aavJ"));
		Assert.assertEquals("oellh", frontBack.frontBack("hello"));
	}

}