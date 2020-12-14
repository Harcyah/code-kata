package com.harcyah.kata.codingbat.array2.has22;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Has22Test {

    @Test
    public void testHas22() {
        Has22 has22 = new Has22();
        assertThat(has22.has22(new int[]{1, 2, 2}))
            .isTrue();
        assertThat(has22.has22(new int[]{1, 2, 1, 2}))
            .isFalse();
        assertThat(has22.has22(new int[]{2, 1, 2}))
            .isFalse();
        assertThat(has22.has22(new int[]{2, 2, 1, 2}))
            .isTrue();
        assertThat(has22.has22(new int[]{1, 3, 2}))
            .isFalse();
        assertThat(has22.has22(new int[]{1, 3, 2, 2}))
            .isTrue();
        assertThat(has22.has22(new int[]{2, 3, 2, 2}))
            .isTrue();
        assertThat(has22.has22(new int[]{4, 2, 4, 2, 2, 5}))
            .isTrue();
        assertThat(has22.has22(new int[]{1, 2}))
            .isFalse();
        assertThat(has22.has22(new int[]{2, 2}))
            .isTrue();
        assertThat(has22.has22(new int[]{2}))
            .isFalse();
        assertThat(has22.has22(new int[]{}))
            .isFalse();
        assertThat(has22.has22(new int[]{3, 3, 2, 2}))
            .isTrue();
        assertThat(has22.has22(new int[]{5, 2, 5, 2}))
            .isFalse();
    }

}

