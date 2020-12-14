package com.harcyah.kata.codingbat.array2.sameEnds;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SameEndsTest {

    @Test
    public void testSameEnds() {
        SameEnds sameEnds = new SameEnds();
        assertThat(sameEnds.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 1))
            .isFalse();
        assertThat(sameEnds.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 2))
            .isTrue();
        assertThat(sameEnds.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 3))
            .isFalse();
        assertThat(sameEnds.sameEnds(new int[]{1, 2, 5, 2, 1}, 1))
            .isTrue();
        assertThat(sameEnds.sameEnds(new int[]{1, 2, 5, 2, 1}, 2))
            .isFalse();
        assertThat(sameEnds.sameEnds(new int[]{1, 2, 5, 2, 1}, 0))
            .isTrue();
        assertThat(sameEnds.sameEnds(new int[]{1, 2, 5, 2, 1}, 5))
            .isTrue();
        assertThat(sameEnds.sameEnds(new int[]{1, 1, 1}, 0))
            .isTrue();
        assertThat(sameEnds.sameEnds(new int[]{1, 1, 1}, 1))
            .isTrue();
        assertThat(sameEnds.sameEnds(new int[]{1, 1, 1}, 2))
            .isTrue();
        assertThat(sameEnds.sameEnds(new int[]{1, 1, 1}, 3))
            .isTrue();
        assertThat(sameEnds.sameEnds(new int[]{1}, 1))
            .isTrue();
        assertThat(sameEnds.sameEnds(new int[]{}, 0))
            .isTrue();
        assertThat(sameEnds.sameEnds(new int[]{4, 2, 4, 5}, 1))
            .isFalse();
    }

}
