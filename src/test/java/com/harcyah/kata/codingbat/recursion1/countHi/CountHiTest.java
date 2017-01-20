package com.harcyah.kata.codingbat.recursion1.countHi;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CountHiTest {

    @Test
    public void testCountHi() {
        CountHi countHi = new CountHi();
        Assertions.assertThat(countHi.countHi("xxhixx")).isEqualTo(1);
        Assertions.assertThat(countHi.countHi("xhixhix")).isEqualTo(2);
        Assertions.assertThat(countHi.countHi("hi")).isEqualTo(1);
        Assertions.assertThat(countHi.countHi("hihih")).isEqualTo(2);
        Assertions.assertThat(countHi.countHi("h")).isEqualTo(0);
        Assertions.assertThat(countHi.countHi("")).isEqualTo(0);
        Assertions.assertThat(countHi.countHi("ihihihihih")).isEqualTo(4);
        Assertions.assertThat(countHi.countHi("ihihihihihi")).isEqualTo(5);
        Assertions.assertThat(countHi.countHi("hiAAhi12hi")).isEqualTo(3);
        Assertions.assertThat(countHi.countHi("xhixhxihihhhih")).isEqualTo(3);
        Assertions.assertThat(countHi.countHi("ship")).isEqualTo(1);
    }

}
