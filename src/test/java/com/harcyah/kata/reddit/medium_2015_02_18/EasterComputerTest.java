package com.harcyah.kata.reddit.medium_2015_02_18;

import org.joda.time.LocalDate;
import org.junit.Assert;
import org.junit.Test;

public class EasterComputerTest {

	@Test
	public void testCompute() {
		EasterComputer ec = new EasterComputer();
		Assert.assertEquals(new LocalDate(2006, 4, 16), ec.compute(2006));
		Assert.assertEquals(new LocalDate(2014, 4, 20), ec.compute(2014));
		Assert.assertEquals(new LocalDate(2015, 4, 5), ec.compute(2015));
		Assert.assertEquals(new LocalDate(2016, 3, 27), ec.compute(2016));
		Assert.assertEquals(new LocalDate(2017, 4, 16), ec.compute(2017));
	}

}
