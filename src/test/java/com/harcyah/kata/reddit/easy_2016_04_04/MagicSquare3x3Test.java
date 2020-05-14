package com.harcyah.kata.reddit.easy_2016_04_04;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MagicSquare3x3Test {

    @Test
    public void testIsMagicSquare() {
        MagicSquare3x3 ms = new MagicSquare3x3();
        assertThat(ms.isMagicSquare(new int[]{8, 1, 6, 3, 5, 7, 4, 9, 2}))
            .isTrue();
        assertThat(ms.isMagicSquare(new int[]{2, 7, 6, 9, 5, 1, 4, 3, 8}))
            .isTrue();
        assertThat(ms.isMagicSquare(new int[]{3, 5, 7, 8, 1, 6, 4, 9, 2}))
            .isFalse();
        assertThat(ms.isMagicSquare(new int[]{8, 1, 6, 7, 5, 3, 4, 9, 2}))
            .isFalse();
    }

}
