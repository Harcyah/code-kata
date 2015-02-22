package com.harcyah.kata.codingbat.logic2.evenlySpaced;

import org.junit.Assert;
import org.junit.Test;

public class EvenlySpacedTest {

	@Test
	public void testEvenlySpaced() {
		EvenlySpaced evenlySpaced = new EvenlySpaced();
		Assert.assertEquals(true, evenlySpaced.evenlySpaced(2, 4, 6));
		Assert.assertEquals(true, evenlySpaced.evenlySpaced(4, 6, 2));
		Assert.assertEquals(false, evenlySpaced.evenlySpaced(4, 6, 3));
		Assert.assertEquals(true, evenlySpaced.evenlySpaced(6, 2, 4));
		Assert.assertEquals(false, evenlySpaced.evenlySpaced(6, 2, 8));
		Assert.assertEquals(true, evenlySpaced.evenlySpaced(2, 2, 2));
		Assert.assertEquals(false, evenlySpaced.evenlySpaced(2, 2, 3));
		Assert.assertEquals(true, evenlySpaced.evenlySpaced(9, 10, 11));
		Assert.assertEquals(true, evenlySpaced.evenlySpaced(10, 9, 11));
		Assert.assertEquals(false, evenlySpaced.evenlySpaced(10, 9, 9));
		Assert.assertEquals(false, evenlySpaced.evenlySpaced(2, 4, 4));
		Assert.assertEquals(false, evenlySpaced.evenlySpaced(2, 2, 4));
		Assert.assertEquals(false, evenlySpaced.evenlySpaced(3, 6, 12));
		Assert.assertEquals(false, evenlySpaced.evenlySpaced(12, 3, 6));
	}

}
