package com.harcyah.kata.codingbat.missingChar;

import org.junit.Assert;
import org.junit.Test;

public class MissingCharTest {

	@Test
	public void testMissingChar() {
		MissingChar missingChar = new MissingChar();
		Assert.assertEquals("ktten", missingChar.missingChar("kitten", 1));
		Assert.assertEquals("itten", missingChar.missingChar("kitten", 0));
		Assert.assertEquals("kittn", missingChar.missingChar("kitten", 4));
		Assert.assertEquals("i", missingChar.missingChar("Hi", 0));
		Assert.assertEquals("H", missingChar.missingChar("Hi", 1));
		Assert.assertEquals("ode", missingChar.missingChar("code", 0));
		Assert.assertEquals("cde", missingChar.missingChar("code", 1));
		Assert.assertEquals("coe", missingChar.missingChar("code", 2));
		Assert.assertEquals("cod", missingChar.missingChar("code", 3));
		Assert.assertEquals("chocolat", missingChar.missingChar("chocolate", 8));
	}

}