package com.harcyah.kata.projecteuler;

import org.junit.Assert;
import org.junit.Test;

public class Problem002Test {

	@Test
	public void testProblem002() {
		Problem002 p2 = new Problem002();
		Assert.assertEquals(4613732, p2.sumEvenFibonacci(4000000));
	}

}
