package com.harcyah.kata.codingbat.array3.maxMirror;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxMirrorTest {

    @Test
    public void testMaxMirror() {
        MaxMirror maxMirror = new MaxMirror();
        assertThat(maxMirror.maxMirror(new int[]{1, 2, 3, 8, 9, 3, 2, 1})).isEqualTo(3);
        assertThat(maxMirror.maxMirror(new int[]{1, 2, 1, 4})).isEqualTo(3);
        assertThat(maxMirror.maxMirror(new int[]{7, 1, 2, 9, 7, 2, 1})).isEqualTo(2);
        assertThat(maxMirror.maxMirror(new int[]{21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9})).isEqualTo(4);
        assertThat(maxMirror.maxMirror(new int[]{1, 2, 1, 20, 21, 1, 2, 1, 2, 23, 24, 2, 1, 2, 1, 25})).isEqualTo(4);
        assertThat(maxMirror.maxMirror(new int[]{1, 2, 3, 2, 1})).isEqualTo(5);
        assertThat(maxMirror.maxMirror(new int[]{1, 2, 3, 3, 8})).isEqualTo(2);
        assertThat(maxMirror.maxMirror(new int[]{1, 2, 7, 8, 1, 7, 2})).isEqualTo(2);
        assertThat(maxMirror.maxMirror(new int[]{1, 1, 1})).isEqualTo(3);
        assertThat(maxMirror.maxMirror(new int[]{1})).isEqualTo(1);
        assertThat(maxMirror.maxMirror(new int[]{})).isEqualTo(0);
        assertThat(maxMirror.maxMirror(new int[]{9, 1, 1, 4, 2, 1, 1, 1})).isEqualTo(3);
        assertThat(maxMirror.maxMirror(new int[]{5, 9, 9, 4, 5, 4, 9, 9, 2})).isEqualTo(7);
        assertThat(maxMirror.maxMirror(new int[]{5, 9, 9, 6, 5, 4, 9, 9, 2})).isEqualTo(2);
        assertThat(maxMirror.maxMirror(new int[]{5, 9, 1, 6, 5, 4, 1, 9, 5})).isEqualTo(3);
    }

}
