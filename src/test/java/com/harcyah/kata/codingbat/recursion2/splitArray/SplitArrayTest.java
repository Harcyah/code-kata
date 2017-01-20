package com.harcyah.kata.codingbat.recursion2.splitArray;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SplitArrayTest {

    @Test
    public void testSplitArray() {
        SplitArray splitArray = new SplitArray();
        Assertions.assertThat(splitArray.splitArray(new int[]{2, 2})).isEqualTo(true);
        Assertions.assertThat(splitArray.splitArray(new int[]{2, 3})).isEqualTo(false);
        Assertions.assertThat(splitArray.splitArray(new int[]{5, 2, 3})).isEqualTo(true);
        Assertions.assertThat(splitArray.splitArray(new int[]{5, 2, 2})).isEqualTo(false);
        Assertions.assertThat(splitArray.splitArray(new int[]{1, 1, 1, 1, 1, 1})).isEqualTo(true);
        Assertions.assertThat(splitArray.splitArray(new int[]{1, 1, 1, 1, 1})).isEqualTo(false);
        Assertions.assertThat(splitArray.splitArray(new int[]{})).isEqualTo(true);
        Assertions.assertThat(splitArray.splitArray(new int[]{1})).isEqualTo(false);
        Assertions.assertThat(splitArray.splitArray(new int[]{3, 5})).isEqualTo(false);
        Assertions.assertThat(splitArray.splitArray(new int[]{5, 3, 2})).isEqualTo(true);
        Assertions.assertThat(splitArray.splitArray(new int[]{2, 2, 10, 10, 1, 1})).isEqualTo(true);
        Assertions.assertThat(splitArray.splitArray(new int[]{1, 2, 2, 10, 10, 1, 1})).isEqualTo(false);
        Assertions.assertThat(splitArray.splitArray(new int[]{1, 2, 3, 10, 10, 1, 1})).isEqualTo(true);
    }

}
