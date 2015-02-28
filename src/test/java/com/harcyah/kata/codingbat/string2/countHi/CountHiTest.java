package com.harcyah.kata.codingbat.string2.countHi;

import org.junit.Assert;
import org.junit.Test;

public class CountHiTest {

	@Test
	public void testCountHi() {
		CountHi countHi = new CountHi();
		Assert.assertEquals(1, countHi.countHi("abc hi ho"));
		Assert.assertEquals(2, countHi.countHi("ABChi hi"));
		Assert.assertEquals(2, countHi.countHi("hihi"));
		Assert.assertEquals(2, countHi.countHi("hiHIhi"));
		Assert.assertEquals(0, countHi.countHi(""));
		Assert.assertEquals(0, countHi.countHi("h"));
		Assert.assertEquals(1, countHi.countHi("hi"));
		Assert.assertEquals(0, countHi.countHi("Hi is no HI on ahI"));
		Assert.assertEquals(2, countHi.countHi("hiho not HOHIhi"));
	}

}
