package com.harcyah.kata.codingbat.logic1.sortaSum;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SortaSumTest {

	@Test
	public void testSortaSum() {
		SortaSum sortaSum = new SortaSum();
		Assertions.assertThat(sortaSum.sortaSum(3, 4)).isEqualTo(7);
		Assertions.assertThat(sortaSum.sortaSum(9, 4)).isEqualTo(20);
		Assertions.assertThat(sortaSum.sortaSum(10, 11)).isEqualTo(21);
		Assertions.assertThat(sortaSum.sortaSum(12, -3)).isEqualTo(9);
		Assertions.assertThat(sortaSum.sortaSum(-3, 12)).isEqualTo(9);
		Assertions.assertThat(sortaSum.sortaSum(4, 5)).isEqualTo(9);
		Assertions.assertThat(sortaSum.sortaSum(4, 6)).isEqualTo(20);
		Assertions.assertThat(sortaSum.sortaSum(14, 7)).isEqualTo(21);
		Assertions.assertThat(sortaSum.sortaSum(14, 6)).isEqualTo(20);
	}

}
