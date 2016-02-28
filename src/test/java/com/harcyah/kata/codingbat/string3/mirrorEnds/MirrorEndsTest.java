package com.harcyah.kata.codingbat.string3.mirrorEnds;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MirrorEndsTest {

	@Test
	public void testMirrorEnds() {
		MirrorEnds mirrorEnds = new MirrorEnds();
		Assertions.assertThat(mirrorEnds.mirrorEnds("abXYZba")).isEqualTo("ab");
		Assertions.assertThat(mirrorEnds.mirrorEnds("abca")).isEqualTo("a");
		Assertions.assertThat(mirrorEnds.mirrorEnds("aba")).isEqualTo("aba");
		Assertions.assertThat(mirrorEnds.mirrorEnds("abab")).isEqualTo("");
		Assertions.assertThat(mirrorEnds.mirrorEnds("xxx")).isEqualTo("xxx");
		Assertions.assertThat(mirrorEnds.mirrorEnds("xxYxx")).isEqualTo("xxYxx");
		Assertions.assertThat(mirrorEnds.mirrorEnds("Hi and iH")).isEqualTo("Hi ");
		Assertions.assertThat(mirrorEnds.mirrorEnds("x")).isEqualTo("x");
		Assertions.assertThat(mirrorEnds.mirrorEnds("")).isEqualTo("");
		Assertions.assertThat(mirrorEnds.mirrorEnds("123and then 321")).isEqualTo("123");
		Assertions.assertThat(mirrorEnds.mirrorEnds("band andab")).isEqualTo("ba");
	}

}
