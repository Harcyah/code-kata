package com.harcyah.kata.codingbat.array1.biggerTwo;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BiggerTwoTest {

	@Test
	public void testBiggerTwo() {
		BiggerTwo biggerTwo = new BiggerTwo();
		Assertions.assertThat(biggerTwo.biggerTwo(new int[] { 1, 2 }, new int[] { 3, 4 })).isEqualTo(new int[] { 3, 4 });
		Assertions.assertThat(biggerTwo.biggerTwo(new int[] { 3, 4 }, new int[] { 1, 2 })).isEqualTo(new int[] { 3, 4 });
		Assertions.assertThat(biggerTwo.biggerTwo(new int[] { 1, 1 }, new int[] { 1, 2 })).isEqualTo(new int[] { 1, 2 });
		Assertions.assertThat(biggerTwo.biggerTwo(new int[] { 2, 1 }, new int[] { 1, 1 })).isEqualTo(new int[] { 2, 1 });
		Assertions.assertThat(biggerTwo.biggerTwo(new int[] { 2, 2 }, new int[] { 1, 3 })).isEqualTo(new int[] { 2, 2 });
		Assertions.assertThat(biggerTwo.biggerTwo(new int[] { 1, 3 }, new int[] { 2, 2 })).isEqualTo(new int[] { 1, 3 });
		Assertions.assertThat(biggerTwo.biggerTwo(new int[] { 6, 7 }, new int[] { 3, 1 })).isEqualTo(new int[] { 6, 7 });
	}

}
