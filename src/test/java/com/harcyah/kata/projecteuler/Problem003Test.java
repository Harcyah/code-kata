package com.harcyah.kata.projecteuler;

import org.junit.Assert;
import org.junit.Test;

public class Problem003Test {

	@Test
	public void testProblem003() {
		Problem003 p3 = new Problem003();
		Assert.assertEquals(29, p3.largestPrimeFactor(13195L));
		Assert.assertEquals(6857, p3.largestPrimeFactor(600851475143L));
	}

}
