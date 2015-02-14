package com.harcyah.kata.codingbat.warmup1.backAround;

import org.junit.Assert;
import org.junit.Test;

public class BackAroundTest {

	@Test
	public void testBackAround() {
		BackAround backAround = new BackAround();
		Assert.assertEquals("tcatt", backAround.backAround("cat"));
		Assert.assertEquals("oHelloo", backAround.backAround("Hello"));
		Assert.assertEquals("aaa", backAround.backAround("a"));
		Assert.assertEquals("cabcc", backAround.backAround("abc"));
		Assert.assertEquals("dreadd", backAround.backAround("read"));
		Assert.assertEquals("obooo", backAround.backAround("boo"));
	}

}