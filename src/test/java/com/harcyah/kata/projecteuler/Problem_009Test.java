package com.harcyah.kata.projecteuler;

import org.junit.Assert;
import org.junit.Test;

public class Problem_009Test {

	@Test
	public void testProblem_009() {
		Problem_009 problem_009 = new Problem_009();
		Assert.assertEquals(31875000, problem_009.getSpecialPythagoreanTriplet());
	}

}
