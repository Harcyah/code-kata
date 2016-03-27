package com.harcyah.kata.codingbat.array2.twoTwo;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TwoTwoTest {

	@Test
	public void testTwoTwo() {
		TwoTwo twoTwo = new TwoTwo();
		Assertions.assertThat(twoTwo.twoTwo(new int[] { 4, 2, 2, 3 })).isEqualTo(true);
		Assertions.assertThat(twoTwo.twoTwo(new int[] { 2, 2, 4 })).isEqualTo(true);
		Assertions.assertThat(twoTwo.twoTwo(new int[] { 2, 2, 4, 2 })).isEqualTo(false);
		Assertions.assertThat(twoTwo.twoTwo(new int[] { 1, 3, 4 })).isEqualTo(true);
		Assertions.assertThat(twoTwo.twoTwo(new int[] { 1, 2, 2, 3, 4 })).isEqualTo(true);
		Assertions.assertThat(twoTwo.twoTwo(new int[] { 1, 2, 3, 4 })).isEqualTo(false);
		Assertions.assertThat(twoTwo.twoTwo(new int[] { 2, 2 })).isEqualTo(true);
		Assertions.assertThat(twoTwo.twoTwo(new int[] { 2, 2, 7 })).isEqualTo(true);
		Assertions.assertThat(twoTwo.twoTwo(new int[] { 2, 2, 7, 2, 1 })).isEqualTo(false);
		Assertions.assertThat(twoTwo.twoTwo(new int[] { 4, 2, 2, 2 })).isEqualTo(true);
		Assertions.assertThat(twoTwo.twoTwo(new int[] { 2, 2, 2 })).isEqualTo(true);
		Assertions.assertThat(twoTwo.twoTwo(new int[] { 1, 2 })).isEqualTo(false);
		Assertions.assertThat(twoTwo.twoTwo(new int[] { 2 })).isEqualTo(false);
		Assertions.assertThat(twoTwo.twoTwo(new int[] { 1 })).isEqualTo(true);
		Assertions.assertThat(twoTwo.twoTwo(new int[] {})).isEqualTo(true);
		Assertions.assertThat(twoTwo.twoTwo(new int[] { 5, 2, 2, 3 })).isEqualTo(true);
		Assertions.assertThat(twoTwo.twoTwo(new int[] { 2, 2, 5, 2 })).isEqualTo(false);
	}

}
