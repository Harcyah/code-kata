package com.harcyah.kata.codingbat.array1.maxTriple;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxTripleTest {

    @Test
    public void testMaxTriple() {
        MaxTriple maxTriple = new MaxTriple();
        assertThat(maxTriple.maxTriple(new int[]{1, 2, 3})).isEqualTo(3);
        assertThat(maxTriple.maxTriple(new int[]{1, 5, 3})).isEqualTo(5);
        assertThat(maxTriple.maxTriple(new int[]{5, 2, 3})).isEqualTo(5);
        assertThat(maxTriple.maxTriple(new int[]{1, 2, 3, 1, 1})).isEqualTo(3);
        assertThat(maxTriple.maxTriple(new int[]{1, 7, 3, 1, 5})).isEqualTo(5);
        assertThat(maxTriple.maxTriple(new int[]{5, 1, 3, 7, 1})).isEqualTo(5);
        assertThat(maxTriple.maxTriple(new int[]{5, 1, 7, 3, 7, 8, 1})).isEqualTo(5);
        assertThat(maxTriple.maxTriple(new int[]{5, 1, 7, 9, 7, 8, 1})).isEqualTo(9);
        assertThat(maxTriple.maxTriple(new int[]{5, 1, 7, 3, 7, 8, 9})).isEqualTo(9);
        assertThat(maxTriple.maxTriple(new int[]{2, 2, 5, 1, 1})).isEqualTo(5);
    }

}
