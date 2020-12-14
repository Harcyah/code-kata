package com.harcyah.kata.codingbat.array2.either24;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Either24Test {

    @Test
    public void testEither24() {
        Either24 either24 = new Either24();
        assertThat(either24.either24(new int[]{1, 2, 2}))
            .isTrue();
        assertThat(either24.either24(new int[]{4, 4, 1}))
            .isTrue();
        assertThat(either24.either24(new int[]{4, 4, 1, 2, 2}))
            .isFalse();
        assertThat(either24.either24(new int[]{1, 2, 3, 4}))
            .isFalse();
        assertThat(either24.either24(new int[]{3, 5, 9}))
            .isFalse();
        assertThat(either24.either24(new int[]{1, 2, 3, 4, 4}))
            .isTrue();
        assertThat(either24.either24(new int[]{2, 2, 3, 4}))
            .isTrue();
        assertThat(either24.either24(new int[]{1, 2, 3, 2, 2, 4}))
            .isTrue();
        assertThat(either24.either24(new int[]{1, 2, 3, 2, 2, 4, 4}))
            .isFalse();
        assertThat(either24.either24(new int[]{1, 2}))
            .isFalse();
        assertThat(either24.either24(new int[]{2, 2}))
            .isTrue();
        assertThat(either24.either24(new int[]{4, 4}))
            .isTrue();
        assertThat(either24.either24(new int[]{2}))
            .isFalse();
        assertThat(either24.either24(new int[]{}))
            .isFalse();
    }

}

