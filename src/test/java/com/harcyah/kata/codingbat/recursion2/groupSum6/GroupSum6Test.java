package com.harcyah.kata.codingbat.recursion2.groupSum6;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class GroupSum6Test {

	@Test
	public void testGroupSum6() {
		GroupSum6 groupSum6 = new GroupSum6();
		Assertions.assertThat(groupSum6.groupSum6(0, new int[] { 5, 6, 2 }, 8)).isEqualTo(true);
		Assertions.assertThat(groupSum6.groupSum6(0, new int[] { 5, 6, 2 }, 9)).isEqualTo(false);
		Assertions.assertThat(groupSum6.groupSum6(0, new int[] { 5, 6, 2 }, 7)).isEqualTo(false);
		Assertions.assertThat(groupSum6.groupSum6(0, new int[] { 1 }, 1)).isEqualTo(true);
		Assertions.assertThat(groupSum6.groupSum6(0, new int[] { 9 }, 1)).isEqualTo(false);
		Assertions.assertThat(groupSum6.groupSum6(0, new int[] {}, 0)).isEqualTo(true);
		Assertions.assertThat(groupSum6.groupSum6(0, new int[] { 3, 2, 4, 6 }, 8)).isEqualTo(true);
		Assertions.assertThat(groupSum6.groupSum6(0, new int[] { 6, 2, 4, 3 }, 8)).isEqualTo(true);
		Assertions.assertThat(groupSum6.groupSum6(0, new int[] { 5, 2, 4, 6 }, 9)).isEqualTo(false);
		Assertions.assertThat(groupSum6.groupSum6(0, new int[] { 6, 2, 4, 5 }, 9)).isEqualTo(false);
		Assertions.assertThat(groupSum6.groupSum6(0, new int[] { 3, 2, 4, 6 }, 3)).isEqualTo(false);
		Assertions.assertThat(groupSum6.groupSum6(0, new int[] { 1, 6, 2, 6, 4 }, 12)).isEqualTo(true);
		Assertions.assertThat(groupSum6.groupSum6(0, new int[] { 1, 6, 2, 6, 4 }, 13)).isEqualTo(true);
		Assertions.assertThat(groupSum6.groupSum6(0, new int[] { 1, 6, 2, 6, 4 }, 4)).isEqualTo(false);
		Assertions.assertThat(groupSum6.groupSum6(0, new int[] { 1, 6, 2, 6, 4 }, 9)).isEqualTo(false);
		Assertions.assertThat(groupSum6.groupSum6(0, new int[] { 1, 6, 2, 6, 5 }, 14)).isEqualTo(true);
		Assertions.assertThat(groupSum6.groupSum6(0, new int[] { 1, 6, 2, 6, 5 }, 15)).isEqualTo(true);
		Assertions.assertThat(groupSum6.groupSum6(0, new int[] { 1, 6, 2, 6, 5 }, 16)).isEqualTo(false);
	}

}
