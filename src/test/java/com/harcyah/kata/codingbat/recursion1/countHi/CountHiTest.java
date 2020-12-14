package com.harcyah.kata.codingbat.recursion1.countHi;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountHiTest {

    @Test
    public void testCountHi() {
        CountHi countHi = new CountHi();
        assertThat(countHi.countHi("xxhixx")).isEqualTo(1);
        assertThat(countHi.countHi("xhixhix")).isEqualTo(2);
        assertThat(countHi.countHi("hi")).isEqualTo(1);
        assertThat(countHi.countHi("hihih")).isEqualTo(2);
        assertThat(countHi.countHi("h")).isEqualTo(0);
        assertThat(countHi.countHi("")).isEqualTo(0);
        assertThat(countHi.countHi("ihihihihih")).isEqualTo(4);
        assertThat(countHi.countHi("ihihihihihi")).isEqualTo(5);
        assertThat(countHi.countHi("hiAAhi12hi")).isEqualTo(3);
        assertThat(countHi.countHi("xhixhxihihhhih")).isEqualTo(3);
        assertThat(countHi.countHi("ship")).isEqualTo(1);
    }

}
