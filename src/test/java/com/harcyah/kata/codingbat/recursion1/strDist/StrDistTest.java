package com.harcyah.kata.codingbat.recursion1.strDist;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StrDistTest {

    @Test
    public void testStrDist() {
        StrDist strDist = new StrDist();
        assertThat(strDist.strDist("catcowcat", "cat")).isEqualTo(9);
        assertThat(strDist.strDist("catcowcat", "cow")).isEqualTo(3);
        assertThat(strDist.strDist("cccatcowcatxx", "cat")).isEqualTo(9);
        assertThat(strDist.strDist("abccatcowcatcatxyz", "cat")).isEqualTo(12);
        assertThat(strDist.strDist("xyx", "x")).isEqualTo(3);
        assertThat(strDist.strDist("xyx", "y")).isEqualTo(1);
        assertThat(strDist.strDist("xyx", "z")).isEqualTo(0);
        assertThat(strDist.strDist("z", "z")).isEqualTo(1);
        assertThat(strDist.strDist("x", "z")).isEqualTo(0);
        assertThat(strDist.strDist("", "z")).isEqualTo(0);
        assertThat(strDist.strDist("hiHellohihihi", "hi")).isEqualTo(13);
        assertThat(strDist.strDist("hiHellohihihi", "hih")).isEqualTo(5);
        assertThat(strDist.strDist("hiHellohihihi", "o")).isEqualTo(1);
        assertThat(strDist.strDist("hiHellohihihi", "ll")).isEqualTo(2);
    }

}
