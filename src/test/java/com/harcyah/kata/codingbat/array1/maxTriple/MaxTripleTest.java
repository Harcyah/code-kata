package com.harcyah.kata.codingbat.array1.maxTriple;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MaxTripleTest {

    @Test
    public void testMaxTriple() {
        MaxTriple maxTriple = new MaxTriple();
        Assertions.assertThat(maxTriple.maxTriple(new int[]{1, 2, 3})).isEqualTo(3);
        Assertions.assertThat(maxTriple.maxTriple(new int[]{1, 5, 3})).isEqualTo(5);
        Assertions.assertThat(maxTriple.maxTriple(new int[]{5, 2, 3})).isEqualTo(5);
        Assertions.assertThat(maxTriple.maxTriple(new int[]{1, 2, 3, 1, 1})).isEqualTo(3);
        Assertions.assertThat(maxTriple.maxTriple(new int[]{1, 7, 3, 1, 5})).isEqualTo(5);
        Assertions.assertThat(maxTriple.maxTriple(new int[]{5, 1, 3, 7, 1})).isEqualTo(5);
        Assertions.assertThat(maxTriple.maxTriple(new int[]{5, 1, 7, 3, 7, 8, 1})).isEqualTo(5);
        Assertions.assertThat(maxTriple.maxTriple(new int[]{5, 1, 7, 9, 7, 8, 1})).isEqualTo(9);
        Assertions.assertThat(maxTriple.maxTriple(new int[]{5, 1, 7, 3, 7, 8, 9})).isEqualTo(9);
        Assertions.assertThat(maxTriple.maxTriple(new int[]{2, 2, 5, 1, 1})).isEqualTo(5);
    }

}
