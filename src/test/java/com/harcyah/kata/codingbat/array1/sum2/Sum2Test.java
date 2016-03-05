package com.harcyah.kata.codingbat.array1.sum2;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Sum2Test {

	@Test
	public void testSum2() {
		Sum2 sum2 = new Sum2();
		Assertions.assertThat(sum2.sum2(new int[] { 1, 2, 3 })).isEqualTo(3);
		Assertions.assertThat(sum2.sum2(new int[] { 1, 1 })).isEqualTo(2);
		Assertions.assertThat(sum2.sum2(new int[] { 1, 1, 1, 1 })).isEqualTo(2);
		Assertions.assertThat(sum2.sum2(new int[] { 1, 2 })).isEqualTo(3);
		Assertions.assertThat(sum2.sum2(new int[] { 1 })).isEqualTo(1);
		Assertions.assertThat(sum2.sum2(new int[] {})).isEqualTo(0);
		Assertions.assertThat(sum2.sum2(new int[] { 4, 5, 6 })).isEqualTo(9);
		Assertions.assertThat(sum2.sum2(new int[] { 4 })).isEqualTo(4);
	}

}
