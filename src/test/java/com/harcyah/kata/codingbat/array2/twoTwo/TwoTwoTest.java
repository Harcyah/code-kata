package com.harcyah.kata.codingbat.array2.twoTwo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TwoTwoTest {

    @Test
    public void testTwoTwo() {
        TwoTwo twoTwo = new TwoTwo();
        assertThat(twoTwo.twoTwo(new int[]{4, 2, 2, 3})).isTrue();
        assertThat(twoTwo.twoTwo(new int[]{2, 2, 4})).isTrue();
        assertThat(twoTwo.twoTwo(new int[]{2, 2, 4, 2})).isFalse();
        assertThat(twoTwo.twoTwo(new int[]{1, 3, 4})).isTrue();
        assertThat(twoTwo.twoTwo(new int[]{1, 2, 2, 3, 4})).isTrue();
        assertThat(twoTwo.twoTwo(new int[]{1, 2, 3, 4})).isFalse();
        assertThat(twoTwo.twoTwo(new int[]{2, 2})).isTrue();
        assertThat(twoTwo.twoTwo(new int[]{2, 2, 7})).isTrue();
        assertThat(twoTwo.twoTwo(new int[]{2, 2, 7, 2, 1})).isFalse();
        assertThat(twoTwo.twoTwo(new int[]{4, 2, 2, 2})).isTrue();
        assertThat(twoTwo.twoTwo(new int[]{2, 2, 2})).isTrue();
        assertThat(twoTwo.twoTwo(new int[]{1, 2})).isFalse();
        assertThat(twoTwo.twoTwo(new int[]{2})).isFalse();
        assertThat(twoTwo.twoTwo(new int[]{1})).isTrue();
        assertThat(twoTwo.twoTwo(new int[]{})).isTrue();
        assertThat(twoTwo.twoTwo(new int[]{5, 2, 2, 3})).isTrue();
        assertThat(twoTwo.twoTwo(new int[]{2, 2, 5, 2})).isFalse();
    }

}
