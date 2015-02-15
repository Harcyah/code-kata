package com.harcyah.kata.codingbat.warmup2.stringTimes;

import org.junit.Assert;
import org.junit.Test;

public class StringTimesTest {

	@Test
	public void teststringTimes() {
		StringTimes stringTimes = new StringTimes();
		Assert.assertEquals("HiHi", stringTimes.stringTimes("Hi", 2));
		Assert.assertEquals("HiHiHi", stringTimes.stringTimes("Hi", 3));
		Assert.assertEquals("Hi", stringTimes.stringTimes("Hi", 1));
		Assert.assertEquals("", stringTimes.stringTimes("Hi", 0));
		Assert.assertEquals("HiHiHiHiHi", stringTimes.stringTimes("Hi", 5));
		Assert.assertEquals("Oh Boy!Oh Boy!", stringTimes.stringTimes("Oh Boy!", 2));
		Assert.assertEquals("xxxx", stringTimes.stringTimes("x", 4));
		Assert.assertEquals("", stringTimes.stringTimes("", 4));
		Assert.assertEquals("codecode", stringTimes.stringTimes("code", 2));
		Assert.assertEquals("codecodecode", stringTimes.stringTimes("code", 3));
	}

}
