package com.harcyah.kata.codingbat.recursion2.split53;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Split53Test {

    @Test
    public void testSplit53() {
        Split53 split53 = new Split53();
        assertThat(split53.split53(new int[]{1, 1}))
            .isTrue();
        assertThat(split53.split53(new int[]{1, 1, 1}))
            .isFalse();
        assertThat(split53.split53(new int[]{2, 4, 2}))
            .isTrue();
        assertThat(split53.split53(new int[]{2, 2, 2, 1}))
            .isFalse();
        assertThat(split53.split53(new int[]{3, 3, 5, 1}))
            .isTrue();
        assertThat(split53.split53(new int[]{3, 5, 8}))
            .isFalse();
        assertThat(split53.split53(new int[]{2, 4, 6}))
            .isTrue();
        assertThat(split53.split53(new int[]{3, 5, 6, 10, 3, 3}))
            .isTrue();
    }

}
