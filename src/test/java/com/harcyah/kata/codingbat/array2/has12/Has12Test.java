package com.harcyah.kata.codingbat.array2.has12;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Has12Test {

    @Test
    public void testHas12() {
        Has12 has12 = new Has12();
        assertThat(has12.has12(new int[]{1, 3, 2}))
            .isTrue();
        assertThat(has12.has12(new int[]{3, 1, 2}))
            .isTrue();
        assertThat(has12.has12(new int[]{3, 1, 4, 5, 2}))
            .isTrue();
        assertThat(has12.has12(new int[]{3, 1, 4, 5, 6}))
            .isFalse();
        assertThat(has12.has12(new int[]{3, 1, 4, 1, 6, 2}))
            .isTrue();
        assertThat(has12.has12(new int[]{2, 1, 4, 1, 6, 2}))
            .isTrue();
        assertThat(has12.has12(new int[]{2, 1, 4, 1, 6}))
            .isFalse();
        assertThat(has12.has12(new int[]{3, 5, 9}))
            .isFalse();
        assertThat(has12.has12(new int[]{3, 5, 1}))
            .isFalse();
        assertThat(has12.has12(new int[]{3, 2, 1}))
            .isFalse();
        assertThat(has12.has12(new int[]{1, 2}))
            .isTrue();
        assertThat(has12.has12(new int[]{1, 1}))
            .isFalse();
        assertThat(has12.has12(new int[]{1}))
            .isFalse();
        assertThat(has12.has12(new int[]{}))
            .isFalse();
    }

}
