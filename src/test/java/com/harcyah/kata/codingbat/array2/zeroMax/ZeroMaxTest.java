package com.harcyah.kata.codingbat.array2.zeroMax;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ZeroMaxTest {

    @Test
    public void testZeroMax() {
        ZeroMax zeroMax = new ZeroMax();
        Assertions.assertThat(zeroMax.zeroMax(new int[]{0, 5, 0, 3})).isEqualTo(new int[]{5, 5, 3, 3});
        Assertions.assertThat(zeroMax.zeroMax(new int[]{0, 4, 0, 3})).isEqualTo(new int[]{3, 4, 3, 3});
        Assertions.assertThat(zeroMax.zeroMax(new int[]{0, 1, 0})).isEqualTo(new int[]{1, 1, 0});
        Assertions.assertThat(zeroMax.zeroMax(new int[]{0, 1, 5})).isEqualTo(new int[]{5, 1, 5});
        Assertions.assertThat(zeroMax.zeroMax(new int[]{0, 2, 0})).isEqualTo(new int[]{0, 2, 0});
        Assertions.assertThat(zeroMax.zeroMax(new int[]{1})).isEqualTo(new int[]{1});
        Assertions.assertThat(zeroMax.zeroMax(new int[]{0})).isEqualTo(new int[]{0});
        Assertions.assertThat(zeroMax.zeroMax(new int[]{})).isEqualTo(new int[]{});
        Assertions.assertThat(zeroMax.zeroMax(new int[]{7, 0, 4, 3, 0, 2})).isEqualTo(new int[]{7, 3, 4, 3, 0, 2});
        Assertions.assertThat(zeroMax.zeroMax(new int[]{7, 0, 4, 3, 0, 1})).isEqualTo(new int[]{7, 3, 4, 3, 1, 1});
        Assertions.assertThat(zeroMax.zeroMax(new int[]{7, 0, 4, 3, 0, 0})).isEqualTo(new int[]{7, 3, 4, 3, 0, 0});
        Assertions.assertThat(zeroMax.zeroMax(new int[]{7, 0, 1, 0, 0, 7})).isEqualTo(new int[]{7, 7, 1, 7, 7, 7});
    }

}
