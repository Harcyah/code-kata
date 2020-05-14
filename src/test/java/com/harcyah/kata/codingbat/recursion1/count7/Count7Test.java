package com.harcyah.kata.codingbat.recursion1.count7;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Count7Test {

    @Test
    public void testCount7() {
        Count7 count7 = new Count7();
        assertThat(count7.count7(717))
            .isEqualTo(2);
        assertThat(count7.count7(7))
            .isEqualTo(1);
        assertThat(count7.count7(123))
            .isEqualTo(0);
        assertThat(count7.count7(77))
            .isEqualTo(2);
        assertThat(count7.count7(7123))
            .isEqualTo(1);
        assertThat(count7.count7(771237))
            .isEqualTo(3);
        assertThat(count7.count7(771737))
            .isEqualTo(4);
        assertThat(count7.count7(47571))
            .isEqualTo(2);
        assertThat(count7.count7(777777))
            .isEqualTo(6);
        assertThat(count7.count7(70701277))
            .isEqualTo(4);
        assertThat(count7.count7(777576197))
            .isEqualTo(5);
        assertThat(count7.count7(99999))
            .isEqualTo(0);
        assertThat(count7.count7(99799))
            .isEqualTo(1);
    }

}
