package com.harcyah.kata.codingbat.ap1.wordsFront;

import org.junit.Assert;
import org.junit.Test;

public class WordsFrontTest {

	@Test
	public void testWordsFront() {
		WordsFront wordsFront = new WordsFront();
		Assert.assertArrayEquals(new String[] { "a" }, wordsFront.wordsFront(new String[] { "a", "b", "c", "d" }, 1));
		Assert.assertArrayEquals(new String[] { "a", "b" }, wordsFront.wordsFront(new String[] { "a", "b", "c", "d" }, 2));
		Assert.assertArrayEquals(new String[] { "a", "b", "c" }, wordsFront.wordsFront(new String[] { "a", "b", "c", "d" }, 3));
		Assert.assertArrayEquals(new String[] { "a", "b", "c", "d" }, wordsFront.wordsFront(new String[] { "a", "b", "c", "d" }, 4));
		Assert.assertArrayEquals(new String[] { "Hi" }, wordsFront.wordsFront(new String[] { "Hi", "There" }, 1));
		Assert.assertArrayEquals(new String[] { "Hi", "There" }, wordsFront.wordsFront(new String[] { "Hi", "There" }, 2));
	}
}
