package com.harcyah.kata.codingbat.array2.lucky13;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Lucky13Test {

    @Test
    public void testLucky13() {
        Lucky13 lucky13 = new Lucky13();
        assertThat(lucky13.lucky13(new int[]{0, 2, 4})).isTrue();
        assertThat(lucky13.lucky13(new int[]{1, 2, 3})).isFalse();
        assertThat(lucky13.lucky13(new int[]{1, 2, 4})).isFalse();
        assertThat(lucky13.lucky13(new int[]{2, 7, 2, 8})).isTrue();
        assertThat(lucky13.lucky13(new int[]{2, 7, 1, 8})).isFalse();
        assertThat(lucky13.lucky13(new int[]{3, 7, 2, 8})).isFalse();
        assertThat(lucky13.lucky13(new int[]{2, 7, 2, 1})).isFalse();
        assertThat(lucky13.lucky13(new int[]{1, 2})).isFalse();
        assertThat(lucky13.lucky13(new int[]{2, 2})).isTrue();
        assertThat(lucky13.lucky13(new int[]{2})).isTrue();
        assertThat(lucky13.lucky13(new int[]{3})).isFalse();
        assertThat(lucky13.lucky13(new int[]{})).isTrue();
    }

}

