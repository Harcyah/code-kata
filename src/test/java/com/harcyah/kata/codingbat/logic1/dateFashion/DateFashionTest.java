package com.harcyah.kata.codingbat.logic1.dateFashion;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTest {

	@Test
	public void testDateFashion() {
		DateFashion dateFashion = new DateFashion();
		Assert.assertEquals(2, dateFashion.dateFashion(5, 10));
		Assert.assertEquals(0, dateFashion.dateFashion(5, 2));
		Assert.assertEquals(1, dateFashion.dateFashion(5, 5));
		Assert.assertEquals(1, dateFashion.dateFashion(3, 3));
		Assert.assertEquals(0, dateFashion.dateFashion(10, 2));
		Assert.assertEquals(0, dateFashion.dateFashion(2, 9));
		Assert.assertEquals(2, dateFashion.dateFashion(9, 9));
		Assert.assertEquals(2, dateFashion.dateFashion(10, 5));
		Assert.assertEquals(0, dateFashion.dateFashion(2, 2));
		Assert.assertEquals(1, dateFashion.dateFashion(3, 7));
		Assert.assertEquals(0, dateFashion.dateFashion(2, 7));
		Assert.assertEquals(0, dateFashion.dateFashion(6, 2));
	}

}
