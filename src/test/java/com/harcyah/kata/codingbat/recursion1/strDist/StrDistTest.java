package com.harcyah.kata.codingbat.recursion1.strDist;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class StrDistTest {

	@Test
	public void testStrDist() {
		StrDist strDist = new StrDist();
		Assertions.assertThat(strDist.strDist("catcowcat", "cat")).isEqualTo(9);
		Assertions.assertThat(strDist.strDist("catcowcat", "cow")).isEqualTo(3);
		Assertions.assertThat(strDist.strDist("cccatcowcatxx", "cat")).isEqualTo(9);
		Assertions.assertThat(strDist.strDist("abccatcowcatcatxyz", "cat")).isEqualTo(12);
		Assertions.assertThat(strDist.strDist("xyx", "x")).isEqualTo(3);
		Assertions.assertThat(strDist.strDist("xyx", "y")).isEqualTo(1);
		Assertions.assertThat(strDist.strDist("xyx", "z")).isEqualTo(0);
		Assertions.assertThat(strDist.strDist("z", "z")).isEqualTo(1);
		Assertions.assertThat(strDist.strDist("x", "z")).isEqualTo(0);
		Assertions.assertThat(strDist.strDist("", "z")).isEqualTo(0);
		Assertions.assertThat(strDist.strDist("hiHellohihihi", "hi")).isEqualTo(13);
		Assertions.assertThat(strDist.strDist("hiHellohihihi", "hih")).isEqualTo(5);
		Assertions.assertThat(strDist.strDist("hiHellohihihi", "o")).isEqualTo(1);
		Assertions.assertThat(strDist.strDist("hiHellohihihi", "ll")).isEqualTo(2);
	}

}
