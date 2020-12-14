package com.harcyah.kata.codingbat.recursion2.splitOdd10;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SplitOdd10Test {

    @Test
    public void testSplitOdd10() {
        SplitOdd10 splitOdd10 = new SplitOdd10();
        assertThat(splitOdd10.splitOdd10(new int[]{5, 5, 5})).isTrue();
        assertThat(splitOdd10.splitOdd10(new int[]{5, 5, 6})).isFalse();
        assertThat(splitOdd10.splitOdd10(new int[]{5, 5, 6, 1})).isTrue();
        assertThat(splitOdd10.splitOdd10(new int[]{6, 5, 5, 1})).isTrue();
        assertThat(splitOdd10.splitOdd10(new int[]{6, 5, 5, 1, 10})).isTrue();
        assertThat(splitOdd10.splitOdd10(new int[]{6, 5, 5, 5, 1})).isFalse();
        assertThat(splitOdd10.splitOdd10(new int[]{1})).isTrue();
        assertThat(splitOdd10.splitOdd10(new int[]{})).isFalse();
        assertThat(splitOdd10.splitOdd10(new int[]{10, 7, 5, 5})).isTrue();
        assertThat(splitOdd10.splitOdd10(new int[]{10, 0, 5, 5})).isFalse();
        assertThat(splitOdd10.splitOdd10(new int[]{10, 7, 5, 5, 2})).isTrue();
        assertThat(splitOdd10.splitOdd10(new int[]{10, 7, 5, 5, 1})).isFalse();
    }

}
