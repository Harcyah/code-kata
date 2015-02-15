package com.harcyah.kata.codingbat.warmup2.stringX;

import org.junit.Assert;
import org.junit.Test;

public class StringXTest {

	@Test
	public void testStringX() {
		StringX stringX = new StringX();
		Assert.assertEquals("xHix", stringX.stringX("xxHxix"));
		Assert.assertEquals("abcd", stringX.stringX("abxxxcd"));
		Assert.assertEquals("xabcdx", stringX.stringX("xabxxxcdx"));
		Assert.assertEquals("xKittenx", stringX.stringX("xKittenx"));
		Assert.assertEquals("Hello", stringX.stringX("Hello"));
		Assert.assertEquals("xx", stringX.stringX("xx"));
		Assert.assertEquals("x", stringX.stringX("x"));
		Assert.assertEquals("", stringX.stringX(""));
	}

}
