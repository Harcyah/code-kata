package com.harcyah.kata.codingbat.recursion1.endX;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EndXTest {

    @Test
    public void testEndX() {
        EndX endX = new EndX();
        assertThat(endX.endX("xxre")).isEqualTo("rexx");
        assertThat(endX.endX("xxhixx")).isEqualTo("hixxxx");
        assertThat(endX.endX("xhixhix")).isEqualTo("hihixxx");
        assertThat(endX.endX("hiy")).isEqualTo("hiy");
        assertThat(endX.endX("h")).isEqualTo("h");
        assertThat(endX.endX("x")).isEqualTo("x");
        assertThat(endX.endX("xx")).isEqualTo("xx");
        assertThat(endX.endX("")).isEqualTo("");
        assertThat(endX.endX("bxx")).isEqualTo("bxx");
        assertThat(endX.endX("bxax")).isEqualTo("baxx");
        assertThat(endX.endX("axaxax")).isEqualTo("aaaxxx");
        assertThat(endX.endX("xxhxi")).isEqualTo("hixxx");
    }

}
