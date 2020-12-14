package com.harcyah.kata.codingbat.recursion2.groupNoAdj;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GroupNoAdjTest {

    @Test
    public void testGroupNoAdj() {
        GroupNoAdj groupNoAdj = new GroupNoAdj();
        assertThat(groupNoAdj.groupNoAdj(0, new int[]{2, 5, 10, 4}, 12)).isTrue();
        assertThat(groupNoAdj.groupNoAdj(0, new int[]{2, 5, 10, 4}, 14)).isFalse();
        assertThat(groupNoAdj.groupNoAdj(0, new int[]{2, 5, 10, 4}, 7)).isFalse();
        assertThat(groupNoAdj.groupNoAdj(0, new int[]{2, 5, 10, 4, 2}, 7)).isTrue();
        assertThat(groupNoAdj.groupNoAdj(0, new int[]{2, 5, 10, 4}, 9)).isTrue();
        assertThat(groupNoAdj.groupNoAdj(0, new int[]{10, 2, 2, 3, 3}, 15)).isTrue();
        assertThat(groupNoAdj.groupNoAdj(0, new int[]{10, 2, 2, 3, 3}, 7)).isFalse();
        assertThat(groupNoAdj.groupNoAdj(0, new int[]{}, 0)).isTrue();
        assertThat(groupNoAdj.groupNoAdj(0, new int[]{1}, 1)).isTrue();
        assertThat(groupNoAdj.groupNoAdj(0, new int[]{9}, 1)).isFalse();
        assertThat(groupNoAdj.groupNoAdj(0, new int[]{9}, 0)).isTrue();
        assertThat(groupNoAdj.groupNoAdj(0, new int[]{5, 10, 4, 1}, 11)).isTrue();
    }

}
