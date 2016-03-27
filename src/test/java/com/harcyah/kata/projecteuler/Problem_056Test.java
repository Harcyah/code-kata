package com.harcyah.kata.projecteuler;

import org.junit.Assert;
import org.junit.Test;

public class Problem_056Test {

	@Test
	public void testGetPowerfulDigitSum() throws Exception {
		Problem_056 problem_056 = new Problem_056();
		Assert.assertEquals(972L, problem_056.getPowerfulDigitSum());
	}

	@Test
	public void testSumDigits() throws Exception {
		Problem_056 problem_056 = new Problem_056();
		Assert.assertEquals(4, problem_056.sumDigits("13"));
		Assert.assertEquals(1, problem_056.sumDigits("1000"));
	}

}
