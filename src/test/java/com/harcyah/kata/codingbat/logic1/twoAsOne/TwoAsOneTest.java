package com.harcyah.kata.codingbat.logic1.twoAsOne;

import org.junit.Assert;
import org.junit.Test;

public class TwoAsOneTest {

	@Test
	public void testTwoAsOne() {
		TwoAsOne twoAsOne = new TwoAsOne();
		Assert.assertEquals(true, twoAsOne.twoAsOne(1, 2, 3));
		Assert.assertEquals(true, twoAsOne.twoAsOne(3, 1, 2));
		Assert.assertEquals(false, twoAsOne.twoAsOne(3, 2, 2));
		Assert.assertEquals(true, twoAsOne.twoAsOne(2, 3, 1));
		Assert.assertEquals(true, twoAsOne.twoAsOne(5, 3, -2));
		Assert.assertEquals(false, twoAsOne.twoAsOne(5, 3, -3));
		Assert.assertEquals(true, twoAsOne.twoAsOne(2, 5, 3));
		Assert.assertEquals(false, twoAsOne.twoAsOne(9, 5, 5));
		Assert.assertEquals(true, twoAsOne.twoAsOne(9, 4, 5));
		Assert.assertEquals(true, twoAsOne.twoAsOne(5, 4, 9));
		Assert.assertEquals(true, twoAsOne.twoAsOne(3, 3, 0));
		Assert.assertEquals(false, twoAsOne.twoAsOne(3, 3, 2));
	}

}
