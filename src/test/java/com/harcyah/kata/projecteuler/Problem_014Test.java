package com.harcyah.kata.projecteuler;

import org.junit.Assert;
import org.junit.Test;

public class Problem_014Test {

	@Test
	public void testProblem_014() {
		Problem_014 problem_014 = new Problem_014();
		Assert.assertEquals(837799, problem_014.getLongestCollatzSequence(1000000));
	}

}
