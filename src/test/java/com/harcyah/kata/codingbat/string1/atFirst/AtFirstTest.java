package com.harcyah.kata.codingbat.string1.atFirst;

import org.junit.Assert;
import org.junit.Test;

public class AtFirstTest {

	@Test
	public void testAtFirst() {
		AtFirst atFirst = new AtFirst();
		Assert.assertEquals("he", atFirst.atFirst("hello"));
		Assert.assertEquals("hi", atFirst.atFirst("hi"));
		Assert.assertEquals("h@", atFirst.atFirst("h"));
		Assert.assertEquals("@@", atFirst.atFirst(""));
		Assert.assertEquals("ki", atFirst.atFirst("kitten"));
		Assert.assertEquals("ja", atFirst.atFirst("java"));
		Assert.assertEquals("j@", atFirst.atFirst("j"));
	}

}
