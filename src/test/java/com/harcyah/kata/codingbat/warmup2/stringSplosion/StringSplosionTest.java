package com.harcyah.kata.codingbat.warmup2.stringSplosion;

import org.junit.Assert;
import org.junit.Test;

public class StringSplosionTest {

	@Test
	public void testStringSplosion() {
		StringSplosion stringSplosion = new StringSplosion();
		Assert.assertEquals("CCoCodCode", stringSplosion.stringSplosion("Code"));
		Assert.assertEquals("aababc", stringSplosion.stringSplosion("abc"));
		Assert.assertEquals("aab", stringSplosion.stringSplosion("ab"));
		Assert.assertEquals("x", stringSplosion.stringSplosion("x"));
		Assert.assertEquals("ffafadfade", stringSplosion.stringSplosion("fade"));
		Assert.assertEquals("TThTheTherThere", stringSplosion.stringSplosion("There"));
		Assert.assertEquals("KKiKitKittKitteKitten", stringSplosion.stringSplosion("Kitten"));
		Assert.assertEquals("BByBye", stringSplosion.stringSplosion("Bye"));
		Assert.assertEquals("GGoGooGood", stringSplosion.stringSplosion("Good"));
		Assert.assertEquals("BBaBad", stringSplosion.stringSplosion("Bad"));
	}

}
