package com.harcyah.kata.projecteuler;

import org.junit.Assert;
import org.junit.Test;

public class Problem_010Test {

	@Test
	public void testProblem_010() {
		Problem_010 problem_010 = new Problem_010();
		Assert.assertEquals(17L, problem_010.getSummationOfPrimes(10));
		Assert.assertEquals(142913828922L, problem_010.getSummationOfPrimes(2000000));
	}

}
