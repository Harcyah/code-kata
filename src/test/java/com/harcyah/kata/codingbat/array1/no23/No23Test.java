package com.harcyah.kata.codingbat.array1.no23;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class No23Test {

    @Test
    public void testNo23() {
        No23 no23 = new No23();
        assertThat(no23.no23(new int[]{4, 5}))
            .isTrue();
        assertThat(no23.no23(new int[]{4, 2}))
            .isFalse();
        assertThat(no23.no23(new int[]{3, 5}))
            .isFalse();
        assertThat(no23.no23(new int[]{1, 9}))
            .isTrue();
        assertThat(no23.no23(new int[]{2, 9}))
            .isFalse();
        assertThat(no23.no23(new int[]{1, 3}))
            .isFalse();
        assertThat(no23.no23(new int[]{1, 1}))
            .isTrue();
        assertThat(no23.no23(new int[]{2, 2}))
            .isFalse();
        assertThat(no23.no23(new int[]{3, 3}))
            .isFalse();
        assertThat(no23.no23(new int[]{7, 8}))
            .isTrue();
        assertThat(no23.no23(new int[]{8, 7}))
            .isTrue();
    }

}
