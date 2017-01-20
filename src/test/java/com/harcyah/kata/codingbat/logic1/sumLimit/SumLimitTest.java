package com.harcyah.kata.codingbat.logic1.sumLimit;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SumLimitTest {

    @Test
    public void testSumLimit() {
        SumLimit sumLimit = new SumLimit();
        Assertions.assertThat(sumLimit.sumLimit(2, 3)).isEqualTo(5);
        Assertions.assertThat(sumLimit.sumLimit(8, 3)).isEqualTo(8);
        Assertions.assertThat(sumLimit.sumLimit(8, 1)).isEqualTo(9);
        Assertions.assertThat(sumLimit.sumLimit(11, 39)).isEqualTo(50);
        Assertions.assertThat(sumLimit.sumLimit(11, 99)).isEqualTo(11);
        Assertions.assertThat(sumLimit.sumLimit(0, 0)).isEqualTo(0);
        Assertions.assertThat(sumLimit.sumLimit(99, 0)).isEqualTo(99);
        Assertions.assertThat(sumLimit.sumLimit(99, 1)).isEqualTo(99);
        Assertions.assertThat(sumLimit.sumLimit(123, 1)).isEqualTo(124);
        Assertions.assertThat(sumLimit.sumLimit(1, 123)).isEqualTo(1);
        Assertions.assertThat(sumLimit.sumLimit(23, 60)).isEqualTo(83);
        Assertions.assertThat(sumLimit.sumLimit(23, 80)).isEqualTo(23);
        Assertions.assertThat(sumLimit.sumLimit(9000, 1)).isEqualTo(9001);
        Assertions.assertThat(sumLimit.sumLimit(90000000, 1)).isEqualTo(90000001);
        Assertions.assertThat(sumLimit.sumLimit(9000, 1000)).isEqualTo(9000);
    }

}
