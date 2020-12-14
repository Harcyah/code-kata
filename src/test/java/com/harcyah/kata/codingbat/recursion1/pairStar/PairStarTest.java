package com.harcyah.kata.codingbat.recursion1.pairStar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PairStarTest {

    @Test
    public void testPairStar() {
        PairStar pairStar = new PairStar();
        assertThat(pairStar.pairStar("hello")).isEqualTo("hel*lo");
        assertThat(pairStar.pairStar("xxyy")).isEqualTo("x*xy*y");
        assertThat(pairStar.pairStar("aaaa")).isEqualTo("a*a*a*a");
        assertThat(pairStar.pairStar("aaab")).isEqualTo("a*a*ab");
        assertThat(pairStar.pairStar("aa")).isEqualTo("a*a");
        assertThat(pairStar.pairStar("a")).isEqualTo("a");
        assertThat(pairStar.pairStar("")).isEqualTo("");
        assertThat(pairStar.pairStar("noadjacent")).isEqualTo("noadjacent");
        assertThat(pairStar.pairStar("abba")).isEqualTo("ab*ba");
        assertThat(pairStar.pairStar("abbba")).isEqualTo("ab*b*ba");
    }

}
