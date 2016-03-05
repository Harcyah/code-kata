package com.harcyah.kata.codingbat.array1.plusTwo;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class PlusTwoTest {

	@Test
	public void testPlusTwo() {
		PlusTwo plusTwo = new PlusTwo();
		Assertions.assertThat(plusTwo.plusTwo(new int[] { 1, 2 }, new int[] { 3, 4 })).isEqualTo(new int[] { 1, 2, 3, 4 });
		Assertions.assertThat(plusTwo.plusTwo(new int[] { 4, 4 }, new int[] { 2, 2 })).isEqualTo(new int[] { 4, 4, 2, 2 });
		Assertions.assertThat(plusTwo.plusTwo(new int[] { 9, 2 }, new int[] { 3, 4 })).isEqualTo(new int[] { 9, 2, 3, 4 });
	}

}
