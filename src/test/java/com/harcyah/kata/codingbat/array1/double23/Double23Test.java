package com.harcyah.kata.codingbat.array1.double23;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Double23Test {

    @Test
    public void testDouble23() {
        Double23 double23 = new Double23();
        assertThat(double23.double23(new int[]{2, 2}))
            .isTrue();
        assertThat(double23.double23(new int[]{3, 3}))
            .isTrue();
        assertThat(double23.double23(new int[]{2, 3}))
            .isFalse();
        assertThat(double23.double23(new int[]{3, 2}))
            .isFalse();
        assertThat(double23.double23(new int[]{4, 5}))
            .isFalse();
        assertThat(double23.double23(new int[]{2}))
            .isFalse();
        assertThat(double23.double23(new int[]{3}))
            .isFalse();
        assertThat(double23.double23(new int[]{}))
            .isFalse();
        assertThat(double23.double23(new int[]{3, 4}))
            .isFalse();
    }

}
