package com.harcyah.kata.codingbat.recursion2.groupSumClump;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class GroupSumClumpTest {

	@Test
	public void testGroupSumClump() {
		GroupSumClump groupSumClump = new GroupSumClump();
		Assertions.assertThat(groupSumClump.groupSumClump(0, new int[] { 2, 4, 8 }, 10)).isEqualTo(true);
		Assertions.assertThat(groupSumClump.groupSumClump(0, new int[] { 1, 2, 4, 8, 1 }, 14)).isEqualTo(true);
		Assertions.assertThat(groupSumClump.groupSumClump(0, new int[] { 2, 4, 4, 8 }, 14)).isEqualTo(false);
		Assertions.assertThat(groupSumClump.groupSumClump(0, new int[] { 8, 2, 2, 1 }, 9)).isEqualTo(true);
		Assertions.assertThat(groupSumClump.groupSumClump(0, new int[] { 8, 2, 2, 1 }, 11)).isEqualTo(false);
		Assertions.assertThat(groupSumClump.groupSumClump(0, new int[] { 1 }, 1)).isEqualTo(true);
		Assertions.assertThat(groupSumClump.groupSumClump(0, new int[] { 9 }, 1)).isEqualTo(false);
	}

}
