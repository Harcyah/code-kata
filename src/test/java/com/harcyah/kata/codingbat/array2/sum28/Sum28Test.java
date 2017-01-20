package com.harcyah.kata.codingbat.array2.sum28;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Sum28Test {

    @Test
    public void testSum28() {
        Sum28 sum28 = new Sum28();
        Assertions.assertThat(sum28.sum28(new int[]{2, 3, 2, 2, 4, 2})).isEqualTo(true);
        Assertions.assertThat(sum28.sum28(new int[]{2, 3, 2, 2, 4, 2, 2})).isEqualTo(false);
        Assertions.assertThat(sum28.sum28(new int[]{1, 2, 3, 4})).isEqualTo(false);
        Assertions.assertThat(sum28.sum28(new int[]{2, 2, 2, 2})).isEqualTo(true);
        Assertions.assertThat(sum28.sum28(new int[]{1, 2, 2, 2, 2, 4})).isEqualTo(true);
        Assertions.assertThat(sum28.sum28(new int[]{})).isEqualTo(false);
        Assertions.assertThat(sum28.sum28(new int[]{2})).isEqualTo(false);
        Assertions.assertThat(sum28.sum28(new int[]{8})).isEqualTo(false);
        Assertions.assertThat(sum28.sum28(new int[]{2, 2, 2})).isEqualTo(false);
        Assertions.assertThat(sum28.sum28(new int[]{2, 2, 2, 2, 2})).isEqualTo(false);
        Assertions.assertThat(sum28.sum28(new int[]{1, 2, 2, 1, 2, 2})).isEqualTo(true);
        Assertions.assertThat(sum28.sum28(new int[]{5, 2, 2, 2, 4, 2})).isEqualTo(true);
    }

}


