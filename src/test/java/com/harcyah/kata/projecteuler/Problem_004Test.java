package com.harcyah.kata.projecteuler;

import org.junit.Assert;
import org.junit.Test;

public class Problem_004Test {

	@Test
	public void testProblem_004() {
		Problem_004 problem_004 = new Problem_004();
		Assert.assertEquals(9009, problem_004.getLargestPalindrome(2));
		Assert.assertEquals(906609, problem_004.getLargestPalindrome(3));
	}

}
