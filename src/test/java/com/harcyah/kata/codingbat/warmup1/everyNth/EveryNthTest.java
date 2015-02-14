package com.harcyah.kata.codingbat.warmup1.everyNth;

import org.junit.Assert;
import org.junit.Test;

public class EveryNthTest {

	@Test
	public void testEveryNth() {
		EveryNth everyNth = new EveryNth();
		Assert.assertEquals("Mrce", everyNth.everyNth("Miracle", 2));
		Assert.assertEquals("aceg", everyNth.everyNth("abcdefg", 2));
		Assert.assertEquals("adg", everyNth.everyNth("abcdefg", 3));
		Assert.assertEquals("Cca", everyNth.everyNth("Chocolate", 3));
		Assert.assertEquals("Ccas", everyNth.everyNth("Chocolates", 3));
		Assert.assertEquals("Coe", everyNth.everyNth("Chocolates", 4));
		Assert.assertEquals("C", everyNth.everyNth("Chocolates", 100));
	}

}