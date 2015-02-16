package com.harcyah.kata.codingbat.string1.makeAbba;

import org.junit.Assert;
import org.junit.Test;

public class MakeAbbaTest {

	@Test
	public void testMakeAbba() {
		MakeAbba makeAbba = new MakeAbba();
		Assert.assertEquals("HiByeByeHi", makeAbba.makeAbba("Hi", "Bye"));
		Assert.assertEquals("YoAliceAliceYo", makeAbba.makeAbba("Yo", "Alice"));
		Assert.assertEquals("WhatUpUpWhat", makeAbba.makeAbba("What", "Up"));
		Assert.assertEquals("aaabbbbbbaaa", makeAbba.makeAbba("aaa", "bbb"));
		Assert.assertEquals("xyyx", makeAbba.makeAbba("x", "y"));
		Assert.assertEquals("xx", makeAbba.makeAbba("x", ""));
		Assert.assertEquals("yy", makeAbba.makeAbba("", "y"));
		Assert.assertEquals("BoYaYaBo", makeAbba.makeAbba("Bo", "Ya"));
		Assert.assertEquals("YaYaYaYa", makeAbba.makeAbba("Ya", "Ya"));
	}

}
