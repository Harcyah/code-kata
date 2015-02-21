package com.harcyah.kata.codingbat.logic2.noTeenSum;

import org.junit.Assert;
import org.junit.Test;

public class NoTeenSumTest {

	@Test
	public void testNoTeenSum() {
		NoTeenSum noTeenSum = new NoTeenSum();
		Assert.assertEquals(6, noTeenSum.noTeenSum(1, 2, 3));
		Assert.assertEquals(3, noTeenSum.noTeenSum(2, 13, 1));
		Assert.assertEquals(3, noTeenSum.noTeenSum(2, 1, 14));
		Assert.assertEquals(18, noTeenSum.noTeenSum(2, 1, 15));
		Assert.assertEquals(19, noTeenSum.noTeenSum(2, 1, 16));
		Assert.assertEquals(3, noTeenSum.noTeenSum(2, 1, 17));
		Assert.assertEquals(3, noTeenSum.noTeenSum(17, 1, 2));
		Assert.assertEquals(19, noTeenSum.noTeenSum(2, 15, 2));
		Assert.assertEquals(16, noTeenSum.noTeenSum(16, 17, 18));
		Assert.assertEquals(0, noTeenSum.noTeenSum(17, 18, 19));
		Assert.assertEquals(32, noTeenSum.noTeenSum(15, 16, 1));
		Assert.assertEquals(30, noTeenSum.noTeenSum(15, 15, 19));
		Assert.assertEquals(31, noTeenSum.noTeenSum(15, 19, 16));
		Assert.assertEquals(5, noTeenSum.noTeenSum(5, 17, 18));
		Assert.assertEquals(16, noTeenSum.noTeenSum(17, 18, 16));
		Assert.assertEquals(0, noTeenSum.noTeenSum(17, 19, 18));
	}

}
