package com.harcyah.kata.codingbat.logic2.makeBricks;

import org.junit.Assert;
import org.junit.Test;

public class MakeBricksTest {

	@Test
	public void testMakeBricks() {
		MakeBricks makeBricks = new MakeBricks();
		Assert.assertEquals(true, makeBricks.makeBricks(3, 1, 8));
		Assert.assertEquals(false, makeBricks.makeBricks(3, 1, 9));
		Assert.assertEquals(true, makeBricks.makeBricks(3, 2, 10));
		Assert.assertEquals(true, makeBricks.makeBricks(3, 2, 8));
		Assert.assertEquals(false, makeBricks.makeBricks(3, 2, 9));
		Assert.assertEquals(true, makeBricks.makeBricks(6, 1, 11));
		Assert.assertEquals(false, makeBricks.makeBricks(6, 0, 11));
		Assert.assertEquals(true, makeBricks.makeBricks(1, 4, 11));
		Assert.assertEquals(true, makeBricks.makeBricks(0, 3, 10));
		Assert.assertEquals(false, makeBricks.makeBricks(1, 4, 12));
		Assert.assertEquals(true, makeBricks.makeBricks(3, 1, 7));
		Assert.assertEquals(false, makeBricks.makeBricks(1, 1, 7));
		Assert.assertEquals(true, makeBricks.makeBricks(2, 1, 7));
		Assert.assertEquals(true, makeBricks.makeBricks(7, 1, 11));
		Assert.assertEquals(true, makeBricks.makeBricks(7, 1, 8));
		Assert.assertEquals(false, makeBricks.makeBricks(7, 1, 13));
		Assert.assertEquals(true, makeBricks.makeBricks(43, 1, 46));
		Assert.assertEquals(false, makeBricks.makeBricks(40, 1, 46));
		Assert.assertEquals(true, makeBricks.makeBricks(40, 2, 47));
		Assert.assertEquals(true, makeBricks.makeBricks(40, 2, 50));
		Assert.assertEquals(false, makeBricks.makeBricks(40, 2, 52));
		Assert.assertEquals(false, makeBricks.makeBricks(22, 2, 33));
		Assert.assertEquals(true, makeBricks.makeBricks(0, 2, 10));
		Assert.assertEquals(true, makeBricks.makeBricks(1000000, 1000, 1000100));
		Assert.assertEquals(false, makeBricks.makeBricks(2, 1000000, 100003));
		Assert.assertEquals(true, makeBricks.makeBricks(20, 0, 19));
		Assert.assertEquals(false, makeBricks.makeBricks(20, 0, 21));
		Assert.assertEquals(false, makeBricks.makeBricks(20, 4, 51));
		Assert.assertEquals(true, makeBricks.makeBricks(20, 4, 39));
	}

}
