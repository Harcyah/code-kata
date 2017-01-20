package com.harcyah.kata.codingbat.array2.fizzArray3;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FizzArray3Test {

    @Test
    public void testFizzArray3() {
        FizzArray3 fizzArray3 = new FizzArray3();
        Assertions.assertThat(fizzArray3.fizzArray3(5, 10)).isEqualTo(new int[]{5, 6, 7, 8, 9});
        Assertions.assertThat(fizzArray3.fizzArray3(11, 18)).isEqualTo(new int[]{11, 12, 13, 14, 15, 16, 17});
        Assertions.assertThat(fizzArray3.fizzArray3(1, 3)).isEqualTo(new int[]{1, 2});
        Assertions.assertThat(fizzArray3.fizzArray3(1, 2)).isEqualTo(new int[]{1});
        Assertions.assertThat(fizzArray3.fizzArray3(1, 1)).isEqualTo(new int[]{});
        Assertions.assertThat(fizzArray3.fizzArray3(1000, 1005)).isEqualTo(new int[]{1000, 1001, 1002, 1003, 1004});
    }

}


