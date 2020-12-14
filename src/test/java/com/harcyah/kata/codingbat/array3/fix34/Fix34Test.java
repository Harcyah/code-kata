package com.harcyah.kata.codingbat.array3.fix34;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Fix34Test {

    @Test
    public void testFix34() {
        Fix34 fix34 = new Fix34();
        assertThat(fix34.fix34(new int[]{1, 3, 1, 4}))
            .isEqualTo(new int[]{1, 3, 4, 1});
        assertThat(fix34.fix34(new int[]{1, 3, 1, 4, 4, 3, 1}))
            .isEqualTo(new int[]{1, 3, 4, 1, 1, 3, 4});
        assertThat(fix34.fix34(new int[]{3, 2, 2, 4}))
            .isEqualTo(new int[]{3, 4, 2, 2});
        assertThat(fix34.fix34(new int[]{3, 2, 3, 2, 4, 4}))
            .isEqualTo(new int[]{3, 4, 3, 4, 2, 2});
        assertThat(fix34.fix34(new int[]{2, 3, 2, 3, 2, 4, 4}))
            .isEqualTo(new int[]{2, 3, 4, 3, 4, 2, 2});
        assertThat(fix34.fix34(new int[]{3, 1, 4}))
            .isEqualTo(new int[]{3, 4, 1});
        assertThat(fix34.fix34(new int[]{3, 4, 1}))
            .isEqualTo(new int[]{3, 4, 1});
        assertThat(fix34.fix34(new int[]{1, 1, 1}))
            .isEqualTo(new int[]{1, 1, 1});
        assertThat(fix34.fix34(new int[]{1}))
            .isEqualTo(new int[]{1});
        assertThat(fix34.fix34(new int[]{}))
            .isEqualTo(new int[]{});
        assertThat(fix34.fix34(new int[]{7, 3, 7, 7, 4}))
            .isEqualTo(new int[]{7, 3, 4, 7, 7});
        assertThat(fix34.fix34(new int[]{3, 1, 4, 3, 1, 4}))
            .isEqualTo(new int[]{3, 4, 1, 3, 4, 1});
        assertThat(fix34.fix34(new int[]{3, 1, 1, 3, 4, 4}))
            .isEqualTo(new int[]{3, 4, 1, 3, 4, 1});
    }

}
