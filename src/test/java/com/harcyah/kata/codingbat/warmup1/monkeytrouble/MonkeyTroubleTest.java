package com.harcyah.kata.codingbat.warmup1.monkeytrouble;

import org.junit.Assert;
import org.junit.Test;

public class MonkeyTroubleTest {

	@Test
	public void testMonkeyTrouble() {
		MonkeyTrouble monkeyTrouble = new MonkeyTrouble();
		Assert.assertTrue(monkeyTrouble.monkeyTrouble(true, true));
		Assert.assertTrue(monkeyTrouble.monkeyTrouble(false, false));
		Assert.assertFalse(monkeyTrouble.monkeyTrouble(true, false));
		Assert.assertFalse(monkeyTrouble.monkeyTrouble(false, true));
	}

}
