package com.harcyah.kata.codingbat.array2.lucky13;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Lucky13Test {

    @Test
    public void testLucky13() {
        Lucky13 lucky13 = new Lucky13();
        Assertions.assertThat(lucky13.lucky13(new int[]{0, 2, 4})).isEqualTo(true);
        Assertions.assertThat(lucky13.lucky13(new int[]{1, 2, 3})).isEqualTo(false);
        Assertions.assertThat(lucky13.lucky13(new int[]{1, 2, 4})).isEqualTo(false);
        Assertions.assertThat(lucky13.lucky13(new int[]{2, 7, 2, 8})).isEqualTo(true);
        Assertions.assertThat(lucky13.lucky13(new int[]{2, 7, 1, 8})).isEqualTo(false);
        Assertions.assertThat(lucky13.lucky13(new int[]{3, 7, 2, 8})).isEqualTo(false);
        Assertions.assertThat(lucky13.lucky13(new int[]{2, 7, 2, 1})).isEqualTo(false);
        Assertions.assertThat(lucky13.lucky13(new int[]{1, 2})).isEqualTo(false);
        Assertions.assertThat(lucky13.lucky13(new int[]{2, 2})).isEqualTo(true);
        Assertions.assertThat(lucky13.lucky13(new int[]{2})).isEqualTo(true);
        Assertions.assertThat(lucky13.lucky13(new int[]{3})).isEqualTo(false);
        Assertions.assertThat(lucky13.lucky13(new int[]{})).isEqualTo(true);
    }

}


