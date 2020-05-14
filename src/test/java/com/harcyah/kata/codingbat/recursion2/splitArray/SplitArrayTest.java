package com.harcyah.kata.codingbat.recursion2.splitArray;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SplitArrayTest {

    @Test
    public void testSplitArray() {
        SplitArray splitArray = new SplitArray();
        assertThat(splitArray.splitArray(new int[]{2, 2})).isTrue();
        assertThat(splitArray.splitArray(new int[]{2, 3})).isFalse();
        assertThat(splitArray.splitArray(new int[]{5, 2, 3})).isTrue();
        assertThat(splitArray.splitArray(new int[]{5, 2, 2})).isFalse();
        assertThat(splitArray.splitArray(new int[]{1, 1, 1, 1, 1, 1})).isTrue();
        assertThat(splitArray.splitArray(new int[]{1, 1, 1, 1, 1})).isFalse();
        assertThat(splitArray.splitArray(new int[]{})).isTrue();
        assertThat(splitArray.splitArray(new int[]{1})).isFalse();
        assertThat(splitArray.splitArray(new int[]{3, 5})).isFalse();
        assertThat(splitArray.splitArray(new int[]{5, 3, 2})).isTrue();
        assertThat(splitArray.splitArray(new int[]{2, 2, 10, 10, 1, 1})).isTrue();
        assertThat(splitArray.splitArray(new int[]{1, 2, 2, 10, 10, 1, 1})).isFalse();
        assertThat(splitArray.splitArray(new int[]{1, 2, 3, 10, 10, 1, 1})).isTrue();
    }

}
