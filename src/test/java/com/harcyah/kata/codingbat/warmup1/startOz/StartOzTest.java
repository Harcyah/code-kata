package com.harcyah.kata.codingbat.warmup1.startOz;

import org.junit.Assert;
import org.junit.Test;

public class StartOzTest {

	@Test
	public void testStartOz() {
		StartOz startOz = new StartOz();
		Assert.assertEquals("oz", startOz.startOz("ozymandias"));
		Assert.assertEquals("z", startOz.startOz("bzoo"));
		Assert.assertEquals("o", startOz.startOz("oxx"));
		Assert.assertEquals("oz", startOz.startOz("oz"));
		Assert.assertEquals("o", startOz.startOz("ounce"));
		Assert.assertEquals("o", startOz.startOz("o"));
		Assert.assertEquals("", startOz.startOz("abc"));
		Assert.assertEquals("", startOz.startOz(""));
		Assert.assertEquals("", startOz.startOz("zoo"));
		Assert.assertEquals("z", startOz.startOz("aztec"));
		Assert.assertEquals("z", startOz.startOz("zzzz"));
		Assert.assertEquals("oz", startOz.startOz("oznic"));
	}

}