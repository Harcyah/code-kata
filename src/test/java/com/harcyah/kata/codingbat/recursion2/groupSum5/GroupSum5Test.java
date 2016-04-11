package com.harcyah.kata.codingbat.recursion2.groupSum5;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class GroupSum5Test {

	@Test
	public void testGroupSum5() {
		GroupSum5 groupSum5 = new GroupSum5();
		Assertions.assertThat(groupSum5.groupSum5(0, new int[] { 2, 5, 10, 4 }, 19)).isEqualTo(true);
		Assertions.assertThat(groupSum5.groupSum5(0, new int[] { 2, 5, 10, 4 }, 17)).isEqualTo(true);
		Assertions.assertThat(groupSum5.groupSum5(0, new int[] { 2, 5, 10, 4 }, 12)).isEqualTo(false);
		Assertions.assertThat(groupSum5.groupSum5(0, new int[] { 2, 5, 4, 10 }, 12)).isEqualTo(false);
		Assertions.assertThat(groupSum5.groupSum5(0, new int[] { 3, 5, 1 }, 4)).isEqualTo(false);
		Assertions.assertThat(groupSum5.groupSum5(0, new int[] { 3, 5, 1 }, 5)).isEqualTo(true);
		Assertions.assertThat(groupSum5.groupSum5(0, new int[] { 1, 3, 5 }, 5)).isEqualTo(true);
		Assertions.assertThat(groupSum5.groupSum5(0, new int[] { 3, 5, 1 }, 9)).isEqualTo(false);
		Assertions.assertThat(groupSum5.groupSum5(0, new int[] { 2, 5, 10, 4 }, 7)).isEqualTo(false);
		Assertions.assertThat(groupSum5.groupSum5(0, new int[] { 2, 5, 10, 4 }, 15)).isEqualTo(true);
		Assertions.assertThat(groupSum5.groupSum5(0, new int[] { 2, 5, 10, 4 }, 11)).isEqualTo(false);
		Assertions.assertThat(groupSum5.groupSum5(0, new int[] { 1 }, 1)).isEqualTo(true);
		Assertions.assertThat(groupSum5.groupSum5(0, new int[] { 9 }, 1)).isEqualTo(false);
		Assertions.assertThat(groupSum5.groupSum5(0, new int[] { 9 }, 0)).isEqualTo(true);
		Assertions.assertThat(groupSum5.groupSum5(0, new int[] {}, 0)).isEqualTo(true);
	}

}
