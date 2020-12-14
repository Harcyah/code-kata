package com.harcyah.kata.codingbat.array2.tripleUp;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TripleUpTest {

    @Test
    public void testTripleUp() {
        TripleUp tripleUp = new TripleUp();
        assertThat(tripleUp.tripleUp(new int[]{1, 4, 5, 6, 2})).isTrue();
        assertThat(tripleUp.tripleUp(new int[]{1, 2, 3})).isTrue();
        assertThat(tripleUp.tripleUp(new int[]{1, 2, 4})).isFalse();
        assertThat(tripleUp.tripleUp(new int[]{1, 2, 4, 5, 7, 6, 5, 6, 7, 6})).isTrue();
        assertThat(tripleUp.tripleUp(new int[]{1, 2, 4, 5, 7, 6, 5, 7, 7, 6})).isFalse();
        assertThat(tripleUp.tripleUp(new int[]{1, 2})).isFalse();
        assertThat(tripleUp.tripleUp(new int[]{1})).isFalse();
        assertThat(tripleUp.tripleUp(new int[]{})).isFalse();
        assertThat(tripleUp.tripleUp(new int[]{10, 9, 8, -100, -99, -98, 100})).isTrue();
        assertThat(tripleUp.tripleUp(new int[]{10, 9, 8, -100, -99, 99, 100})).isFalse();
        assertThat(tripleUp.tripleUp(new int[]{-100, -99, -99, 100, 101, 102})).isTrue();
        assertThat(tripleUp.tripleUp(new int[]{2, 3, 5, 6, 8, 9, 2, 3})).isFalse();
    }

}
