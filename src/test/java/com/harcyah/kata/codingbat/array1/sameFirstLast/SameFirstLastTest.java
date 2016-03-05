package com.harcyah.kata.codingbat.array1.sameFirstLast;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SameFirstLastTest {

	@Test
	public void testSameFirstLast() {
		SameFirstLast sameFirstLast = new SameFirstLast();
		Assertions.assertThat(sameFirstLast.sameFirstLast(new int[] { 1, 2, 3 })).isEqualTo(false);
		Assertions.assertThat(sameFirstLast.sameFirstLast(new int[] { 1, 2, 3, 1 })).isEqualTo(true);
		Assertions.assertThat(sameFirstLast.sameFirstLast(new int[] { 1, 2, 1 })).isEqualTo(true);
		Assertions.assertThat(sameFirstLast.sameFirstLast(new int[] { 7 })).isEqualTo(true);
		Assertions.assertThat(sameFirstLast.sameFirstLast(new int[] {})).isEqualTo(false);
		Assertions.assertThat(sameFirstLast.sameFirstLast(new int[] { 1, 2, 3, 4, 5, 1 })).isEqualTo(true);
		Assertions.assertThat(sameFirstLast.sameFirstLast(new int[] { 1, 2, 3, 4, 5, 13 })).isEqualTo(false);
		Assertions.assertThat(sameFirstLast.sameFirstLast(new int[] { 13, 2, 3, 4, 5, 13 })).isEqualTo(true);
		Assertions.assertThat(sameFirstLast.sameFirstLast(new int[] { 7, 7 })).isEqualTo(true);
	}

}
