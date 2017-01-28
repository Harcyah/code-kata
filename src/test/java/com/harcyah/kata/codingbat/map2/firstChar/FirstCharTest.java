package com.harcyah.kata.codingbat.map2.firstChar;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;

public class FirstCharTest {

	@Test
	public void testFirstChar() {
		FirstChar firstChar = new FirstChar();
		Assertions.assertThat(firstChar.firstChar(new String[] { "salt", "tea", "soda", "toast" })).isEqualTo(ImmutableMap.of("t", "teatoast", "s", "saltsoda"));
		Assertions.assertThat(firstChar.firstChar(new String[] { "aa", "bb", "cc", "aAA", "cCC", "d" }))
			.isEqualTo(ImmutableMap.of("d", "d", "b", "bb", "c", "cccCC", "a", "aaaAA"));
		Assertions.assertThat(firstChar.firstChar(new String[] {})).isEqualTo(ImmutableMap.of());
		Assertions.assertThat(firstChar.firstChar(new String[] { "apple", "bells", "salt", "aardvark", "bells", "sun", "zen", "bells" }))
			.isEqualTo(ImmutableMap.of("s", "saltsun", "b", "bellsbellsbells", "a", "appleaardvark", "z", "zen"));
	}

}
