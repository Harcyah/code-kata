package com.harcyah.kata.codingbat.logic2.makeChocolate;

import org.junit.Assert;
import org.junit.Test;

public class MakeChocolateTest {

	@Test
	public void testMakeChocolate() {
		MakeChocolate makeChocolate = new MakeChocolate();
		Assert.assertEquals(4, makeChocolate.makeChocolate(4, 1, 9));
		Assert.assertEquals(-1, makeChocolate.makeChocolate(4, 1, 10));
		Assert.assertEquals(2, makeChocolate.makeChocolate(4, 1, 7));
		Assert.assertEquals(2, makeChocolate.makeChocolate(6, 2, 7));
		Assert.assertEquals(0, makeChocolate.makeChocolate(4, 1, 5));
		Assert.assertEquals(4, makeChocolate.makeChocolate(4, 1, 4));
		Assert.assertEquals(4, makeChocolate.makeChocolate(5, 4, 9));
		Assert.assertEquals(3, makeChocolate.makeChocolate(9, 3, 18));
		Assert.assertEquals(-1, makeChocolate.makeChocolate(3, 1, 9));
		Assert.assertEquals(-1, makeChocolate.makeChocolate(1, 2, 7));
		Assert.assertEquals(1, makeChocolate.makeChocolate(1, 2, 6));
		Assert.assertEquals(0, makeChocolate.makeChocolate(1, 2, 5));
		Assert.assertEquals(5, makeChocolate.makeChocolate(6, 1, 10));
		Assert.assertEquals(6, makeChocolate.makeChocolate(6, 1, 11));
		Assert.assertEquals(-1, makeChocolate.makeChocolate(6, 1, 12));
		Assert.assertEquals(-1, makeChocolate.makeChocolate(6, 1, 13));
		Assert.assertEquals(0, makeChocolate.makeChocolate(6, 2, 10));
		Assert.assertEquals(1, makeChocolate.makeChocolate(6, 2, 11));
		Assert.assertEquals(2, makeChocolate.makeChocolate(6, 2, 12));
		Assert.assertEquals(50, makeChocolate.makeChocolate(60, 100, 550));
		Assert.assertEquals(6, makeChocolate.makeChocolate(1000, 1000000, 5000006));
		Assert.assertEquals(7, makeChocolate.makeChocolate(7, 1, 12));
		Assert.assertEquals(-1, makeChocolate.makeChocolate(7, 1, 13));
		Assert.assertEquals(3, makeChocolate.makeChocolate(7, 2, 13));
	}

}
