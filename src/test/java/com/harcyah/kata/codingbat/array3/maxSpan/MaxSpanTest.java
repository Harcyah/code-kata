package com.harcyah.kata.codingbat.array3.maxSpan;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MaxSpanTest {

	@Test
	public void testMaxSpan() {
		MaxSpan maxSpan = new MaxSpan();
		Assertions.assertThat(maxSpan.maxSpan(new int[] { 1, 2, 1, 1, 3 })).isEqualTo(4);
		Assertions.assertThat(maxSpan.maxSpan(new int[] { 1, 4, 2, 1, 4, 1, 4 })).isEqualTo(6);
		Assertions.assertThat(maxSpan.maxSpan(new int[] { 1, 4, 2, 1, 4, 4, 4 })).isEqualTo(6);
		Assertions.assertThat(maxSpan.maxSpan(new int[] { 3, 3, 3 })).isEqualTo(3);
		Assertions.assertThat(maxSpan.maxSpan(new int[] { 3, 9, 3 })).isEqualTo(3);
		Assertions.assertThat(maxSpan.maxSpan(new int[] { 3, 9, 9 })).isEqualTo(2);
		Assertions.assertThat(maxSpan.maxSpan(new int[] { 3, 9 })).isEqualTo(1);
		Assertions.assertThat(maxSpan.maxSpan(new int[] { 3, 3 })).isEqualTo(2);
		Assertions.assertThat(maxSpan.maxSpan(new int[] {})).isEqualTo(0);
		Assertions.assertThat(maxSpan.maxSpan(new int[] { 1 })).isEqualTo(1);
	}

}
