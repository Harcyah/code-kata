package com.harcyah.kata.codingbat.map2.pairs;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;

public class PairsTest {

	@Test
	public void testPairs() {
		Pairs pairs = new Pairs();
		Assertions.assertThat(pairs.pairs(new String[] { "code", "bug" })).isEqualTo(ImmutableMap.of("b", "g", "c", "e"));
		Assertions.assertThat(pairs.pairs(new String[] { "man", "moon", "main" })).isEqualTo(ImmutableMap.of("m", "n"));
		Assertions.assertThat(pairs.pairs(new String[] { "man", "moon", "good", "night" })).isEqualTo(ImmutableMap.of("g", "d", "n", "t", "m", "n"));
		Assertions.assertThat(pairs.pairs(new String[] {})).isEqualTo(ImmutableMap.of());
		Assertions.assertThat(pairs.pairs(new String[] { "a", "b" })).isEqualTo(ImmutableMap.of("b", "b", "a", "a"));
		Assertions.assertThat(pairs.pairs(new String[] { "are", "codes", "and", "cods" })).isEqualTo(ImmutableMap.of("c", "s", "a", "d"));
		Assertions.assertThat(pairs.pairs(new String[] { "apple", "banana", "tea", "coffee" })).isEqualTo(ImmutableMap.of("t", "a", "b", "a", "c", "e", "a", "e"));
	}

}