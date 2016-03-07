package com.harcyah.kata.codingbat.array2.only14;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Only14Test {

	@Test
	public void testOnly14() {
		Only14 only14 = new Only14();
		Assertions.assertThat(only14.only14(new int[] {1, 4, 1, 4})).isEqualTo(true);
		Assertions.assertThat(only14.only14(new int[] {1, 4, 2, 4})).isEqualTo(false);
		Assertions.assertThat(only14.only14(new int[] {1, 1})).isEqualTo(true);
		Assertions.assertThat(only14.only14(new int[] {4, 1})).isEqualTo(true);
		Assertions.assertThat(only14.only14(new int[] {2})).isEqualTo(false);
		Assertions.assertThat(only14.only14(new int[] {})).isEqualTo(true);
		Assertions.assertThat(only14.only14(new int[] {1, 4, 1, 3})).isEqualTo(false);
		Assertions.assertThat(only14.only14(new int[] {3, 1, 3})).isEqualTo(false);
		Assertions.assertThat(only14.only14(new int[] {1})).isEqualTo(true);
		Assertions.assertThat(only14.only14(new int[] {4})).isEqualTo(true);
		Assertions.assertThat(only14.only14(new int[] {3, 4})).isEqualTo(false);
		Assertions.assertThat(only14.only14(new int[] {1, 3, 4})).isEqualTo(false);
		Assertions.assertThat(only14.only14(new int[] {1, 1, 1})).isEqualTo(true);
		Assertions.assertThat(only14.only14(new int[] {1, 1, 1, 5})).isEqualTo(false);
		Assertions.assertThat(only14.only14(new int[] {4, 1, 4, 1})).isEqualTo(true);
	}

}


