package com.harcyah.kata.codingbat.string1.theEnd;

import org.junit.Assert;
import org.junit.Test;

public class TheEndTest {

	@Test
	public void testTheEnd() {
		TheEnd theEnd = new TheEnd();
		Assert.assertEquals("H", theEnd.theEnd("Hello", true));
		Assert.assertEquals("o", theEnd.theEnd("Hello", false));
		Assert.assertEquals("o", theEnd.theEnd("oh", true));
		Assert.assertEquals("h", theEnd.theEnd("oh", false));
		Assert.assertEquals("x", theEnd.theEnd("x", true));
		Assert.assertEquals("x", theEnd.theEnd("x", false));
		Assert.assertEquals("j", theEnd.theEnd("java", true));
		Assert.assertEquals("e", theEnd.theEnd("chocolate", false));
		Assert.assertEquals("1", theEnd.theEnd("1234", true));
		Assert.assertEquals("e", theEnd.theEnd("code", false));
	}

}
