package com.harcyah.kata.codingbat.warmup1.notString;

import org.junit.Assert;
import org.junit.Test;

public class NotStringTest {

	@Test
	public void testNotString() {
		NotString notString = new NotString();
		Assert.assertEquals("not candy", notString.notString("candy"));
		Assert.assertEquals("not x", notString.notString("x"));
		Assert.assertEquals("not bad", notString.notString("not bad"));
		Assert.assertEquals("not bad", notString.notString("bad"));
		Assert.assertEquals("not", notString.notString("not"));
		Assert.assertEquals("not is not", notString.notString("is not"));
		Assert.assertEquals("not no", notString.notString("no"));
	}

}