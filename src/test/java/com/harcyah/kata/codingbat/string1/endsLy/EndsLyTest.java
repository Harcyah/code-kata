package com.harcyah.kata.codingbat.string1.endsLy;

import org.junit.Assert;
import org.junit.Test;

public class EndsLyTest {

	@Test
	public void testEndsLy() {
		EndsLy endsLy = new EndsLy();
		Assert.assertEquals(true, endsLy.endsLy("oddly"));
		Assert.assertEquals(false, endsLy.endsLy("y"));
		Assert.assertEquals(false, endsLy.endsLy("oddy"));
		Assert.assertEquals(false, endsLy.endsLy("oddl"));
		Assert.assertEquals(false, endsLy.endsLy("olydd"));
		Assert.assertEquals(true, endsLy.endsLy("ly"));
		Assert.assertEquals(false, endsLy.endsLy(""));
		Assert.assertEquals(false, endsLy.endsLy("falsey"));
		Assert.assertEquals(true, endsLy.endsLy("evenly"));
	}

}
