package com.harcyah.kata.codingbat.string1.extraFront;

import org.junit.Assert;
import org.junit.Test;

public class ExtraFrontTest {

	@Test
	public void testExtraFront() {
		ExtraFront extraFront = new ExtraFront();
		Assert.assertEquals("HeHeHe", extraFront.extraFront("Hello"));
		Assert.assertEquals("ababab", extraFront.extraFront("ab"));
		Assert.assertEquals("HHH", extraFront.extraFront("H"));
		Assert.assertEquals("", extraFront.extraFront(""));
		Assert.assertEquals("CaCaCa", extraFront.extraFront("Candy"));
		Assert.assertEquals("CoCoCo", extraFront.extraFront("Code"));
	}

}
