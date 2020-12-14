package com.harcyah.kata.codingbat.array1.rotateLeft3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RotateLeft3Test {

    @Test
    public void testRotateLeft3() {
        RotateLeft3 rotateLeft3 = new RotateLeft3();
        assertThat(rotateLeft3.rotateLeft3(new int[]{1, 2, 3})).isEqualTo(new int[]{2, 3, 1});
        assertThat(rotateLeft3.rotateLeft3(new int[]{5, 11, 9})).isEqualTo(new int[]{11, 9, 5});
        assertThat(rotateLeft3.rotateLeft3(new int[]{7, 0, 0})).isEqualTo(new int[]{0, 0, 7});
        assertThat(rotateLeft3.rotateLeft3(new int[]{1, 2, 1})).isEqualTo(new int[]{2, 1, 1});
        assertThat(rotateLeft3.rotateLeft3(new int[]{0, 0, 1})).isEqualTo(new int[]{0, 1, 0});
    }

}
