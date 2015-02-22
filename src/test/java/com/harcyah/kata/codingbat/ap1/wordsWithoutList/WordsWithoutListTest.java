package com.harcyah.kata.codingbat.ap1.wordsWithoutList;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.collect.ImmutableList;

public class WordsWithoutListTest {

	@Test
	public void testWordsWithoutList() {
		WordsWithoutList wordsWithoutList = new WordsWithoutList();
		Assert.assertTrue(
			ImmutableList.of("bb", "ccc").equals(
				wordsWithoutList.wordsWithoutList(new String[] { "a", "bb", "b", "ccc" }, 1)));
		Assert.assertTrue(
			ImmutableList.of("a", "bb", "b").equals(
				wordsWithoutList.wordsWithoutList(new String[] { "a", "bb", "b", "ccc" }, 3)));
		Assert.assertTrue(
			ImmutableList.of("a", "bb", "b", "ccc").equals(
				wordsWithoutList.wordsWithoutList(new String[] { "a", "bb", "b", "ccc" }, 4)));
		Assert.assertTrue(
			ImmutableList.of("xx", "yyy", "yy").equals(
				wordsWithoutList.wordsWithoutList(new String[] { "xx", "yyy", "x", "yy", "z" }, 1)));
		Assert.assertTrue(
			ImmutableList.of("yyy", "x", "z").equals(
				wordsWithoutList.wordsWithoutList(new String[] { "xx", "yyy", "x", "yy", "z" }, 2)));
	}

}
