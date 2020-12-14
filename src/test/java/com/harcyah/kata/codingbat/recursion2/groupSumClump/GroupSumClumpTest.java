package com.harcyah.kata.codingbat.recursion2.groupSumClump;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GroupSumClumpTest {

    @Test
    public void testGroupSumClump() {
        GroupSumClump groupSumClump = new GroupSumClump();
        assertThat(groupSumClump.groupSumClump(0, new int[]{2, 4, 8}, 10)).isTrue();
        assertThat(groupSumClump.groupSumClump(0, new int[]{1, 2, 4, 8, 1}, 14)).isTrue();
        assertThat(groupSumClump.groupSumClump(0, new int[]{2, 4, 4, 8}, 14)).isFalse();
        assertThat(groupSumClump.groupSumClump(0, new int[]{8, 2, 2, 1}, 9)).isTrue();
        assertThat(groupSumClump.groupSumClump(0, new int[]{8, 2, 2, 1}, 11)).isFalse();
        assertThat(groupSumClump.groupSumClump(0, new int[]{1}, 1)).isTrue();
        assertThat(groupSumClump.groupSumClump(0, new int[]{9}, 1)).isFalse();
    }

}
