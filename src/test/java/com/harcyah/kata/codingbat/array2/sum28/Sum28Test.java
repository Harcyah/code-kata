package com.harcyah.kata.codingbat.array2.sum28;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Sum28Test {

    @Test
    public void testSum28() {
        Sum28 sum28 = new Sum28();
        assertThat(sum28.sum28(new int[]{2, 3, 2, 2, 4, 2}))
            .isTrue();
        assertThat(sum28.sum28(new int[]{2, 3, 2, 2, 4, 2, 2}))
            .isFalse();
        assertThat(sum28.sum28(new int[]{1, 2, 3, 4}))
            .isFalse();
        assertThat(sum28.sum28(new int[]{2, 2, 2, 2}))
            .isTrue();
        assertThat(sum28.sum28(new int[]{1, 2, 2, 2, 2, 4}))
            .isTrue();
        assertThat(sum28.sum28(new int[]{}))
            .isFalse();
        assertThat(sum28.sum28(new int[]{2}))
            .isFalse();
        assertThat(sum28.sum28(new int[]{8}))
            .isFalse();
        assertThat(sum28.sum28(new int[]{2, 2, 2}))
            .isFalse();
        assertThat(sum28.sum28(new int[]{2, 2, 2, 2, 2}))
            .isFalse();
        assertThat(sum28.sum28(new int[]{1, 2, 2, 1, 2, 2}))
            .isTrue();
        assertThat(sum28.sum28(new int[]{5, 2, 2, 2, 4, 2}))
            .isTrue();
    }

}

