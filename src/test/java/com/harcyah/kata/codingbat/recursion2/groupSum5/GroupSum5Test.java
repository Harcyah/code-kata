package com.harcyah.kata.codingbat.recursion2.groupSum5;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GroupSum5Test {

    @Test
    public void testGroupSum5() {
        GroupSum5 groupSum5 = new GroupSum5();
        assertThat(groupSum5.groupSum5(0, new int[]{2, 5, 10, 4}, 19)).isTrue();
        assertThat(groupSum5.groupSum5(0, new int[]{2, 5, 10, 4}, 17)).isTrue();
        assertThat(groupSum5.groupSum5(0, new int[]{2, 5, 10, 4}, 12)).isFalse();
        assertThat(groupSum5.groupSum5(0, new int[]{2, 5, 4, 10}, 12)).isFalse();
        assertThat(groupSum5.groupSum5(0, new int[]{3, 5, 1}, 4)).isFalse();
        assertThat(groupSum5.groupSum5(0, new int[]{3, 5, 1}, 5)).isTrue();
        assertThat(groupSum5.groupSum5(0, new int[]{1, 3, 5}, 5)).isTrue();
        assertThat(groupSum5.groupSum5(0, new int[]{3, 5, 1}, 9)).isFalse();
        assertThat(groupSum5.groupSum5(0, new int[]{2, 5, 10, 4}, 7)).isFalse();
        assertThat(groupSum5.groupSum5(0, new int[]{2, 5, 10, 4}, 15)).isTrue();
        assertThat(groupSum5.groupSum5(0, new int[]{2, 5, 10, 4}, 11)).isFalse();
        assertThat(groupSum5.groupSum5(0, new int[]{1}, 1)).isTrue();
        assertThat(groupSum5.groupSum5(0, new int[]{9}, 1)).isFalse();
        assertThat(groupSum5.groupSum5(0, new int[]{9}, 0)).isTrue();
        assertThat(groupSum5.groupSum5(0, new int[]{}, 0)).isTrue();
    }

}
