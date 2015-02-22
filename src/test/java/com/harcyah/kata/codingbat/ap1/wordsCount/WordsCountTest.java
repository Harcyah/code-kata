package com.harcyah.kata.codingbat.ap1.wordsCount;

import org.junit.Assert;
import org.junit.Test;

public class WordsCountTest {

	@Test
	public void testWordsCount() {
		WordsCount wordsCount = new WordsCount();
		Assert.assertEquals(2, wordsCount.wordsCount(new String[] { "a", "bb", "b", "ccc" }, 1));
		Assert.assertEquals(1, wordsCount.wordsCount(new String[] { "a", "bb", "b", "ccc" }, 3));
		Assert.assertEquals(0, wordsCount.wordsCount(new String[] { "a", "bb", "b", "ccc" }, 4));
		Assert.assertEquals(2, wordsCount.wordsCount(new String[] { "xx", "yyy", "x", "yy", "z" }, 1));
		Assert.assertEquals(2, wordsCount.wordsCount(new String[] { "xx", "yyy", "x", "yy", "z" }, 2));
		Assert.assertEquals(1, wordsCount.wordsCount(new String[] { "xx", "yyy", "x", "yy", "z" }, 3));
	}

}
