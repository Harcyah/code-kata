package com.harcyah.kata.codingbat.warmup2.has271;

import org.junit.Assert;
import org.junit.Test;

public class Has271Test {

	@Test
	public void testHas271() {
		Has271 has271 = new Has271();
		Assert.assertEquals(true, has271.has271(new int[] { 1, 2, 7, 1 }));
		Assert.assertEquals(false, has271.has271(new int[] { 1, 2, 8, 1 }));
		Assert.assertEquals(true, has271.has271(new int[] { 2, 7, 1 }));
		Assert.assertEquals(true, has271.has271(new int[] { 3, 8, 2 }));
		Assert.assertEquals(true, has271.has271(new int[] { 2, 7, 3 }));
		Assert.assertEquals(false, has271.has271(new int[] { 2, 7, 4 }));
		Assert.assertEquals(true, has271.has271(new int[] { 2, 7, -1 }));
		Assert.assertEquals(false, has271.has271(new int[] { 2, 7, -2 }));
		Assert.assertEquals(true, has271.has271(new int[] { 4, 5, 3, 8, 0 }));
		Assert.assertEquals(true, has271.has271(new int[] { 2, 7, 5, 10, 4 }));
		Assert.assertEquals(true, has271.has271(new int[] { 2, 7, -2, 4, 9, 3 }));
		Assert.assertEquals(false, has271.has271(new int[] { 2, 7, 5, 10, 1 }));
		Assert.assertEquals(false, has271.has271(new int[] { 2, 7, -2, 4, 10, 2 }));
	}

}
