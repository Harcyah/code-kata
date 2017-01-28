package com.harcyah.kata.codingbat.map2.wordLen;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;

public class WordLenTest {

	@Test
	public void testWordLen() {
		WordLen wordLen = new WordLen();
		Assertions.assertThat(wordLen.wordLen(new String[] { "a", "bb", "a", "bb" })).isEqualTo(ImmutableMap.of("a", 1, "bb", 2));
		Assertions.assertThat(wordLen.wordLen(new String[] { "this", "and", "that", "and" })).isEqualTo(ImmutableMap.of("that", 4, "this", 4, "and", 3));
		Assertions.assertThat(wordLen.wordLen(new String[] { "code", "code", "code", "bug" })).isEqualTo(ImmutableMap.of("bug", 3, "code", 4));
		Assertions.assertThat(wordLen.wordLen(new String[] {})).isEqualTo(ImmutableMap.of());
		Assertions.assertThat(wordLen.wordLen(new String[] { "z" })).isEqualTo(ImmutableMap.of("z", 1));
	}

}