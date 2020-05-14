package com.harcyah.kata.codingbat.recursion1.countHi2;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountHi2Test {

    @Test
    public void testCountHi2() {
        CountHi2 countHi2 = new CountHi2();
        assertThat(countHi2.countHi2("ahixhi")).isEqualTo(1);
        assertThat(countHi2.countHi2("ahibhi")).isEqualTo(2);
        assertThat(countHi2.countHi2("xhixhi")).isEqualTo(0);
        assertThat(countHi2.countHi2("hixhi")).isEqualTo(1);
        assertThat(countHi2.countHi2("hixhhi")).isEqualTo(2);
        assertThat(countHi2.countHi2("hihihi")).isEqualTo(3);
        assertThat(countHi2.countHi2("hihihix")).isEqualTo(3);
        assertThat(countHi2.countHi2("xhihihix")).isEqualTo(2);
        assertThat(countHi2.countHi2("xxhi")).isEqualTo(0);
        assertThat(countHi2.countHi2("hixxhi")).isEqualTo(1);
        assertThat(countHi2.countHi2("hi")).isEqualTo(1);
        assertThat(countHi2.countHi2("xxxx")).isEqualTo(0);
        assertThat(countHi2.countHi2("h")).isEqualTo(0);
        assertThat(countHi2.countHi2("x")).isEqualTo(0);
        assertThat(countHi2.countHi2("")).isEqualTo(0);
        assertThat(countHi2.countHi2("Hellohi")).isEqualTo(1);
    }

}
