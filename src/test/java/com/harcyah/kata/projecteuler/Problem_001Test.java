package com.harcyah.kata.projecteuler;

import org.junit.Assert;
import org.junit.Test;

public class Problem_001Test {

	@Test
	public void testProblem_001() {
		Problem_001 problem_001 = new Problem_001();
		Assert.assertEquals(23, problem_001.sumMultipleThreeAndFive(10));
		Assert.assertEquals(233168, problem_001.sumMultipleThreeAndFive(1000));
	}

}
