package com.harcyah.kata.codingbat.array2.evenOdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EvenOddTest {

    @Test
    public void testEvenOdd() {
        EvenOdd evenOdd = new EvenOdd();
        assertThat(evenOdd.evenOdd(new int[]{1, 0, 1, 0, 0, 1, 1}))
            .isEqualTo(new int[]{0, 0, 0, 1, 1, 1, 1});
        assertThat(evenOdd.evenOdd(new int[]{3, 3, 2}))
            .isEqualTo(new int[]{2, 3, 3});
        assertThat(evenOdd.evenOdd(new int[]{2, 2, 2}))
            .isEqualTo(new int[]{2, 2, 2});
        assertThat(evenOdd.evenOdd(new int[]{3, 2, 2}))
            .isEqualTo(new int[]{2, 2, 3});
        assertThat(evenOdd.evenOdd(new int[]{1, 1, 0, 1, 0}))
            .isEqualTo(new int[]{0, 0, 1, 1, 1});
        assertThat(evenOdd.evenOdd(new int[]{1}))
            .isEqualTo(new int[]{1});
        assertThat(evenOdd.evenOdd(new int[]{1, 2}))
            .isEqualTo(new int[]{2, 1});
        assertThat(evenOdd.evenOdd(new int[]{2, 1}))
            .isEqualTo(new int[]{2, 1});
        assertThat(evenOdd.evenOdd(new int[]{}))
            .isEqualTo(new int[]{});
    }

}
