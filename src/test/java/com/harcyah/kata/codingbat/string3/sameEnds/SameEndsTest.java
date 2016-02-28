package com.harcyah.kata.codingbat.string3.sameEnds;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SameEndsTest {

	@Test
	public void testSameEnds() {
		SameEnds sameEnds = new SameEnds();
		Assertions.assertThat(sameEnds.sameEnds("abXYab")).isEqualTo("ab");
		Assertions.assertThat(sameEnds.sameEnds("xx")).isEqualTo("x");
		Assertions.assertThat(sameEnds.sameEnds("xxx")).isEqualTo("x");
		Assertions.assertThat(sameEnds.sameEnds("xxxx")).isEqualTo("xx");
		Assertions.assertThat(sameEnds.sameEnds("javaXYZjava")).isEqualTo("java");
		Assertions.assertThat(sameEnds.sameEnds("javajava")).isEqualTo("java");
		Assertions.assertThat(sameEnds.sameEnds("xavaXYZjava")).isEqualTo("");
		Assertions.assertThat(sameEnds.sameEnds("Hello! and Hello!")).isEqualTo("Hello!");
		Assertions.assertThat(sameEnds.sameEnds("x")).isEqualTo("");
		Assertions.assertThat(sameEnds.sameEnds("")).isEqualTo("");
		Assertions.assertThat(sameEnds.sameEnds("abcb")).isEqualTo("");
		Assertions.assertThat(sameEnds.sameEnds("mymmy")).isEqualTo("my");
	}

}
