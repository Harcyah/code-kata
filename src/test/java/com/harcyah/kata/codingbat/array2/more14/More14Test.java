package com.harcyah.kata.codingbat.array2.more14;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class More14Test {

    @Test
    public void testMore14() {
        More14 more14 = new More14();
        assertThat(more14.more14(new int[]{1, 4, 1}))
            .isTrue();
        assertThat(more14.more14(new int[]{1, 4, 1, 4}))
            .isFalse();
        assertThat(more14.more14(new int[]{1, 1}))
            .isTrue();
        assertThat(more14.more14(new int[]{1, 6, 6}))
            .isTrue();
        assertThat(more14.more14(new int[]{1}))
            .isTrue();
        assertThat(more14.more14(new int[]{1, 4}))
            .isFalse();
        assertThat(more14.more14(new int[]{6, 1, 1}))
            .isTrue();
        assertThat(more14.more14(new int[]{1, 6, 4}))
            .isFalse();
        assertThat(more14.more14(new int[]{1, 1, 4, 4, 1}))
            .isTrue();
        assertThat(more14.more14(new int[]{1, 1, 6, 4, 4, 1}))
            .isTrue();
        assertThat(more14.more14(new int[]{}))
            .isFalse();
        assertThat(more14.more14(new int[]{4, 1, 4, 6}))
            .isFalse();
        assertThat(more14.more14(new int[]{4, 1, 4, 6, 1}))
            .isFalse();
        assertThat(more14.more14(new int[]{1, 4, 1, 4, 1, 6}))
            .isTrue();
    }

}

