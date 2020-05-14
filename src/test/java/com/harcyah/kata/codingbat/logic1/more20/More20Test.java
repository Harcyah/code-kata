package com.harcyah.kata.codingbat.logic1.more20;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class More20Test {

    @Test
    public void testMore20() {
        More20 more20 = new More20();
        assertThat(more20.more20(20))
            .isFalse();
        assertThat(more20.more20(21))
            .isTrue();
        assertThat(more20.more20(22))
            .isTrue();
        assertThat(more20.more20(23))
            .isFalse();
        assertThat(more20.more20(25))
            .isFalse();
        assertThat(more20.more20(30))
            .isFalse();
        assertThat(more20.more20(31))
            .isFalse();
        assertThat(more20.more20(59))
            .isFalse();
        assertThat(more20.more20(60))
            .isFalse();
        assertThat(more20.more20(61))
            .isTrue();
        assertThat(more20.more20(62))
            .isTrue();
        assertThat(more20.more20(1020))
            .isFalse();
        assertThat(more20.more20(1021))
            .isTrue();
        assertThat(more20.more20(1000))
            .isFalse();
        assertThat(more20.more20(1001))
            .isTrue();
        assertThat(more20.more20(50))
            .isFalse();
        assertThat(more20.more20(55))
            .isFalse();
        assertThat(more20.more20(40))
            .isFalse();
        assertThat(more20.more20(41))
            .isTrue();
        assertThat(more20.more20(39))
            .isFalse();
        assertThat(more20.more20(42))
            .isTrue();
    }

}
