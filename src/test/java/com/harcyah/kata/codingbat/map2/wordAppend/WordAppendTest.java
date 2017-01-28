package com.harcyah.kata.codingbat.map2.wordAppend;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class WordAppendTest {

	@Test
	public void testWordAppend() {
		WordAppend wordAppend = new WordAppend();
		Assertions.assertThat(wordAppend.wordAppend(new String[] { "a", "b", "a" })).isEqualTo("a");
		Assertions.assertThat(wordAppend.wordAppend(new String[] { "a", "b", "a", "c", "a", "d", "a" })).isEqualTo("aa");
		Assertions.assertThat(wordAppend.wordAppend(new String[] { "a", "", "a" })).isEqualTo("a");
		Assertions.assertThat(wordAppend.wordAppend(new String[] {})).isEqualTo("");
		Assertions.assertThat(wordAppend.wordAppend(new String[] { "a", "b", "b", "a", "a" })).isEqualTo("ba");
		Assertions.assertThat(wordAppend.wordAppend(new String[] { "a", "b", "b", "b", "a", "c", "a", "a" })).isEqualTo("baa");
		Assertions.assertThat(wordAppend.wordAppend(new String[] { "a", "b", "b", "b", "a", "c", "a", "a", "a", "b", "a" })).isEqualTo("baaba");
		Assertions.assertThat(wordAppend.wordAppend(new String[] { "not", "and", "or", "and", "this", "and", "or", "that", "not" })).isEqualTo("andornot");
		Assertions.assertThat(wordAppend.wordAppend(new String[] { "a", "b", "c" })).isEqualTo("");
		Assertions.assertThat(wordAppend.wordAppend(new String[] { "this", "or", "that", "and", "this", "and", "that" })).isEqualTo("thisandthat");
		Assertions.assertThat(wordAppend.wordAppend(new String[] { "xx", "xx", "yy", "xx", "zz", "yy", "zz", "xx" })).isEqualTo("xxyyzzxx");
	}

}