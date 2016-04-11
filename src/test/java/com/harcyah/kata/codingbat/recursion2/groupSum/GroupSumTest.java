package com.harcyah.kata.codingbat.recursion2.groupSum;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class GroupSumTest {

	@Test
	public void testGroupSum() {
		GroupSum groupSum = new GroupSum();
		Assertions.assertThat(groupSum.groupSum(0, new int[] { 2, 4, 8 }, 10)).isEqualTo(true);
		Assertions.assertThat(groupSum.groupSum(0, new int[] { 2, 4, 8 }, 14)).isEqualTo(true);
		Assertions.assertThat(groupSum.groupSum(0, new int[] { 2, 4, 8 }, 9)).isEqualTo(false);
		Assertions.assertThat(groupSum.groupSum(0, new int[] { 2, 4, 8 }, 8)).isEqualTo(true);
		Assertions.assertThat(groupSum.groupSum(1, new int[] { 2, 4, 8 }, 8)).isEqualTo(true);
		Assertions.assertThat(groupSum.groupSum(1, new int[] { 2, 4, 8 }, 2)).isEqualTo(false);
		Assertions.assertThat(groupSum.groupSum(0, new int[] { 1 }, 1)).isEqualTo(true);
		Assertions.assertThat(groupSum.groupSum(0, new int[] { 9 }, 1)).isEqualTo(false);
		Assertions.assertThat(groupSum.groupSum(1, new int[] { 9 }, 0)).isEqualTo(true);
		Assertions.assertThat(groupSum.groupSum(0, new int[] {}, 0)).isEqualTo(true);
		Assertions.assertThat(groupSum.groupSum(0, new int[] { 10, 2, 2, 5 }, 17)).isEqualTo(true);
		Assertions.assertThat(groupSum.groupSum(0, new int[] { 10, 2, 2, 5 }, 15)).isEqualTo(true);
		Assertions.assertThat(groupSum.groupSum(0, new int[] { 10, 2, 2, 5 }, 9)).isEqualTo(true);
	}

}
