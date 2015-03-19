package com.harcyah.kata.codingbat.string1.withoutX2;

import org.junit.Assert;
import org.junit.Test;

public class WithoutX2Test {

	@Test
	public void testWithoutX2() {
		WithoutX2 withoutX2 = new WithoutX2();
		Assert.assertEquals("Hi", withoutX2.withoutX2("xHi"));
		Assert.assertEquals("Hi", withoutX2.withoutX2("Hxi"));
		Assert.assertEquals("Hi", withoutX2.withoutX2("Hi"));
		Assert.assertEquals("Hi", withoutX2.withoutX2("xxHi"));
		Assert.assertEquals("Hix", withoutX2.withoutX2("Hix"));
		Assert.assertEquals("axb", withoutX2.withoutX2("xaxb"));
		Assert.assertEquals("", withoutX2.withoutX2("xx"));
		Assert.assertEquals("", withoutX2.withoutX2("x"));
		Assert.assertEquals("", withoutX2.withoutX2(""));
		Assert.assertEquals("Hello", withoutX2.withoutX2("Hello"));
		Assert.assertEquals("Hexllo", withoutX2.withoutX2("Hexllo"));
		Assert.assertEquals("Hxllo", withoutX2.withoutX2("xHxllo"));
	}

}
