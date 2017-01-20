package com.harcyah.kata.codingbat.recursion1.sumDigits;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SumDigitsTest {

    @Test
    public void testSumDigits() {
        SumDigits sumDigits = new SumDigits();
        Assertions.assertThat(sumDigits.sumDigits(126)).isEqualTo(9);
        Assertions.assertThat(sumDigits.sumDigits(49)).isEqualTo(13);
        Assertions.assertThat(sumDigits.sumDigits(12)).isEqualTo(3);
        Assertions.assertThat(sumDigits.sumDigits(10)).isEqualTo(1);
        Assertions.assertThat(sumDigits.sumDigits(1)).isEqualTo(1);
        Assertions.assertThat(sumDigits.sumDigits(0)).isEqualTo(0);
        Assertions.assertThat(sumDigits.sumDigits(730)).isEqualTo(10);
        Assertions.assertThat(sumDigits.sumDigits(1111)).isEqualTo(4);
        Assertions.assertThat(sumDigits.sumDigits(11111)).isEqualTo(5);
        Assertions.assertThat(sumDigits.sumDigits(10110)).isEqualTo(3);
        Assertions.assertThat(sumDigits.sumDigits(235)).isEqualTo(10);
    }

}
