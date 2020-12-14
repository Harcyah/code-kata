package com.harcyah.kata.codingbat.recursion2.groupSum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GroupSumTest {

    @Test
    public void testGroupSum() {
        GroupSum groupSum = new GroupSum();
        assertThat(groupSum.groupSum(0, new int[]{2, 4, 8}, 10))
            .isTrue();
        assertThat(groupSum.groupSum(0, new int[]{2, 4, 8}, 14))
            .isTrue();
        assertThat(groupSum.groupSum(0, new int[]{2, 4, 8}, 9))
            .isFalse();
        assertThat(groupSum.groupSum(0, new int[]{2, 4, 8}, 8))
            .isTrue();
        assertThat(groupSum.groupSum(1, new int[]{2, 4, 8}, 8))
            .isTrue();
        assertThat(groupSum.groupSum(1, new int[]{2, 4, 8}, 2))
            .isFalse();
        assertThat(groupSum.groupSum(0, new int[]{1}, 1))
            .isTrue();
        assertThat(groupSum.groupSum(0, new int[]{9}, 1))
            .isFalse();
        assertThat(groupSum.groupSum(1, new int[]{9}, 0))
            .isTrue();
        assertThat(groupSum.groupSum(0, new int[]{}, 0))
            .isTrue();
        assertThat(groupSum.groupSum(0, new int[]{10, 2, 2, 5}, 17))
            .isTrue();
        assertThat(groupSum.groupSum(0, new int[]{10, 2, 2, 5}, 15))
            .isTrue();
        assertThat(groupSum.groupSum(0, new int[]{10, 2, 2, 5}, 9))
            .isTrue();
    }

}
