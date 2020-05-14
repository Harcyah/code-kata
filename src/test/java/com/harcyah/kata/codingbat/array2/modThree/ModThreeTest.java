package com.harcyah.kata.codingbat.array2.modThree;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ModThreeTest {

    @Test
    public void testModThree() {
        ModThree modThree = new ModThree();
        assertThat(modThree.modThree(new int[]{2, 1, 3, 5}))
            .isTrue();
        assertThat(modThree.modThree(new int[]{2, 1, 2, 5}))
            .isFalse();
        assertThat(modThree.modThree(new int[]{2, 4, 2, 5}))
            .isTrue();
        assertThat(modThree.modThree(new int[]{1, 2, 1, 2, 1}))
            .isFalse();
        assertThat(modThree.modThree(new int[]{9, 9, 9}))
            .isTrue();
        assertThat(modThree.modThree(new int[]{1, 2, 1}))
            .isFalse();
        assertThat(modThree.modThree(new int[]{1, 2}))
            .isFalse();
        assertThat(modThree.modThree(new int[]{1}))
            .isFalse();
        assertThat(modThree.modThree(new int[]{}))
            .isFalse();
        assertThat(modThree.modThree(new int[]{9, 7, 2, 9}))
            .isFalse();
        assertThat(modThree.modThree(new int[]{9, 7, 2, 9, 2, 2}))
            .isFalse();
        assertThat(modThree.modThree(new int[]{9, 7, 2, 9, 2, 2, 6}))
            .isTrue();
    }

}
