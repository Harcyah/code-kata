package com.harcyah.kata.codingbat.map2.word0;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;

public class Word0Test {

	@Test
	public void testWord0() {
		Word0 word0 = new Word0();
		Assertions.assertThat(word0.word0(new String[] { "a", "b", "a", "b" })).isEqualTo(ImmutableMap.of("b", 0, "a", 0));
		Assertions.assertThat(word0.word0(new String[] { "a", "b", "a", "c", "b" })).isEqualTo(ImmutableMap.of("b", 0, "c", 0, "a", 0));
		Assertions.assertThat(word0.word0(new String[] { "c", "b", "a" })).isEqualTo(ImmutableMap.of("b", 0, "c", 0, "a", 0));
		Assertions.assertThat(word0.word0(new String[] { "c", "c", "c", "c" })).isEqualTo(ImmutableMap.of("c", 0));
		Assertions.assertThat(word0.word0(new String[] {})).isEqualTo(ImmutableMap.of());
	}

}