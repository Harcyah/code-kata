package com.harcyah.kata.codingbat.string1.seeColor;

import org.junit.Assert;
import org.junit.Test;

public class SeeColorTest {

	@Test
	public void testSeeColor() {
		SeeColor seeColor = new SeeColor();
		Assert.assertEquals("red", seeColor.seeColor("redxx"));
		Assert.assertEquals("", seeColor.seeColor("xxred"));
		Assert.assertEquals("blue", seeColor.seeColor("blueTimes"));
		Assert.assertEquals("", seeColor.seeColor("NoColor"));
		Assert.assertEquals("red", seeColor.seeColor("red"));
		Assert.assertEquals("", seeColor.seeColor("re"));
		Assert.assertEquals("", seeColor.seeColor("blu"));
		Assert.assertEquals("blue", seeColor.seeColor("blue"));
		Assert.assertEquals("", seeColor.seeColor("a"));
		Assert.assertEquals("", seeColor.seeColor(""));
		Assert.assertEquals("", seeColor.seeColor("xyzred"));
	}

}
