package com.harcyah.kata.codingbat.logic1.caughtSpeeding;

import org.junit.Assert;
import org.junit.Test;

public class CaughtSpeedingTest {

	@Test
	public void testCaughtSpeeding() {
		CaughtSpeeding caughtSpeeding = new CaughtSpeeding();
		Assert.assertEquals(0, caughtSpeeding.caughtSpeeding(60, false));
		Assert.assertEquals(1, caughtSpeeding.caughtSpeeding(65, false));
		Assert.assertEquals(0, caughtSpeeding.caughtSpeeding(65, true));
		Assert.assertEquals(1, caughtSpeeding.caughtSpeeding(80, false));
		Assert.assertEquals(2, caughtSpeeding.caughtSpeeding(85, false));
		Assert.assertEquals(1, caughtSpeeding.caughtSpeeding(85, true));
		Assert.assertEquals(1, caughtSpeeding.caughtSpeeding(70, false));
		Assert.assertEquals(1, caughtSpeeding.caughtSpeeding(75, false));
		Assert.assertEquals(1, caughtSpeeding.caughtSpeeding(75, true));
		Assert.assertEquals(0, caughtSpeeding.caughtSpeeding(40, false));
		Assert.assertEquals(0, caughtSpeeding.caughtSpeeding(40, true));
		Assert.assertEquals(2, caughtSpeeding.caughtSpeeding(90, false));
	}

}
