package com.harcyah.kata.codingbat.recursion1.array6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Array6Test {

    @Test
    public void testArray6() {
        Array6 array6 = new Array6();
        assertThat(array6.array6(new int[]{1, 6, 4}, 0)).isTrue();
        assertThat(array6.array6(new int[]{1, 4}, 0)).isFalse();
        assertThat(array6.array6(new int[]{6}, 0)).isTrue();
        assertThat(array6.array6(new int[]{}, 0)).isFalse();
        assertThat(array6.array6(new int[]{6, 2, 2}, 0)).isTrue();
        assertThat(array6.array6(new int[]{2, 5}, 0)).isFalse();
        assertThat(array6.array6(new int[]{1, 9, 4, 6, 6}, 0)).isTrue();
        assertThat(array6.array6(new int[]{2, 5, 6}, 0)).isTrue();
    }

}
