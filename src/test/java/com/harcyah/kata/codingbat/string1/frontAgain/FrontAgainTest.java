package com.harcyah.kata.codingbat.string1.frontAgain;

import org.junit.Assert;
import org.junit.Test;

public class FrontAgainTest {

	@Test
	public void testFrontAgain() {
		FrontAgain frontAgain = new FrontAgain();
		Assert.assertEquals(true, frontAgain.frontAgain("edited"));
		Assert.assertEquals(false, frontAgain.frontAgain("edit"));
		Assert.assertEquals(true, frontAgain.frontAgain("ed"));
		Assert.assertEquals(true, frontAgain.frontAgain("jj"));
		Assert.assertEquals(true, frontAgain.frontAgain("jjj"));
		Assert.assertEquals(true, frontAgain.frontAgain("jjjj"));
		Assert.assertEquals(false, frontAgain.frontAgain("jjjk"));
		Assert.assertEquals(false, frontAgain.frontAgain("x"));
		Assert.assertEquals(false, frontAgain.frontAgain(""));
		Assert.assertEquals(false, frontAgain.frontAgain("java"));
		Assert.assertEquals(true, frontAgain.frontAgain("javaja"));
	}

}
