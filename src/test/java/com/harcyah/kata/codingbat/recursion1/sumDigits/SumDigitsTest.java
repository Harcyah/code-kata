package com.harcyah.kata.codingbat.recursion1.sumDigits;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SumDigitsTest {

    @Test
    public void testSumDigits() {
        SumDigits sumDigits = new SumDigits();
        assertThat(sumDigits.sumDigits(126)).isEqualTo(9);
        assertThat(sumDigits.sumDigits(49)).isEqualTo(13);
        assertThat(sumDigits.sumDigits(12)).isEqualTo(3);
        assertThat(sumDigits.sumDigits(10)).isEqualTo(1);
        assertThat(sumDigits.sumDigits(1)).isEqualTo(1);
        assertThat(sumDigits.sumDigits(0)).isEqualTo(0);
        assertThat(sumDigits.sumDigits(730)).isEqualTo(10);
        assertThat(sumDigits.sumDigits(1111)).isEqualTo(4);
        assertThat(sumDigits.sumDigits(11111)).isEqualTo(5);
        assertThat(sumDigits.sumDigits(10110)).isEqualTo(3);
        assertThat(sumDigits.sumDigits(235)).isEqualTo(10);
    }

}
