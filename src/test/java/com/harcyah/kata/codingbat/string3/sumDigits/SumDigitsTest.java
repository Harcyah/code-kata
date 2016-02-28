package com.harcyah.kata.codingbat.string3.sumDigits;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SumDigitsTest {

	@Test
	public void testSumDigits() {
		SumDigits sumDigits = new SumDigits();
		Assertions.assertThat(sumDigits.sumDigits("aa1bc2d3")).isEqualTo(6);
		Assertions.assertThat(sumDigits.sumDigits("aa11b33")).isEqualTo(8);
		Assertions.assertThat(sumDigits.sumDigits("Chocolate")).isEqualTo(0);
		Assertions.assertThat(sumDigits.sumDigits("5hoco1a1e")).isEqualTo(7);
		Assertions.assertThat(sumDigits.sumDigits("123abc123")).isEqualTo(12);
		Assertions.assertThat(sumDigits.sumDigits("")).isEqualTo(0);
		Assertions.assertThat(sumDigits.sumDigits("Hello")).isEqualTo(0);
		Assertions.assertThat(sumDigits.sumDigits("X1z9b2")).isEqualTo(12);
		Assertions.assertThat(sumDigits.sumDigits("5432a")).isEqualTo(14);
	}

}
