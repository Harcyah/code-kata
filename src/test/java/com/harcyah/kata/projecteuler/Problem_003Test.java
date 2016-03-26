package com.harcyah.kata.projecteuler;

import org.junit.Assert;
import org.junit.Test;

public class Problem_003Test {

	@Test
	public void testProblem_003() {
		Problem_003 problem_003 = new Problem_003();
		Assert.assertEquals(29, problem_003.largestPrimeFactor(13195L));
		Assert.assertEquals(6857, problem_003.largestPrimeFactor(600851475143L));
	}

}
