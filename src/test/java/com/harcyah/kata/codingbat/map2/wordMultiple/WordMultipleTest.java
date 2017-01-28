package com.harcyah.kata.codingbat.map2.wordMultiple;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;
import com.harcyah.kata.codingbat.MapBuilder;

public class WordMultipleTest {

	@Test
	public void testWordMultiple() {
		WordMultiple wordMultiple = new WordMultiple();
		Assertions.assertThat(wordMultiple.wordMultiple(new String[] { "a", "b", "a", "c", "b" })).isEqualTo(ImmutableMap.of("b", true, "c", false, "a", true));
		Assertions.assertThat(wordMultiple.wordMultiple(new String[] { "c", "b", "a" })).isEqualTo(ImmutableMap.of("b", false, "c", false, "a", false));
		Assertions.assertThat(wordMultiple.wordMultiple(new String[] { "c", "c", "c", "c" })).isEqualTo(ImmutableMap.of("c", true));
		Assertions.assertThat(wordMultiple.wordMultiple(new String[] {})).isEqualTo(ImmutableMap.of());
		Assertions.assertThat(wordMultiple.wordMultiple(new String[] { "this", "and", "this" })).isEqualTo(ImmutableMap.of("this", true, "and", false));
		Assertions.assertThat(wordMultiple.wordMultiple(new String[] { "d", "a", "e", "d", "a", "d", "b", "b", "z", "a", "a", "b", "z", "x" }))
			.isEqualTo(MapBuilder.build("d", true, "e", false, "b", true, "a", true, "z", true, "x", false));
	}

}