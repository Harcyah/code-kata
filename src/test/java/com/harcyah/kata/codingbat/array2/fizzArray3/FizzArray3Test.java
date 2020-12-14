package com.harcyah.kata.codingbat.array2.fizzArray3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzArray3Test {

    @Test
    public void testFizzArray3() {
        FizzArray3 fizzArray3 = new FizzArray3();
        assertThat(fizzArray3.fizzArray3(5, 10))
            .isEqualTo(new int[]{5, 6, 7, 8, 9});
        assertThat(fizzArray3.fizzArray3(11, 18))
            .isEqualTo(new int[]{11, 12, 13, 14, 15, 16, 17});
        assertThat(fizzArray3.fizzArray3(1, 3))
            .isEqualTo(new int[]{1, 2});
        assertThat(fizzArray3.fizzArray3(1, 2))
            .isEqualTo(new int[]{1});
        assertThat(fizzArray3.fizzArray3(1, 1))
            .isEqualTo(new int[]{});
        assertThat(fizzArray3.fizzArray3(1000, 1005))
            .isEqualTo(new int[]{1000, 1001, 1002, 1003, 1004});
    }

}

