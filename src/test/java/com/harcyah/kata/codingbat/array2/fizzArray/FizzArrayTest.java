package com.harcyah.kata.codingbat.array2.fizzArray;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzArrayTest {

    @Test
    public void testFizzArray() {
        FizzArray fizzArray = new FizzArray();
        assertThat(fizzArray.fizzArray(4))
            .isEqualTo(new int[]{0, 1, 2, 3});
        assertThat(fizzArray.fizzArray(1))
            .isEqualTo(new int[]{0});
        assertThat(fizzArray.fizzArray(10))
            .isEqualTo(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
        assertThat(fizzArray.fizzArray(0))
            .isEqualTo(new int[]{});
        assertThat(fizzArray.fizzArray(2))
            .isEqualTo(new int[]{0, 1});
        assertThat(fizzArray.fizzArray(7))
            .isEqualTo(new int[]{0, 1, 2, 3, 4, 5, 6});
    }

}

