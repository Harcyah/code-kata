package com.harcyah.kata.codingbat.recursion1.array6;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Array6Test {

	@Test
	public void testArray6() {
		Array6 array6 = new Array6();
		Assertions.assertThat(array6.array6(new int[] { 1, 6, 4 }, 0)).isEqualTo(true);
		Assertions.assertThat(array6.array6(new int[] { 1, 4 }, 0)).isEqualTo(false);
		Assertions.assertThat(array6.array6(new int[] { 6 }, 0)).isEqualTo(true);
		Assertions.assertThat(array6.array6(new int[] {}, 0)).isEqualTo(false);
		Assertions.assertThat(array6.array6(new int[] { 6, 2, 2 }, 0)).isEqualTo(true);
		Assertions.assertThat(array6.array6(new int[] { 2, 5 }, 0)).isEqualTo(false);
		Assertions.assertThat(array6.array6(new int[] { 1, 9, 4, 6, 6 }, 0)).isEqualTo(true);
		Assertions.assertThat(array6.array6(new int[] { 2, 5, 6 }, 0)).isEqualTo(true);
	}

}
