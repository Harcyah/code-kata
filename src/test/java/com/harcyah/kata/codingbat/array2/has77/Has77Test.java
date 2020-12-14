package com.harcyah.kata.codingbat.array2.has77;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Has77Test {

    @Test
    public void testHas77() {
        Has77 has77 = new Has77();
        assertThat(has77.has77(new int[]{1, 7, 7})).isTrue();
        assertThat(has77.has77(new int[]{1, 7, 1, 7})).isTrue();
        assertThat(has77.has77(new int[]{1, 7, 1, 1, 7})).isFalse();
        assertThat(has77.has77(new int[]{7, 7, 1, 1, 7})).isTrue();
        assertThat(has77.has77(new int[]{2, 7, 2, 2, 7, 2})).isFalse();
        assertThat(has77.has77(new int[]{2, 7, 2, 2, 7, 7})).isTrue();
        assertThat(has77.has77(new int[]{7, 2, 7, 2, 2, 7})).isTrue();
        assertThat(has77.has77(new int[]{7, 2, 6, 2, 2, 7})).isFalse();
        assertThat(has77.has77(new int[]{7, 7, 7})).isTrue();
        assertThat(has77.has77(new int[]{7, 1, 7})).isTrue();
        assertThat(has77.has77(new int[]{7, 1, 1})).isFalse();
        assertThat(has77.has77(new int[]{1, 2})).isFalse();
        assertThat(has77.has77(new int[]{1, 7})).isFalse();
        assertThat(has77.has77(new int[]{7})).isFalse();
    }

}
