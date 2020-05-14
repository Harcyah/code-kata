package com.harcyah.kata.codingbat.recursion1.countPairs;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountPairsTest {

    @Test
    public void testCountPairs() {
        CountPairs countPairs = new CountPairs();
        assertThat(countPairs.countPairs("axa")).isEqualTo(1);
        assertThat(countPairs.countPairs("axax")).isEqualTo(2);
        assertThat(countPairs.countPairs("axbx")).isEqualTo(1);
        assertThat(countPairs.countPairs("hi")).isEqualTo(0);
        assertThat(countPairs.countPairs("hihih")).isEqualTo(3);
        assertThat(countPairs.countPairs("ihihhh")).isEqualTo(3);
        assertThat(countPairs.countPairs("ihjxhh")).isEqualTo(0);
        assertThat(countPairs.countPairs("")).isEqualTo(0);
        assertThat(countPairs.countPairs("a")).isEqualTo(0);
        assertThat(countPairs.countPairs("aa")).isEqualTo(0);
        assertThat(countPairs.countPairs("aaa")).isEqualTo(1);
    }

}
