package com.harcyah.kata.projecteuler;

import org.junit.Assert;
import org.junit.Test;

public class Problem_005Test {

	@Test
	public void testGetSmallestPositiveNumberEvenlyDivisible10() throws Exception {
		Problem_005 problem = new Problem_005();
		Assert.assertEquals(2520, problem.getSmallestPositiveNumberEvenlyDivisibleUnder10());
	}

	@Test
	public void testGetSmallestPositiveNumberEvenlyDivisible20() throws Exception {
		Problem_005 problem = new Problem_005();
		Assert.assertEquals(232792560, problem.getSmallestPositiveNumberEvenlyDivisibleUnder20());
	}

}
