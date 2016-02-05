package com.harcyah.kata.projecteuler;

import org.junit.Assert;
import org.junit.Test;

public class Problem004Test {

	@Test
	public void testProblem004() {
		Problem004 p4 = new Problem004();
		Assert.assertEquals(9009, p4.getLargestPalindrome(2));
		Assert.assertEquals(906609, p4.getLargestPalindrome(3));
	}

}
