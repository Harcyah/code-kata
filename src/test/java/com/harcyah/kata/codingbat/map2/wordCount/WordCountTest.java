package com.harcyah.kata.codingbat.map2.wordCount;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;
import com.harcyah.kata.codingbat.MapBuilder;

public class WordCountTest {

	@Test
	public void testWordCount() {
		WordCount wordCount = new WordCount();
		Assertions.assertThat(wordCount.wordCount(new String[] { "a", "b", "a", "c", "b" })).isEqualTo(ImmutableMap.of("b", 2, "c", 1, "a", 2));
		Assertions.assertThat(wordCount.wordCount(new String[] { "c", "b", "a" })).isEqualTo(ImmutableMap.of("b", 1, "c", 1, "a", 1));
		Assertions.assertThat(wordCount.wordCount(new String[] { "c", "c", "c", "c" })).isEqualTo(ImmutableMap.of("c", 4));
		Assertions.assertThat(wordCount.wordCount(new String[] {})).isEqualTo(ImmutableMap.of());
		Assertions.assertThat(wordCount.wordCount(new String[] { "this", "and", "this", "" })).isEqualTo(ImmutableMap.of("", 1, "this", 2, "and", 1));
		Assertions.assertThat(wordCount.wordCount(new String[] { "x", "y", "x", "Y", "X" })).isEqualTo(ImmutableMap.of("Y", 1, "X", 1, "y", 1, "x", 2));
		Assertions.assertThat(wordCount.wordCount(new String[] { "123", "0", "123", "1" })).isEqualTo(ImmutableMap.of("1", 1, "0", 1, "123", 2));
		Assertions.assertThat(wordCount.wordCount(new String[] { "d", "a", "e", "d", "a", "d", "b", "b", "z", "a", "a", "b", "z", "x", "b", "f", "x", "two", "b", "one", "two" }))
			.isEqualTo(MapBuilder.build("f", 1, "two", 2, "d", 3, "e", 1, "b", 5, "one", 1, "a", 4, "z", 2, "x", 2));
		Assertions.assertThat(wordCount.wordCount(new String[] { "apple", "banana", "apple", "apple", "tea", "coffee", "banana" }))
			.isEqualTo(ImmutableMap.of("banana", 2, "apple", 3, "coffee", 1, "tea", 1));
	}

}