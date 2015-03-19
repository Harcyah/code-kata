package com.harcyah.kata.codingbat.string1.withoutX;

import org.junit.Assert;
import org.junit.Test;

public class WithoutXTest {

	@Test
	public void testWithoutX() {
		WithoutX withoutX = new WithoutX();
		Assert.assertEquals("Hi", withoutX.withoutX("xHix"));
		Assert.assertEquals("Hi", withoutX.withoutX("xHi"));
		Assert.assertEquals("Hxi", withoutX.withoutX("Hxix"));
		Assert.assertEquals("Hi", withoutX.withoutX("Hi"));
		Assert.assertEquals("xHi", withoutX.withoutX("xxHi"));
		Assert.assertEquals("Hi", withoutX.withoutX("Hix"));
		Assert.assertEquals("axb", withoutX.withoutX("xaxbx"));
		Assert.assertEquals("", withoutX.withoutX("xx"));
		Assert.assertEquals("", withoutX.withoutX("x"));
		Assert.assertEquals("", withoutX.withoutX(""));
		Assert.assertEquals("Hello", withoutX.withoutX("Hello"));
		Assert.assertEquals("Hexllo", withoutX.withoutX("Hexllo"));
	}

}
