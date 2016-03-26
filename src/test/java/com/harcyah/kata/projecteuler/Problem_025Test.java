package com.harcyah.kata.projecteuler;

import org.junit.Assert;
import org.junit.Test;

public class Problem_025Test {

	@Test
	public void testProblem_025() {
		Problem_025 problem_025 = new Problem_025();
		Assert.assertEquals(12, problem_025.getFibonacciSequenceLength(3));
		Assert.assertEquals(4782, problem_025.getFibonacciSequenceLength(1000));
	}

}
