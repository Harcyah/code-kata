package com.harcyah.kata.codingbat.array2.fizzArray;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FizzArrayTest {

	@Test
	public void testFizzArray() {
		FizzArray fizzArray = new FizzArray();
		Assertions.assertThat(fizzArray.fizzArray(4)).isEqualTo(new int[] {0, 1, 2, 3});
		Assertions.assertThat(fizzArray.fizzArray(1)).isEqualTo(new int[] {0});
		Assertions.assertThat(fizzArray.fizzArray(10)).isEqualTo(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
		Assertions.assertThat(fizzArray.fizzArray(0)).isEqualTo(new int[] {});
		Assertions.assertThat(fizzArray.fizzArray(2)).isEqualTo(new int[] {0, 1});
		Assertions.assertThat(fizzArray.fizzArray(7)).isEqualTo(new int[] {0, 1, 2, 3, 4, 5, 6});
	}

}


