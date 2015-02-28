package com.harcyah.kata.codingbat.string2.catDog;

import org.junit.Assert;
import org.junit.Test;

public class CatDogTest {

	@Test
	public void testCatDog() {
		CatDog catDog = new CatDog();
		Assert.assertEquals(true, catDog.catDog("catdog"));
		Assert.assertEquals(false, catDog.catDog("catcat"));
		Assert.assertEquals(true, catDog.catDog("1cat1cadodog"));
		Assert.assertEquals(false, catDog.catDog("catxxdogxxxdog"));
		Assert.assertEquals(true, catDog.catDog("catxdogxdogxcat"));
		Assert.assertEquals(false, catDog.catDog("catxdogxdogxca"));
		Assert.assertEquals(false, catDog.catDog("dogdogcat"));
		Assert.assertEquals(true, catDog.catDog("dogogcat"));
		Assert.assertEquals(false, catDog.catDog("dog"));
		Assert.assertEquals(false, catDog.catDog("cat"));
		Assert.assertEquals(true, catDog.catDog("ca"));
		Assert.assertEquals(true, catDog.catDog("c"));
		Assert.assertEquals(true, catDog.catDog(""));
	}

}
