package com.harcyah.kata.codingbat.string2.repeatEnd;

import org.junit.Assert;
import org.junit.Test;

public class RepeatEndTest {

	@Test
	public void testRepeatEnd() {
		RepeatEnd repeatEnd = new RepeatEnd();
		Assert.assertEquals("llollollo", repeatEnd.repeatEnd("Hello", 3));
		Assert.assertEquals("lolo", repeatEnd.repeatEnd("Hello", 2));
		Assert.assertEquals("o", repeatEnd.repeatEnd("Hello", 1));
		Assert.assertEquals("", repeatEnd.repeatEnd("Hello", 0));
		Assert.assertEquals("abcabcabc", repeatEnd.repeatEnd("abc", 3));
		Assert.assertEquals("3434", repeatEnd.repeatEnd("1234", 2));
		Assert.assertEquals("234234234", repeatEnd.repeatEnd("1234", 3));
		Assert.assertEquals("", repeatEnd.repeatEnd("", 0));
	}

}
