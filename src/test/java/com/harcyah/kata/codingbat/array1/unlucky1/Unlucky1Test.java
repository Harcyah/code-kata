package com.harcyah.kata.codingbat.array1.unlucky1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Unlucky1Test {

    @Test
    public void testUnlucky1() {
        Unlucky1 unlucky1 = new Unlucky1();
        assertThat(unlucky1.unlucky1(new int[]{1, 3, 4, 5})).isTrue();
        assertThat(unlucky1.unlucky1(new int[]{2, 1, 3, 4, 5})).isTrue();
        assertThat(unlucky1.unlucky1(new int[]{1, 1, 1})).isFalse();
        assertThat(unlucky1.unlucky1(new int[]{1, 3, 1})).isTrue();
        assertThat(unlucky1.unlucky1(new int[]{1, 1, 3})).isTrue();
        assertThat(unlucky1.unlucky1(new int[]{1, 2, 3})).isFalse();
        assertThat(unlucky1.unlucky1(new int[]{3, 3, 3})).isFalse();
        assertThat(unlucky1.unlucky1(new int[]{1, 3})).isTrue();
        assertThat(unlucky1.unlucky1(new int[]{1, 4})).isFalse();
        assertThat(unlucky1.unlucky1(new int[]{1})).isFalse();
        assertThat(unlucky1.unlucky1(new int[]{})).isFalse();
        assertThat(unlucky1.unlucky1(new int[]{1, 1, 1, 3, 1})).isFalse();
        assertThat(unlucky1.unlucky1(new int[]{1, 1, 3, 1, 1})).isTrue();
        assertThat(unlucky1.unlucky1(new int[]{1, 1, 1, 1, 3})).isTrue();
        assertThat(unlucky1.unlucky1(new int[]{1, 4, 1, 5})).isFalse();
        assertThat(unlucky1.unlucky1(new int[]{1, 1, 2, 3})).isFalse();
        assertThat(unlucky1.unlucky1(new int[]{2, 3, 2, 1})).isFalse();
        assertThat(unlucky1.unlucky1(new int[]{2, 3, 1, 3})).isTrue();
        assertThat(unlucky1.unlucky1(new int[]{1, 2, 3, 4, 1, 3})).isTrue();
    }

}
