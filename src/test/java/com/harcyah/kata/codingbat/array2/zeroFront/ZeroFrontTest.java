package com.harcyah.kata.codingbat.array2.zeroFront;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ZeroFrontTest {

    @Test
    public void testZeroFront() {
        ZeroFront zeroFront = new ZeroFront();
        assertThat(zeroFront.zeroFront(new int[]{1, 0, 0, 1}))
            .isEqualTo(new int[]{0, 0, 1, 1});
        assertThat(zeroFront.zeroFront(new int[]{0, 1, 1, 0, 1}))
            .isEqualTo(new int[]{0, 0, 1, 1, 1});
        assertThat(zeroFront.zeroFront(new int[]{1, 0}))
            .isEqualTo(new int[]{0, 1});
        assertThat(zeroFront.zeroFront(new int[]{0, 1}))
            .isEqualTo(new int[]{0, 1});
        assertThat(zeroFront.zeroFront(new int[]{1, 1, 1, 0}))
            .isEqualTo(new int[]{0, 1, 1, 1});
        assertThat(zeroFront.zeroFront(new int[]{2, 2, 2, 2}))
            .isEqualTo(new int[]{2, 2, 2, 2});
        assertThat(zeroFront.zeroFront(new int[]{0, 0, 1, 0}))
            .isEqualTo(new int[]{0, 0, 0, 1});
        assertThat(zeroFront.zeroFront(new int[]{-1, 0, 0, -1, 0}))
            .isEqualTo(new int[]{0, 0, 0, -1, -1});
        assertThat(zeroFront.zeroFront(new int[]{0, -3, 0, -3}))
            .isEqualTo(new int[]{0, 0, -3, -3});
        assertThat(zeroFront.zeroFront(new int[]{}))
            .isEqualTo(new int[]{});
        assertThat(zeroFront.zeroFront(new int[]{9, 9, 0, 9, 0, 9}))
            .isEqualTo(new int[]{0, 0, 9, 9, 9, 9});
    }

}
