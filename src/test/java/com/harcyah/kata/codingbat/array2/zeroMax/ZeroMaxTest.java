package com.harcyah.kata.codingbat.array2.zeroMax;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ZeroMaxTest {

    @Test
    public void testZeroMax() {
        ZeroMax zeroMax = new ZeroMax();
        assertThat(zeroMax.zeroMax(new int[]{0, 5, 0, 3}))
            .isEqualTo(new int[]{5, 5, 3, 3});
        assertThat(zeroMax.zeroMax(new int[]{0, 4, 0, 3}))
            .isEqualTo(new int[]{3, 4, 3, 3});
        assertThat(zeroMax.zeroMax(new int[]{0, 1, 0}))
            .isEqualTo(new int[]{1, 1, 0});
        assertThat(zeroMax.zeroMax(new int[]{0, 1, 5}))
            .isEqualTo(new int[]{5, 1, 5});
        assertThat(zeroMax.zeroMax(new int[]{0, 2, 0}))
            .isEqualTo(new int[]{0, 2, 0});
        assertThat(zeroMax.zeroMax(new int[]{1}))
            .isEqualTo(new int[]{1});
        assertThat(zeroMax.zeroMax(new int[]{0}))
            .isEqualTo(new int[]{0});
        assertThat(zeroMax.zeroMax(new int[]{}))
            .isEqualTo(new int[]{});
        assertThat(zeroMax.zeroMax(new int[]{7, 0, 4, 3, 0, 2}))
            .isEqualTo(new int[]{7, 3, 4, 3, 0, 2});
        assertThat(zeroMax.zeroMax(new int[]{7, 0, 4, 3, 0, 1}))
            .isEqualTo(new int[]{7, 3, 4, 3, 1, 1});
        assertThat(zeroMax.zeroMax(new int[]{7, 0, 4, 3, 0, 0}))
            .isEqualTo(new int[]{7, 3, 4, 3, 0, 0});
        assertThat(zeroMax.zeroMax(new int[]{7, 0, 1, 0, 0, 7}))
            .isEqualTo(new int[]{7, 7, 1, 7, 7, 7});
    }

}
