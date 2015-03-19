package com.harcyah.kata.codingbat.string1.conCat;

import org.junit.Assert;
import org.junit.Test;

public class ConCatTest {

	@Test
	public void testConCat() {
		ConCat conCat = new ConCat();
		Assert.assertEquals("abcat", conCat.conCat("abc", "cat"));
		Assert.assertEquals("dogcat", conCat.conCat("dog", "cat"));
		Assert.assertEquals("abc", conCat.conCat("abc", ""));
		Assert.assertEquals("cat", conCat.conCat("", "cat"));
		Assert.assertEquals("pig", conCat.conCat("pig", "g"));
		Assert.assertEquals("pigdoggy", conCat.conCat("pig", "doggy"));
	}

}
