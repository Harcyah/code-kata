package com.harcyah.kata.codingbat.string1.withoutEnd;

import org.junit.Assert;
import org.junit.Test;

public class WithoutEndTest {

	@Test
	public void testWithoutEnd() {
		WithoutEnd withoutEnd = new WithoutEnd();
		Assert.assertEquals("ell", withoutEnd.withoutEnd("Hello"));
		Assert.assertEquals("av", withoutEnd.withoutEnd("java"));
		Assert.assertEquals("odin", withoutEnd.withoutEnd("coding"));
		Assert.assertEquals("od", withoutEnd.withoutEnd("code"));
		Assert.assertEquals("", withoutEnd.withoutEnd("ab"));
		Assert.assertEquals("hocolate", withoutEnd.withoutEnd("Chocolate!"));
		Assert.assertEquals("itte", withoutEnd.withoutEnd("kitten"));
		Assert.assertEquals("ooho", withoutEnd.withoutEnd("woohoo"));
	}

}
