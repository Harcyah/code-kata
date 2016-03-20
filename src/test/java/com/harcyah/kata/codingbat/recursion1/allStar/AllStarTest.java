package com.harcyah.kata.codingbat.recursion1.allStar;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class AllStarTest {

	@Test
	public void testAllStar() {
		AllStar allStar = new AllStar();
		Assertions.assertThat(allStar.allStar("hello")).isEqualTo("h*e*l*l*o");
		Assertions.assertThat(allStar.allStar("abc")).isEqualTo("a*b*c");
		Assertions.assertThat(allStar.allStar("ab")).isEqualTo("a*b");
		Assertions.assertThat(allStar.allStar("a")).isEqualTo("a");
		Assertions.assertThat(allStar.allStar("")).isEqualTo("");
		Assertions.assertThat(allStar.allStar("3.14")).isEqualTo("3*.*1*4");
		Assertions.assertThat(allStar.allStar("Chocolate")).isEqualTo("C*h*o*c*o*l*a*t*e");
		Assertions.assertThat(allStar.allStar("1234")).isEqualTo("1*2*3*4");
	}

}
