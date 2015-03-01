package com.harcyah.kata.codingbat.string2.bobThere;

import org.junit.Assert;
import org.junit.Test;

public class BobThereTest {

	@Test
	public void testBobThere() {
		BobThere bobThere = new BobThere();
		Assert.assertEquals(true, bobThere.bobThere("abcbob"));
		Assert.assertEquals(true, bobThere.bobThere("b9b"));
		Assert.assertEquals(false, bobThere.bobThere("bac"));
		Assert.assertEquals(true, bobThere.bobThere("bbb"));
		Assert.assertEquals(false, bobThere.bobThere("abcdefb"));
		Assert.assertEquals(true, bobThere.bobThere("123abcbcdbabxyz"));
		Assert.assertEquals(false, bobThere.bobThere("b12"));
		Assert.assertEquals(true, bobThere.bobThere("b1b"));
		Assert.assertEquals(true, bobThere.bobThere("b12b1b"));
		Assert.assertEquals(false, bobThere.bobThere("bbc"));
		Assert.assertEquals(true, bobThere.bobThere("bbb"));
		Assert.assertEquals(false, bobThere.bobThere("bb"));
		Assert.assertEquals(false, bobThere.bobThere("b"));
	}

}
