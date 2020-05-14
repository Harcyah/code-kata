package com.harcyah.kata.codingbat.array2.no14;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class No14Test {

    @Test
    public void testNo14() {
        No14 no14 = new No14();
        assertThat(no14.no14(new int[]{1, 2, 3}))
            .isTrue();
        assertThat(no14.no14(new int[]{1, 2, 3, 4}))
            .isFalse();
        assertThat(no14.no14(new int[]{2, 3, 4}))
            .isTrue();
        assertThat(no14.no14(new int[]{1, 1, 4, 4}))
            .isFalse();
        assertThat(no14.no14(new int[]{2, 2, 4, 4}))
            .isTrue();
        assertThat(no14.no14(new int[]{2, 3, 4, 1}))
            .isFalse();
        assertThat(no14.no14(new int[]{2, 1, 1}))
            .isTrue();
        assertThat(no14.no14(new int[]{1, 4}))
            .isFalse();
        assertThat(no14.no14(new int[]{2})).isTrue();
        assertThat(no14.no14(new int[]{2, 1}))
            .isTrue();
        assertThat(no14.no14(new int[]{1}))
            .isTrue();
        assertThat(no14.no14(new int[]{4}))
            .isTrue();
        assertThat(no14.no14(new int[]{}))
            .isTrue();
        assertThat(no14.no14(new int[]{1, 1, 1, 1}))
            .isTrue();
        assertThat(no14.no14(new int[]{9, 4, 4, 1}))
            .isFalse();
        assertThat(no14.no14(new int[]{4, 2, 3, 1}))
            .isFalse();
        assertThat(no14.no14(new int[]{4, 2, 3, 5}))
            .isTrue();
        assertThat(no14.no14(new int[]{4, 4, 2}))
            .isTrue();
        assertThat(no14.no14(new int[]{1, 4, 4}))
            .isFalse();
    }

}

