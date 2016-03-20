package com.harcyah.kata.codingbat.recursion1.pairStar;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class PairStarTest {

	@Test
	public void testPairStar() {
		PairStar pairStar = new PairStar();
		Assertions.assertThat(pairStar.pairStar("hello")).isEqualTo("hel*lo");
		Assertions.assertThat(pairStar.pairStar("xxyy")).isEqualTo("x*xy*y");
		Assertions.assertThat(pairStar.pairStar("aaaa")).isEqualTo("a*a*a*a");
		Assertions.assertThat(pairStar.pairStar("aaab")).isEqualTo("a*a*ab");
		Assertions.assertThat(pairStar.pairStar("aa")).isEqualTo("a*a");
		Assertions.assertThat(pairStar.pairStar("a")).isEqualTo("a");
		Assertions.assertThat(pairStar.pairStar("")).isEqualTo("");
		Assertions.assertThat(pairStar.pairStar("noadjacent")).isEqualTo("noadjacent");
		Assertions.assertThat(pairStar.pairStar("abba")).isEqualTo("ab*ba");
		Assertions.assertThat(pairStar.pairStar("abbba")).isEqualTo("ab*b*ba");
	}

}
