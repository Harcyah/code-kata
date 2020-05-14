package com.harcyah.kata.codingbat.array2.sum13;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Sum13Test {

    @Test
    public void testSum13() {
        Sum13 sum13 = new Sum13();
        assertThat(sum13.sum13(new int[]{1, 2, 2, 1}))
            .isEqualTo(6);
        assertThat(sum13.sum13(new int[]{1, 1}))
            .isEqualTo(2);
        assertThat(sum13.sum13(new int[]{1, 2, 2, 1, 13}))
            .isEqualTo(6);
        assertThat(sum13.sum13(new int[]{1, 2, 13, 2, 1, 13}))
            .isEqualTo(4);
        assertThat(sum13.sum13(new int[]{13, 1, 2, 13, 2, 1, 13}))
            .isEqualTo(3);
        assertThat(sum13.sum13(new int[]{}))
            .isEqualTo(0);
        assertThat(sum13.sum13(new int[]{13}))
            .isEqualTo(0);
        assertThat(sum13.sum13(new int[]{13, 13}))
            .isEqualTo(0);
        assertThat(sum13.sum13(new int[]{13, 0, 13}))
            .isEqualTo(0);
        assertThat(sum13.sum13(new int[]{13, 1, 13}))
            .isEqualTo(0);
        assertThat(sum13.sum13(new int[]{5, 7, 2}))
            .isEqualTo(14);
        assertThat(sum13.sum13(new int[]{5, 13, 2}))
            .isEqualTo(5);
        assertThat(sum13.sum13(new int[]{0}))
            .isEqualTo(0);
        assertThat(sum13.sum13(new int[]{13, 0}))
            .isEqualTo(0);
    }

}

