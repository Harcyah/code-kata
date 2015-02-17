package com.harcyah.kata.codingbat.string1.left2;

import org.junit.Assert;
import org.junit.Test;

public class Left2Test {

	@Test
	public void testLeft2() {
		Left2 left2 = new Left2();
		Assert.assertEquals("lloHe", left2.left2("Hello"));
		Assert.assertEquals("vaja", left2.left2("java"));
		Assert.assertEquals("Hi", left2.left2("Hi"));
		Assert.assertEquals("deco", left2.left2("code"));
		Assert.assertEquals("tca", left2.left2("cat"));
		Assert.assertEquals("34512", left2.left2("12345"));
		Assert.assertEquals("ocolateCh", left2.left2("Chocolate"));
		Assert.assertEquals("icksbr", left2.left2("bricks"));
	}

}
