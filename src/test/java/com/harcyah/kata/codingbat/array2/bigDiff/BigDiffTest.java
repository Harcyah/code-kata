package com.harcyah.kata.codingbat.array2.bigDiff;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BigDiffTest {

    @Test
    public void testBigDiff() {
        BigDiff bigDiff = new BigDiff();
        Assertions.assertThat(bigDiff.bigDiff(new int[]{10, 3, 5, 6})).isEqualTo(7);
        Assertions.assertThat(bigDiff.bigDiff(new int[]{7, 2, 10, 9})).isEqualTo(8);
        Assertions.assertThat(bigDiff.bigDiff(new int[]{2, 10, 7, 2})).isEqualTo(8);
        Assertions.assertThat(bigDiff.bigDiff(new int[]{2, 10})).isEqualTo(8);
        Assertions.assertThat(bigDiff.bigDiff(new int[]{10, 2})).isEqualTo(8);
        Assertions.assertThat(bigDiff.bigDiff(new int[]{10, 0})).isEqualTo(10);
        Assertions.assertThat(bigDiff.bigDiff(new int[]{2, 3})).isEqualTo(1);
        Assertions.assertThat(bigDiff.bigDiff(new int[]{2, 2})).isEqualTo(0);
        Assertions.assertThat(bigDiff.bigDiff(new int[]{2})).isEqualTo(0);
        Assertions.assertThat(bigDiff.bigDiff(new int[]{5, 1, 6, 1, 9, 9})).isEqualTo(8);
        Assertions.assertThat(bigDiff.bigDiff(new int[]{7, 6, 8, 5})).isEqualTo(3);
        Assertions.assertThat(bigDiff.bigDiff(new int[]{7, 7, 6, 8, 5, 5, 6})).isEqualTo(3);
    }

}


