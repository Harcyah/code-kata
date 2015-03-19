package com.harcyah.kata.codingbat.string1.deFront;

import org.junit.Assert;
import org.junit.Test;

public class DeFrontTest {

	@Test
	public void testDeFront() {
		DeFront deFront = new DeFront();
		Assert.assertEquals("llo", deFront.deFront("Hello"));
		Assert.assertEquals("va", deFront.deFront("java"));
		Assert.assertEquals("aay", deFront.deFront("away"));
		Assert.assertEquals("ay", deFront.deFront("axy"));
		Assert.assertEquals("abc", deFront.deFront("abc"));
		Assert.assertEquals("by", deFront.deFront("xby"));
		Assert.assertEquals("ab", deFront.deFront("ab"));
		Assert.assertEquals("a", deFront.deFront("ax"));
		Assert.assertEquals("ab", deFront.deFront("axb"));
		Assert.assertEquals("aa", deFront.deFront("aaa"));
		Assert.assertEquals("bc", deFront.deFront("xbc"));
		Assert.assertEquals("bb", deFront.deFront("bbb"));
		Assert.assertEquals("zz", deFront.deFront("bazz"));
		Assert.assertEquals("", deFront.deFront("ba"));
		Assert.assertEquals("abxyz", deFront.deFront("abxyz"));
		Assert.assertEquals("", deFront.deFront("hi"));
		Assert.assertEquals("s", deFront.deFront("his"));
		Assert.assertEquals("", deFront.deFront("xz"));
		Assert.assertEquals("z", deFront.deFront("zzz"));
	}

}
