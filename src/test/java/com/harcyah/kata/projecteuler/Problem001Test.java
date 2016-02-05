package com.harcyah.kata.projecteuler;

import org.junit.Assert;
import org.junit.Test;

public class Problem001Test {

	@Test
	public void testProblem001() {
		Problem001 p = new Problem001();
		Assert.assertEquals(23, p.sumMultipleThreeAndFive(10));
		Assert.assertEquals(233168, p.sumMultipleThreeAndFive(1000));
	}

}
