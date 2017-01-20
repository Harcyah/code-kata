package com.harcyah.kata.codingbat.string3.sumNumbers;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SumNumbersTest {

    @Test
    public void testSumNumbers() {
        SumNumbers sumNumbers = new SumNumbers();
        Assertions.assertThat(sumNumbers.sumNumbers("abc123xyz")).isEqualTo(123);
        Assertions.assertThat(sumNumbers.sumNumbers("aa11b33")).isEqualTo(44);
        Assertions.assertThat(sumNumbers.sumNumbers("7 11")).isEqualTo(18);
        Assertions.assertThat(sumNumbers.sumNumbers("Chocolate")).isEqualTo(0);
        Assertions.assertThat(sumNumbers.sumNumbers("5hoco1a1e")).isEqualTo(7);
        Assertions.assertThat(sumNumbers.sumNumbers("5$$1;;1!!")).isEqualTo(7);
        Assertions.assertThat(sumNumbers.sumNumbers("a1234bb11")).isEqualTo(1245);
        Assertions.assertThat(sumNumbers.sumNumbers("")).isEqualTo(0);
        Assertions.assertThat(sumNumbers.sumNumbers("a22bbb3")).isEqualTo(25);
    }

}
