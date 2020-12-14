package com.harcyah.kata.codingbat.array2.countEvens;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountEvensTest {

    @Test
    public void testCountEvens() {
        CountEvens countEvens = new CountEvens();
        assertThat(countEvens.countEvens(new int[]{2, 1, 2, 3, 4}))
            .isEqualTo(3);
        assertThat(countEvens.countEvens(new int[]{2, 2, 0}))
            .isEqualTo(3);
        assertThat(countEvens.countEvens(new int[]{1, 3, 5}))
            .isEqualTo(0);
        assertThat(countEvens.countEvens(new int[]{}))
            .isEqualTo(0);
        assertThat(countEvens.countEvens(new int[]{11, 9, 0, 1}))
            .isEqualTo(1);
        assertThat(countEvens.countEvens(new int[]{2, 11, 9, 0}))
            .isEqualTo(2);
        assertThat(countEvens.countEvens(new int[]{2}))
            .isEqualTo(1);
        assertThat(countEvens.countEvens(new int[]{2, 5, 12}))
            .isEqualTo(2);
    }

}

