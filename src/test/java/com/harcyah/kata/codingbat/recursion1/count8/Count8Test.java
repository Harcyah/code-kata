package com.harcyah.kata.codingbat.recursion1.count8;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Count8Test {

    @Test
    public void testCount8() {
        Count8 count8 = new Count8();
        assertThat(count8.count8(8))
            .isEqualTo(1);
        assertThat(count8.count8(818))
            .isEqualTo(2);
        assertThat(count8.count8(8818))
            .isEqualTo(4);
        assertThat(count8.count8(8088))
            .isEqualTo(4);
        assertThat(count8.count8(123))
            .isEqualTo(0);
        assertThat(count8.count8(81238))
            .isEqualTo(2);
        assertThat(count8.count8(88788))
            .isEqualTo(6);
        assertThat(count8.count8(8234))
            .isEqualTo(1);
        assertThat(count8.count8(2348))
            .isEqualTo(1);
        assertThat(count8.count8(23884))
            .isEqualTo(3);
        assertThat(count8.count8(0))
            .isEqualTo(0);
        assertThat(count8.count8(1818188))
            .isEqualTo(5);
        assertThat(count8.count8(8818181))
            .isEqualTo(5);
        assertThat(count8.count8(1080))
            .isEqualTo(1);
        assertThat(count8.count8(188))
            .isEqualTo(3);
        assertThat(count8.count8(88888))
            .isEqualTo(9);
        assertThat(count8.count8(9898))
            .isEqualTo(2);
        assertThat(count8.count8(78))
            .isEqualTo(1);
    }

}
