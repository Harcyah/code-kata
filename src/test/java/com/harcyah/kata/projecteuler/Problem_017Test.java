package com.harcyah.kata.projecteuler;

import org.junit.Assert;
import org.junit.Test;

public class Problem_017Test {

	@Test
	public void testGetEnglishLiteralForNumberUnder20() throws Exception {
		Problem_017 problem = new Problem_017();
		Assert.assertEquals("one", problem.getEnglishLiteralOf(1));
		Assert.assertEquals("ten", problem.getEnglishLiteralOf(10));
		Assert.assertEquals("fifteen", problem.getEnglishLiteralOf(15));
	}

	@Test
	public void testGetEnglishLiteralForNumberBetween20And100() throws Exception {
		Problem_017 problem = new Problem_017();
		Assert.assertEquals("twenty", problem.getEnglishLiteralOf(20));
		Assert.assertEquals("fifty-five", problem.getEnglishLiteralOf(55));
		Assert.assertEquals("ninety-nine", problem.getEnglishLiteralOf(99));
	}

	@Test
	public void testGetEnglishLiteralForNumberBetween100And1000() throws Exception {
		Problem_017 problem = new Problem_017();
		Assert.assertEquals("one hundred", problem.getEnglishLiteralOf(100));
		Assert.assertEquals("one thousand", problem.getEnglishLiteralOf(1000));
		Assert.assertEquals("five hundred", problem.getEnglishLiteralOf(500));
		Assert.assertEquals("six hundred and sixty-six", problem.getEnglishLiteralOf(666));
	}

	@Test
	public void testCountLettersOfSumBetween() throws Exception {
		Problem_017 problem = new Problem_017();
		Assert.assertEquals(19, problem.countLettersOfSumBetween(1, 5));
		Assert.assertEquals(21124, problem.countLettersOfSumBetween(1, 1000));
	}

	@Test
	public void testGetLengthOfEnglishLiteral() throws Exception {
		Problem_017 problem = new Problem_017();
		Assert.assertEquals(20, problem.getLengthOfEnglishLiteral(115));
		Assert.assertEquals(23, problem.getLengthOfEnglishLiteral(342));
	}

}
