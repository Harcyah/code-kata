package com.harcyah.kata.codingbat.recursion2.groupSum6;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GroupSum6Test {

    @Test
    public void testGroupSum6() {
        GroupSum6 groupSum6 = new GroupSum6();
        assertThat(groupSum6.groupSum6(0, new int[]{5, 6, 2}, 8)).isTrue();
        assertThat(groupSum6.groupSum6(0, new int[]{5, 6, 2}, 9)).isFalse();
        assertThat(groupSum6.groupSum6(0, new int[]{5, 6, 2}, 7)).isFalse();
        assertThat(groupSum6.groupSum6(0, new int[]{1}, 1)).isTrue();
        assertThat(groupSum6.groupSum6(0, new int[]{9}, 1)).isFalse();
        assertThat(groupSum6.groupSum6(0, new int[]{}, 0)).isTrue();
        assertThat(groupSum6.groupSum6(0, new int[]{3, 2, 4, 6}, 8)).isTrue();
        assertThat(groupSum6.groupSum6(0, new int[]{6, 2, 4, 3}, 8)).isTrue();
        assertThat(groupSum6.groupSum6(0, new int[]{5, 2, 4, 6}, 9)).isFalse();
        assertThat(groupSum6.groupSum6(0, new int[]{6, 2, 4, 5}, 9)).isFalse();
        assertThat(groupSum6.groupSum6(0, new int[]{3, 2, 4, 6}, 3)).isFalse();
        assertThat(groupSum6.groupSum6(0, new int[]{1, 6, 2, 6, 4}, 12)).isTrue();
        assertThat(groupSum6.groupSum6(0, new int[]{1, 6, 2, 6, 4}, 13)).isTrue();
        assertThat(groupSum6.groupSum6(0, new int[]{1, 6, 2, 6, 4}, 4)).isFalse();
        assertThat(groupSum6.groupSum6(0, new int[]{1, 6, 2, 6, 4}, 9)).isFalse();
        assertThat(groupSum6.groupSum6(0, new int[]{1, 6, 2, 6, 5}, 14)).isTrue();
        assertThat(groupSum6.groupSum6(0, new int[]{1, 6, 2, 6, 5}, 15)).isTrue();
        assertThat(groupSum6.groupSum6(0, new int[]{1, 6, 2, 6, 5}, 16)).isFalse();
    }

}
