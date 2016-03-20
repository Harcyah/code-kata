package com.harcyah.kata.codingbat.recursion1.endX;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class EndXTest {

	@Test
	public void testEndX() {
		EndX endX = new EndX();
		Assertions.assertThat(endX.endX("xxre")).isEqualTo("rexx");
		Assertions.assertThat(endX.endX("xxhixx")).isEqualTo("hixxxx");
		Assertions.assertThat(endX.endX("xhixhix")).isEqualTo("hihixxx");
		Assertions.assertThat(endX.endX("hiy")).isEqualTo("hiy");
		Assertions.assertThat(endX.endX("h")).isEqualTo("h");
		Assertions.assertThat(endX.endX("x")).isEqualTo("x");
		Assertions.assertThat(endX.endX("xx")).isEqualTo("xx");
		Assertions.assertThat(endX.endX("")).isEqualTo("");
		Assertions.assertThat(endX.endX("bxx")).isEqualTo("bxx");
		Assertions.assertThat(endX.endX("bxax")).isEqualTo("baxx");
		Assertions.assertThat(endX.endX("axaxax")).isEqualTo("aaaxxx");
		Assertions.assertThat(endX.endX("xxhxi")).isEqualTo("hixxx");
	}

}
