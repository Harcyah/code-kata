package com.harcyah.kata.codingbat.array2.either24;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Either24Test {

	@Test
	public void testEither24() {
		Either24 either24 = new Either24();
		Assertions.assertThat(either24.either24(new int[] {1, 2, 2})).isEqualTo(true);
		Assertions.assertThat(either24.either24(new int[] {4, 4, 1})).isEqualTo(true);
		Assertions.assertThat(either24.either24(new int[] {4, 4, 1, 2, 2})).isEqualTo(false);
		Assertions.assertThat(either24.either24(new int[] {1, 2, 3, 4})).isEqualTo(false);
		Assertions.assertThat(either24.either24(new int[] {3, 5, 9})).isEqualTo(false);
		Assertions.assertThat(either24.either24(new int[] {1, 2, 3, 4, 4})).isEqualTo(true);
		Assertions.assertThat(either24.either24(new int[] {2, 2, 3, 4})).isEqualTo(true);
		Assertions.assertThat(either24.either24(new int[] {1, 2, 3, 2, 2, 4})).isEqualTo(true);
		Assertions.assertThat(either24.either24(new int[] {1, 2, 3, 2, 2, 4, 4})).isEqualTo(false);
		Assertions.assertThat(either24.either24(new int[] {1, 2})).isEqualTo(false);
		Assertions.assertThat(either24.either24(new int[] {2, 2})).isEqualTo(true);
		Assertions.assertThat(either24.either24(new int[] {4, 4})).isEqualTo(true);
		Assertions.assertThat(either24.either24(new int[] {2})).isEqualTo(false);
		Assertions.assertThat(either24.either24(new int[] {})).isEqualTo(false);	}

}


