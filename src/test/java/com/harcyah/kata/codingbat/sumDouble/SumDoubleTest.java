package com.harcyah.kata.codingbat.sumDouble;

import org.junit.Assert;
import org.junit.Test;

public class SumDoubleTest {

	@Test
	public void testSumDouble() {
		SumDouble sumDouble = new SumDouble();
		Assert.assertEquals(3, sumDouble.sumDouble(1, 2));
		Assert.assertEquals(5, sumDouble.sumDouble(3, 2));
		Assert.assertEquals(8, sumDouble.sumDouble(2, 2));
	}

}
