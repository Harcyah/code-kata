package com.harcyah.kata.codingbat.array1.has23;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Has23Test {

    @Test
    public void testHas23() {
        Has23 has23 = new Has23();
        assertThat(has23.has23(new int[]{2, 5}))
            .isTrue();
        assertThat(has23.has23(new int[]{4, 3}))
            .isTrue();
        assertThat(has23.has23(new int[]{4, 5}))
            .isFalse();
        assertThat(has23.has23(new int[]{2, 2}))
            .isTrue();
        assertThat(has23.has23(new int[]{3, 2}))
            .isTrue();
        assertThat(has23.has23(new int[]{3, 3}))
            .isTrue();
        assertThat(has23.has23(new int[]{7, 7}))
            .isFalse();
        assertThat(has23.has23(new int[]{3, 9}))
            .isTrue();
        assertThat(has23.has23(new int[]{9, 5}))
            .isFalse();
    }

}
