package com.harcyah.kata.codingbat.logic1.nearTen;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NearTenTest {

    @Test
    public void testNearTen() {
        NearTen nearTen = new NearTen();
        assertThat(nearTen.nearTen(12))
            .isTrue();
        assertThat(nearTen.nearTen(17))
            .isFalse();
        assertThat(nearTen.nearTen(19))
            .isTrue();
        assertThat(nearTen.nearTen(31))
            .isTrue();
        assertThat(nearTen.nearTen(6))
            .isFalse();
        assertThat(nearTen.nearTen(10))
            .isTrue();
        assertThat(nearTen.nearTen(11))
            .isTrue();
        assertThat(nearTen.nearTen(21))
            .isTrue();
        assertThat(nearTen.nearTen(22))
            .isTrue();
        assertThat(nearTen.nearTen(23))
            .isFalse();
        assertThat(nearTen.nearTen(54))
            .isFalse();
        assertThat(nearTen.nearTen(155))
            .isFalse();
        assertThat(nearTen.nearTen(158))
            .isTrue();
        assertThat(nearTen.nearTen(3))
            .isFalse();
        assertThat(nearTen.nearTen(1))
            .isTrue();
    }

}
