package com.harcyah.kata.projecteuler;

import org.junit.Assert;
import org.junit.Test;

public class Problem_016Test {

	@Test
	public void testProblem_016() {
		Problem_016 problem_016 = new Problem_016();
		Assert.assertEquals(26, problem_016.getPowerDigitSum(15));
		Assert.assertEquals(1366, problem_016.getPowerDigitSum(1000));
	}

}
