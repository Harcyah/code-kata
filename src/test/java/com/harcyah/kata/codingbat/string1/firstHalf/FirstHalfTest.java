package com.harcyah.kata.codingbat.string1.firstHalf;

import org.junit.Assert;
import org.junit.Test;

public class FirstHalfTest {

	@Test
	public void testFirstHalf() {
		FirstHalf firstHalf = new FirstHalf();
		Assert.assertEquals("Woo", firstHalf.firstHalf("WooHoo"));
		Assert.assertEquals("Hello", firstHalf.firstHalf("HelloThere"));
		Assert.assertEquals("abc", firstHalf.firstHalf("abcdef"));
		Assert.assertEquals("a", firstHalf.firstHalf("ab"));
		Assert.assertEquals("", firstHalf.firstHalf(""));
		Assert.assertEquals("01234", firstHalf.firstHalf("0123456789"));
		Assert.assertEquals("kit", firstHalf.firstHalf("kitten"));
	}

}
