package com.harcyah.kata.codingbat.string3.countTriple;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CountTripleTest {

	@Test
	public void testCountTriple() {
		CountTriple countTriple = new CountTriple();
		Assertions.assertThat(countTriple.countTriple("abcXXXabc")).isEqualTo(1);
		Assertions.assertThat(countTriple.countTriple("xxxabyyyycd")).isEqualTo(3);
		Assertions.assertThat(countTriple.countTriple("a")).isEqualTo(0);
		Assertions.assertThat(countTriple.countTriple("")).isEqualTo(0);
		Assertions.assertThat(countTriple.countTriple("XXXabc")).isEqualTo(1);
		Assertions.assertThat(countTriple.countTriple("XXXXabc")).isEqualTo(2);
		Assertions.assertThat(countTriple.countTriple("XXXXXabc")).isEqualTo(3);
		Assertions.assertThat(countTriple.countTriple("222abyyycdXXX")).isEqualTo(3);
		Assertions.assertThat(countTriple.countTriple("abYYYabXXXXXab")).isEqualTo(4);
		Assertions.assertThat(countTriple.countTriple("abYYXabXXYXXab")).isEqualTo(0);
		Assertions.assertThat(countTriple.countTriple("abYYXabXXYXXab")).isEqualTo(0);
		Assertions.assertThat(countTriple.countTriple("122abhhh2")).isEqualTo(1);
	}

}
