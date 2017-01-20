package com.harcyah.kata.codingbat.recursion1.countX;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CountXTest {

    @Test
    public void testCountX() {
        CountX countX = new CountX();
        Assertions.assertThat(countX.countX("xxhixx")).isEqualTo(4);
        Assertions.assertThat(countX.countX("xhixhix")).isEqualTo(3);
        Assertions.assertThat(countX.countX("hi")).isEqualTo(0);
        Assertions.assertThat(countX.countX("h")).isEqualTo(0);
        Assertions.assertThat(countX.countX("x")).isEqualTo(1);
        Assertions.assertThat(countX.countX("")).isEqualTo(0);
        Assertions.assertThat(countX.countX("hihi")).isEqualTo(0);
        Assertions.assertThat(countX.countX("hiAAhi12hi")).isEqualTo(0);
    }

}
