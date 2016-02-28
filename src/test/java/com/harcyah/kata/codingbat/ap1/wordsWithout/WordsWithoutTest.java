package com.harcyah.kata.codingbat.ap1.wordsWithout;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class WordsWithoutTest {

	@Test
	public void testWordsWithout() {
		WordsWithout wordsWithout = new WordsWithout();
		Assertions.assertThat(wordsWithout.wordsWithout(new String[] { "a", "b", "c", "a" }, "a")).isEqualTo(new String[] { "b", "c" });
		Assertions.assertThat(wordsWithout.wordsWithout(new String[] { "a", "b", "c", "a" }, "b")).isEqualTo(new String[] { "a", "c", "a" });
		Assertions.assertThat(wordsWithout.wordsWithout(new String[] { "a", "b", "c", "a" }, "c")).isEqualTo(new String[] { "a", "b", "a" });
		Assertions.assertThat(wordsWithout.wordsWithout(new String[] { "b", "c", "a", "a" }, "b")).isEqualTo(new String[] { "c", "a", "a" });
		Assertions.assertThat(wordsWithout.wordsWithout(new String[] { "xx", "yyy", "x", "yy", "x" }, "x")).isEqualTo(new String[] { "xx", "yyy", "yy" });
		Assertions.assertThat(wordsWithout.wordsWithout(new String[] { "xx", "yyy", "x", "yy", "x" }, "yy")).isEqualTo(new String[] { "xx", "yyy", "x", "x" });
		Assertions.assertThat(wordsWithout.wordsWithout(new String[] { "aa", "ab", "ac", "aa" }, "aa")).isEqualTo(new String[] { "ab", "ac" });
	}

}
