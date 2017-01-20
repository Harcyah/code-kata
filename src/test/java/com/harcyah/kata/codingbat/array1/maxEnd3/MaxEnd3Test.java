package com.harcyah.kata.codingbat.array1.maxEnd3;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MaxEnd3Test {

    @Test
    public void testMaxEnd3() {
        MaxEnd3 maxEnd3 = new MaxEnd3();
        Assertions.assertThat(maxEnd3.maxEnd3(new int[]{1, 2, 3})).isEqualTo(new int[]{3, 3, 3});
        Assertions.assertThat(maxEnd3.maxEnd3(new int[]{11, 5, 9})).isEqualTo(new int[]{11, 11, 11});
        Assertions.assertThat(maxEnd3.maxEnd3(new int[]{2, 11, 3})).isEqualTo(new int[]{3, 3, 3});
        Assertions.assertThat(maxEnd3.maxEnd3(new int[]{11, 3, 3})).isEqualTo(new int[]{11, 11, 11});
        Assertions.assertThat(maxEnd3.maxEnd3(new int[]{3, 11, 11})).isEqualTo(new int[]{11, 11, 11});
        Assertions.assertThat(maxEnd3.maxEnd3(new int[]{2, 2, 2})).isEqualTo(new int[]{2, 2, 2});
        Assertions.assertThat(maxEnd3.maxEnd3(new int[]{2, 11, 2})).isEqualTo(new int[]{2, 2, 2});
        Assertions.assertThat(maxEnd3.maxEnd3(new int[]{0, 0, 1})).isEqualTo(new int[]{1, 1, 1});
    }

}
