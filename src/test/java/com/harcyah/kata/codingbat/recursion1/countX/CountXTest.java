package com.harcyah.kata.codingbat.recursion1.countX;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountXTest {

    @Test
    public void testCountX() {
        CountX countX = new CountX();
        assertThat(countX.countX("xxhixx"))
            .isEqualTo(4);
        assertThat(countX.countX("xhixhix"))
            .isEqualTo(3);
        assertThat(countX.countX("hi"))
            .isEqualTo(0);
        assertThat(countX.countX("h"))
            .isEqualTo(0);
        assertThat(countX.countX("x"))
            .isEqualTo(1);
        assertThat(countX.countX(""))
            .isEqualTo(0);
        assertThat(countX.countX("hihi"))
            .isEqualTo(0);
        assertThat(countX.countX("hiAAhi12hi"))
            .isEqualTo(0);
    }

}
