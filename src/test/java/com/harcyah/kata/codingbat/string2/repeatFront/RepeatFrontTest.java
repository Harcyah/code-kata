package com.harcyah.kata.codingbat.string2.repeatFront;

import org.junit.Assert;
import org.junit.Test;

public class RepeatFrontTest {

	@Test
	public void testRepeatFront() {
		RepeatFront repeatFront = new RepeatFront();
		Assert.assertEquals("ChocChoChC", repeatFront.repeatFront("Chocolate", 4));
		Assert.assertEquals("ChoChC", repeatFront.repeatFront("Chocolate", 3));
		Assert.assertEquals("IcI", repeatFront.repeatFront("Ice Cream", 2));
		Assert.assertEquals("I", repeatFront.repeatFront("Ice Cream", 1));
		Assert.assertEquals("", repeatFront.repeatFront("Ice Cream", 0));
		Assert.assertEquals("xyzxyx", repeatFront.repeatFront("xyz", 3));
		Assert.assertEquals("", repeatFront.repeatFront("", 0));
		Assert.assertEquals("JavaJavJaJ", repeatFront.repeatFront("Java", 4));
		Assert.assertEquals("J", repeatFront.repeatFront("Java", 1));
	}

}
