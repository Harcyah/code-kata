package com.harcyah.kata.codingbat.recursion1.countPairs;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CountPairsTest {

    @Test
    public void testCountPairs() {
        CountPairs countPairs = new CountPairs();
        Assertions.assertThat(countPairs.countPairs("axa")).isEqualTo(1);
        Assertions.assertThat(countPairs.countPairs("axax")).isEqualTo(2);
        Assertions.assertThat(countPairs.countPairs("axbx")).isEqualTo(1);
        Assertions.assertThat(countPairs.countPairs("hi")).isEqualTo(0);
        Assertions.assertThat(countPairs.countPairs("hihih")).isEqualTo(3);
        Assertions.assertThat(countPairs.countPairs("ihihhh")).isEqualTo(3);
        Assertions.assertThat(countPairs.countPairs("ihjxhh")).isEqualTo(0);
        Assertions.assertThat(countPairs.countPairs("")).isEqualTo(0);
        Assertions.assertThat(countPairs.countPairs("a")).isEqualTo(0);
        Assertions.assertThat(countPairs.countPairs("aa")).isEqualTo(0);
        Assertions.assertThat(countPairs.countPairs("aaa")).isEqualTo(1);
    }

}
