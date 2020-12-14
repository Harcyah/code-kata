package com.harcyah.kata.codingbat.array2.only14;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Only14Test {

    @Test
    public void testOnly14() {
        Only14 only14 = new Only14();
        assertThat(only14.only14(new int[]{1, 4, 1, 4}))
            .isTrue();
        assertThat(only14.only14(new int[]{1, 4, 2, 4}))
            .isFalse();
        assertThat(only14.only14(new int[]{1, 1}))
            .isTrue();
        assertThat(only14.only14(new int[]{4, 1}))
            .isTrue();
        assertThat(only14.only14(new int[]{2}))
            .isFalse();
        assertThat(only14.only14(new int[]{}))
            .isTrue();
        assertThat(only14.only14(new int[]{1, 4, 1, 3}))
            .isFalse();
        assertThat(only14.only14(new int[]{3, 1, 3}))
            .isFalse();
        assertThat(only14.only14(new int[]{1}))
            .isTrue();
        assertThat(only14.only14(new int[]{4}))
            .isTrue();
        assertThat(only14.only14(new int[]{3, 4}))
            .isFalse();
        assertThat(only14.only14(new int[]{1, 3, 4}))
            .isFalse();
        assertThat(only14.only14(new int[]{1, 1, 1}))
            .isTrue();
        assertThat(only14.only14(new int[]{1, 1, 1, 5}))
            .isFalse();
        assertThat(only14.only14(new int[]{4, 1, 4, 1}))
            .isTrue();
    }

}

