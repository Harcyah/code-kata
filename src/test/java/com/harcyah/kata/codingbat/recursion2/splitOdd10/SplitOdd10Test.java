package com.harcyah.kata.codingbat.recursion2.splitOdd10;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SplitOdd10Test {

    @Test
    public void testSplitOdd10() {
        SplitOdd10 splitOdd10 = new SplitOdd10();
        Assertions.assertThat(splitOdd10.splitOdd10(new int[]{5, 5, 5})).isEqualTo(true);
        Assertions.assertThat(splitOdd10.splitOdd10(new int[]{5, 5, 6})).isEqualTo(false);
        Assertions.assertThat(splitOdd10.splitOdd10(new int[]{5, 5, 6, 1})).isEqualTo(true);
        Assertions.assertThat(splitOdd10.splitOdd10(new int[]{6, 5, 5, 1})).isEqualTo(true);
        Assertions.assertThat(splitOdd10.splitOdd10(new int[]{6, 5, 5, 1, 10})).isEqualTo(true);
        Assertions.assertThat(splitOdd10.splitOdd10(new int[]{6, 5, 5, 5, 1})).isEqualTo(false);
        Assertions.assertThat(splitOdd10.splitOdd10(new int[]{1})).isEqualTo(true);
        Assertions.assertThat(splitOdd10.splitOdd10(new int[]{})).isEqualTo(false);
        Assertions.assertThat(splitOdd10.splitOdd10(new int[]{10, 7, 5, 5})).isEqualTo(true);
        Assertions.assertThat(splitOdd10.splitOdd10(new int[]{10, 0, 5, 5})).isEqualTo(false);
        Assertions.assertThat(splitOdd10.splitOdd10(new int[]{10, 7, 5, 5, 2})).isEqualTo(true);
        Assertions.assertThat(splitOdd10.splitOdd10(new int[]{10, 7, 5, 5, 1})).isEqualTo(false);
    }

}
