package com.harcyah.kata.codingbat.array1.rotateLeft3;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class RotateLeft3Test {

    @Test
    public void testRotateLeft3() {
        RotateLeft3 rotateLeft3 = new RotateLeft3();
        Assertions.assertThat(rotateLeft3.rotateLeft3(new int[]{1, 2, 3})).isEqualTo(new int[]{2, 3, 1});
        Assertions.assertThat(rotateLeft3.rotateLeft3(new int[]{5, 11, 9})).isEqualTo(new int[]{11, 9, 5});
        Assertions.assertThat(rotateLeft3.rotateLeft3(new int[]{7, 0, 0})).isEqualTo(new int[]{0, 0, 7});
        Assertions.assertThat(rotateLeft3.rotateLeft3(new int[]{1, 2, 1})).isEqualTo(new int[]{2, 1, 1});
        Assertions.assertThat(rotateLeft3.rotateLeft3(new int[]{0, 0, 1})).isEqualTo(new int[]{0, 1, 0});
    }

}
