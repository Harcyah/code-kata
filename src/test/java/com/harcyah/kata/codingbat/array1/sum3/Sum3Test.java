package com.harcyah.kata.codingbat.array1.sum3;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Sum3Test {

    @Test
    public void testSum3() {
        Sum3 sum3 = new Sum3();
        Assertions.assertThat(sum3.sum3(new int[]{1, 2, 3})).isEqualTo(6);
        Assertions.assertThat(sum3.sum3(new int[]{5, 11, 2})).isEqualTo(18);
        Assertions.assertThat(sum3.sum3(new int[]{7, 0, 0})).isEqualTo(7);
        Assertions.assertThat(sum3.sum3(new int[]{1, 2, 1})).isEqualTo(4);
        Assertions.assertThat(sum3.sum3(new int[]{1, 1, 1})).isEqualTo(3);
        Assertions.assertThat(sum3.sum3(new int[]{2, 7, 2})).isEqualTo(11);
    }

}
