package com.harcyah.kata.codingbat.array1.firstLast6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstLast6Test {

    @Test
    public void testFirstLast6() {
        FirstLast6 firstLast6 = new FirstLast6();
        assertThat(firstLast6.firstLast6(new int[]{1, 2, 6}))
            .isTrue();
        assertThat(firstLast6.firstLast6(new int[]{6, 1, 2, 3}))
            .isTrue();
        assertThat(firstLast6.firstLast6(new int[]{13, 6, 1, 2, 3}))
            .isFalse();
        assertThat(firstLast6.firstLast6(new int[]{13, 6, 1, 2, 6}))
            .isTrue();
        assertThat(firstLast6.firstLast6(new int[]{3, 2, 1}))
            .isFalse();
        assertThat(firstLast6.firstLast6(new int[]{3, 6, 1}))
            .isFalse();
        assertThat(firstLast6.firstLast6(new int[]{3, 6}))
            .isTrue();
        assertThat(firstLast6.firstLast6(new int[]{6}))
            .isTrue();
        assertThat(firstLast6.firstLast6(new int[]{3}))
            .isFalse();
        assertThat(firstLast6.firstLast6(new int[]{5, 6}))
            .isTrue();
        assertThat(firstLast6.firstLast6(new int[]{5, 5}))
            .isFalse();
        assertThat(firstLast6.firstLast6(new int[]{1, 2, 3, 4, 6}))
            .isTrue();
        assertThat(firstLast6.firstLast6(new int[]{1, 2, 3, 4}))
            .isFalse();
    }

}
