package com.harcyah.kata.codingbat.warmup1.startHi;

import org.junit.Assert;
import org.junit.Test;

public class StartHiTest {

	@Test
	public void testStartHi() {
		StartHi startHi = new StartHi();
		Assert.assertEquals(true, startHi.startHi("hi there"));
		Assert.assertEquals(true, startHi.startHi("hi"));
		Assert.assertEquals(false, startHi.startHi("hello hi"));
		Assert.assertEquals(false, startHi.startHi("he"));
		Assert.assertEquals(false, startHi.startHi("h"));
		Assert.assertEquals(false, startHi.startHi(""));
		Assert.assertEquals(false, startHi.startHi("ho hi"));
		Assert.assertEquals(true, startHi.startHi("hi ho"));
	}

}