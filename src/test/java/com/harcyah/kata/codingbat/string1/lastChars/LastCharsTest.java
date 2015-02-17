package com.harcyah.kata.codingbat.string1.lastChars;

import org.junit.Assert;
import org.junit.Test;

public class LastCharsTest {

	@Test
	public void testLastChars() {
		LastChars lastChars = new LastChars();
		Assert.assertEquals("ls", lastChars.lastChars("last", "chars"));
		Assert.assertEquals("ya", lastChars.lastChars("yo", "java"));
		Assert.assertEquals("h@", lastChars.lastChars("hi", ""));
		Assert.assertEquals("@o", lastChars.lastChars("", "hello"));
		Assert.assertEquals("@@", lastChars.lastChars("", ""));
		Assert.assertEquals("ki", lastChars.lastChars("kitten", "hi"));
		Assert.assertEquals("kp", lastChars.lastChars("k", "zip"));
		Assert.assertEquals("k@", lastChars.lastChars("kitten", ""));
		Assert.assertEquals("kp", lastChars.lastChars("kitten", "zip"));
	}

}
