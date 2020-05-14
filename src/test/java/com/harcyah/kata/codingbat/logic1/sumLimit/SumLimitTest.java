package com.harcyah.kata.codingbat.logic1.sumLimit;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SumLimitTest {

    @Test
    public void testSumLimit() {
        SumLimit sumLimit = new SumLimit();
        assertThat(sumLimit.sumLimit(2, 3)).isEqualTo(5);
        assertThat(sumLimit.sumLimit(8, 3)).isEqualTo(8);
        assertThat(sumLimit.sumLimit(8, 1)).isEqualTo(9);
        assertThat(sumLimit.sumLimit(11, 39)).isEqualTo(50);
        assertThat(sumLimit.sumLimit(11, 99)).isEqualTo(11);
        assertThat(sumLimit.sumLimit(0, 0)).isEqualTo(0);
        assertThat(sumLimit.sumLimit(99, 0)).isEqualTo(99);
        assertThat(sumLimit.sumLimit(99, 1)).isEqualTo(99);
        assertThat(sumLimit.sumLimit(123, 1)).isEqualTo(124);
        assertThat(sumLimit.sumLimit(1, 123)).isEqualTo(1);
        assertThat(sumLimit.sumLimit(23, 60)).isEqualTo(83);
        assertThat(sumLimit.sumLimit(23, 80)).isEqualTo(23);
        assertThat(sumLimit.sumLimit(9000, 1)).isEqualTo(9001);
        assertThat(sumLimit.sumLimit(90000000, 1)).isEqualTo(90000001);
        assertThat(sumLimit.sumLimit(9000, 1000)).isEqualTo(9000);
    }

}
