package com.harcyah.kata.codingbat.string2.xyzMiddle;

import org.junit.Assert;
import org.junit.Test;

public class XyzMiddleTest {

	@Test
	public void testXyzMiddle() {
		XyzMiddle xyzMiddle = new XyzMiddle();
		Assert.assertEquals(true, xyzMiddle.xyzMiddle("AAxyzBB"));
		Assert.assertEquals(true, xyzMiddle.xyzMiddle("AxyzBB"));
		Assert.assertEquals(false, xyzMiddle.xyzMiddle("AxyzBBB"));
		Assert.assertEquals(false, xyzMiddle.xyzMiddle("AxyzBBBB"));
		Assert.assertEquals(false, xyzMiddle.xyzMiddle("AAAxyzB"));
		Assert.assertEquals(true, xyzMiddle.xyzMiddle("AAAxyzBB"));
		Assert.assertEquals(false, xyzMiddle.xyzMiddle("AAAAxyzBB"));
		Assert.assertEquals(false, xyzMiddle.xyzMiddle("AAAAAxyzBBB"));
		Assert.assertEquals(true, xyzMiddle.xyzMiddle("1x345xyz12x4"));
		Assert.assertEquals(true, xyzMiddle.xyzMiddle("xyzAxyzBBB"));
		Assert.assertEquals(true, xyzMiddle.xyzMiddle("xyzAxyzBxyz"));
		Assert.assertEquals(true, xyzMiddle.xyzMiddle("xyzxyzAxyzBxyzxyz"));
		Assert.assertEquals(true, xyzMiddle.xyzMiddle("xyzxyzxyzBxyzxyz"));
		Assert.assertEquals(true, xyzMiddle.xyzMiddle("xyzxyzAxyzxyzxyz"));
		Assert.assertEquals(false, xyzMiddle.xyzMiddle("xyzxyzAxyzxyzxy"));
		Assert.assertEquals(false, xyzMiddle.xyzMiddle("AxyzxyzBB"));
		Assert.assertEquals(false, xyzMiddle.xyzMiddle(""));
		Assert.assertEquals(false, xyzMiddle.xyzMiddle("x"));
		Assert.assertEquals(false, xyzMiddle.xyzMiddle("xy"));
		Assert.assertEquals(true, xyzMiddle.xyzMiddle("xyz"));
		Assert.assertEquals(true, xyzMiddle.xyzMiddle("xyzz"));
	}

}
