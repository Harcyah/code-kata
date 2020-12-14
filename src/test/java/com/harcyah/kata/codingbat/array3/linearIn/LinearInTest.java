package com.harcyah.kata.codingbat.array3.linearIn;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LinearInTest {

    @Test
    public void testLinearIn() {
        LinearIn linearIn = new LinearIn();
        assertThat(linearIn.linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 4}))
            .isTrue();
        assertThat(linearIn.linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4}))
            .isFalse();
        assertThat(linearIn.linearIn(new int[]{1, 2, 4, 4, 6}, new int[]{2, 4}))
            .isTrue();
        assertThat(linearIn.linearIn(new int[]{2, 2, 4, 4, 6, 6}, new int[]{2, 4}))
            .isTrue();
        assertThat(linearIn.linearIn(new int[]{2, 2, 2, 2, 2}, new int[]{2, 2}))
            .isTrue();
        assertThat(linearIn.linearIn(new int[]{2, 2, 2, 2, 2}, new int[]{2, 4}))
            .isFalse();
        assertThat(linearIn.linearIn(new int[]{2, 2, 2, 2, 4}, new int[]{2, 4}))
            .isTrue();
        assertThat(linearIn.linearIn(new int[]{1, 2, 3}, new int[]{2}))
            .isTrue();
        assertThat(linearIn.linearIn(new int[]{1, 2, 3}, new int[]{-1}))
            .isFalse();
        assertThat(linearIn.linearIn(new int[]{1, 2, 3}, new int[]{}))
            .isTrue();
        assertThat(linearIn.linearIn(new int[]{-1, 0, 3, 3, 3, 10, 12}, new int[]{-1, 0, 3, 12}))
            .isTrue();
        assertThat(linearIn.linearIn(new int[]{-1, 0, 3, 3, 3, 10, 12}, new int[]{0, 3, 12, 14}))
            .isFalse();
        assertThat(linearIn.linearIn(new int[]{-1, 0, 3, 3, 3, 10, 12}, new int[]{-1, 10, 11}))
            .isFalse();
    }

}
