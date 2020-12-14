package com.harcyah.kata.codingbat.array2.isEverywhere;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IsEverywhereTest {

    @Test
    public void testIsEverywhere() {
        IsEverywhere isEverywhere = new IsEverywhere();
        assertThat(isEverywhere.isEverywhere(new int[]{1, 2, 1, 3}, 1))
            .isTrue();
        assertThat(isEverywhere.isEverywhere(new int[]{1, 2, 1, 3}, 2))
            .isFalse();
        assertThat(isEverywhere.isEverywhere(new int[]{1, 2, 1, 3, 4}, 1))
            .isFalse();
        assertThat(isEverywhere.isEverywhere(new int[]{2, 1, 2, 1}, 1))
            .isTrue();
        assertThat(isEverywhere.isEverywhere(new int[]{2, 1, 2, 1}, 2))
            .isTrue();
        assertThat(isEverywhere.isEverywhere(new int[]{2, 1, 2, 3, 1}, 2))
            .isFalse();
        assertThat(isEverywhere.isEverywhere(new int[]{3, 1}, 3))
            .isTrue();
        assertThat(isEverywhere.isEverywhere(new int[]{3, 1}, 2))
            .isFalse();
        assertThat(isEverywhere.isEverywhere(new int[]{3}, 1))
            .isTrue();
        assertThat(isEverywhere.isEverywhere(new int[]{}, 1))
            .isTrue();
        assertThat(isEverywhere.isEverywhere(new int[]{1, 2, 1, 2, 3, 2, 5}, 2))
            .isTrue();
        assertThat(isEverywhere.isEverywhere(new int[]{1, 2, 1, 1, 1, 2}, 2))
            .isFalse();
        assertThat(isEverywhere.isEverywhere(new int[]{2, 1, 2, 1, 1, 2}, 2))
            .isFalse();
        assertThat(isEverywhere.isEverywhere(new int[]{2, 1, 2, 2, 2, 1, 1, 2}, 2))
            .isFalse();
        assertThat(isEverywhere.isEverywhere(new int[]{2, 1, 2, 2, 2, 1, 2, 1}, 2))
            .isTrue();
        assertThat(isEverywhere.isEverywhere(new int[]{2, 1, 2, 1, 2}, 2))
            .isTrue();
    }

}
