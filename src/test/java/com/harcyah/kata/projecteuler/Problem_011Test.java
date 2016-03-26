package com.harcyah.kata.projecteuler;

import org.junit.Assert;
import org.junit.Test;

public class Problem_011Test {

	@Test
	public void testProblem_011() {
		Problem_011 problem_011 = new Problem_011();
		Assert.assertEquals(70600674, problem_011.getLargestProductInGrid());
	}

}
