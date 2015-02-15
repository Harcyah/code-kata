package com.harcyah.kata.codingbat.warmup2.array667;

import org.junit.Assert;
import org.junit.Test;

public class Array667Test {

	@Test
	public void testArray667() {
		Array667 array667 = new Array667();
		Assert.assertEquals(1, array667.array667(new int[] { 6, 6, 2 }));
		Assert.assertEquals(1, array667.array667(new int[] { 6, 6, 2, 6 }));
		Assert.assertEquals(1, array667.array667(new int[] { 6, 7, 2, 6 }));
		Assert.assertEquals(2, array667.array667(new int[] { 6, 6, 2, 6, 7 }));
		Assert.assertEquals(0, array667.array667(new int[] { 1, 6, 3 }));
		Assert.assertEquals(0, array667.array667(new int[] { 6, 1 }));
		Assert.assertEquals(0, array667.array667(new int[] {}));
		Assert.assertEquals(1, array667.array667(new int[] { 3, 6, 7, 6 }));
		Assert.assertEquals(2, array667.array667(new int[] { 3, 6, 6, 7 }));
		Assert.assertEquals(1, array667.array667(new int[] { 6, 3, 6, 6 }));
		Assert.assertEquals(2, array667.array667(new int[] { 6, 7, 6, 6 }));
		Assert.assertEquals(0, array667.array667(new int[] { 1, 2, 3, 5, 6 }));
		Assert.assertEquals(1, array667.array667(new int[] { 1, 2, 3, 6, 6 }));
	}

}
