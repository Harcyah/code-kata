package com.harcyah.kata.codingbat.array2.shiftLeft;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ShiftLeftTest {

    @Test
    public void testShiftLeft() {
        ShiftLeft shiftLeft = new ShiftLeft();
        Assertions.assertThat(shiftLeft.shiftLeft(new int[]{6, 2, 5, 3})).isEqualTo(new int[]{2, 5, 3, 6});
        Assertions.assertThat(shiftLeft.shiftLeft(new int[]{1, 2})).isEqualTo(new int[]{2, 1});
        Assertions.assertThat(shiftLeft.shiftLeft(new int[]{1})).isEqualTo(new int[]{1});
        Assertions.assertThat(shiftLeft.shiftLeft(new int[]{})).isEqualTo(new int[]{});
        Assertions.assertThat(shiftLeft.shiftLeft(new int[]{1, 1, 2, 2, 4})).isEqualTo(new int[]{1, 2, 2, 4, 1});
        Assertions.assertThat(shiftLeft.shiftLeft(new int[]{1, 1, 1})).isEqualTo(new int[]{1, 1, 1});
        Assertions.assertThat(shiftLeft.shiftLeft(new int[]{1, 2, 3})).isEqualTo(new int[]{2, 3, 1});
    }

}
