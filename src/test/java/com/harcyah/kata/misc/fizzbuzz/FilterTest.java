package com.harcyah.kata.misc.fizzbuzz;

import com.harcyah.kata.misc.fizzbuzz.Filter.Filters;
import org.junit.Assert;
import org.junit.Test;

public class FilterTest {

	@Test
	public void testFilter3() {
		Assert.assertEquals("Fizz", Filters.MULT_3.getLabel());
		Assert.assertTrue(Filters.MULT_3.matches(3));
		Assert.assertTrue(Filters.MULT_3.matches(15));
		Assert.assertTrue(Filters.MULT_3.matches(33));
		Assert.assertFalse(Filters.MULT_3.matches(4));
		Assert.assertFalse(Filters.MULT_3.matches(5));
		Assert.assertFalse(Filters.MULT_3.matches(32));
	}

	@Test
	public void testFilter5() {
		Assert.assertEquals("Buzz", Filters.MULT_5.getLabel());
		Assert.assertTrue(Filters.MULT_5.matches(5));
		Assert.assertTrue(Filters.MULT_5.matches(15));
		Assert.assertTrue(Filters.MULT_5.matches(50));
		Assert.assertFalse(Filters.MULT_5.matches(4));
		Assert.assertFalse(Filters.MULT_5.matches(6));
		Assert.assertFalse(Filters.MULT_5.matches(32));
	}

	@Test
	public void testFilter35() {
		Assert.assertTrue(Filters.MULT_3_5.matches(15));
		Assert.assertTrue(Filters.MULT_3_5.matches(30));
		Assert.assertTrue(Filters.MULT_3_5.matches(45));
		Assert.assertFalse(Filters.MULT_3_5.matches(4));
		Assert.assertFalse(Filters.MULT_3_5.matches(6));
		Assert.assertFalse(Filters.MULT_3_5.matches(32));
	}

}
