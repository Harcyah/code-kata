package com.harcyah.kata.codingbat.ap1.copyEvens;

import org.junit.Assert;
import org.junit.Test;

public class CopyEvensTest {

	@Test
	public void testCopyEvens() {
		CopyEvens copyEvens = new CopyEvens();
		Assert.assertArrayEquals(new int[] { 2, 4 }, copyEvens.copyEvens(new int[] { 3, 2, 4, 5, 8 }, 2));
		Assert.assertArrayEquals(new int[] { 2, 4, 8 }, copyEvens.copyEvens(new int[] { 3, 2, 4, 5, 8 }, 3));
		Assert.assertArrayEquals(new int[] { 6, 2, 4 }, copyEvens.copyEvens(new int[] { 6, 1, 2, 4, 5, 8 }, 3));
		Assert.assertArrayEquals(new int[] { 6, 2, 4, 8 }, copyEvens.copyEvens(new int[] { 6, 1, 2, 4, 5, 8 }, 4));
		Assert.assertArrayEquals(new int[] { 4 }, copyEvens.copyEvens(new int[] { 3, 1, 4, 1, 5 }, 1));
		Assert.assertArrayEquals(new int[] { 2 }, copyEvens.copyEvens(new int[] { 2 }, 1));
		Assert.assertArrayEquals(new int[] { 6, 2 }, copyEvens.copyEvens(new int[] { 6, 2, 4, 8 }, 2));
		Assert.assertArrayEquals(new int[] { 6, 2, 4 }, copyEvens.copyEvens(new int[] { 6, 2, 4, 8 }, 3));
		Assert.assertArrayEquals(new int[] { 6, 2, 4, 8 }, copyEvens.copyEvens(new int[] { 6, 2, 4, 8 }, 4));
		Assert.assertArrayEquals(new int[] { 8 }, copyEvens.copyEvens(new int[] { 1, 8, 4 }, 1));
		Assert.assertArrayEquals(new int[] { 8, 4 }, copyEvens.copyEvens(new int[] { 1, 8, 4 }, 2));
		Assert.assertArrayEquals(new int[] { 2, 8 }, copyEvens.copyEvens(new int[] { 2, 8, 4 }, 2));
	}

}
