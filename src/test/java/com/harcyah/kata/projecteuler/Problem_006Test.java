package com.harcyah.kata.projecteuler;

import org.junit.Assert;
import org.junit.Test;

public class Problem_006Test {

	@Test
	public void testProblem_006() {
		Problem_006 problem_006 = new Problem_006();
		Assert.assertEquals(25164150L, problem_006.getSumSquareDifference());
	}

}
