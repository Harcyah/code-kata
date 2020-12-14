package com.harcyah.kata.codingbat.string3.sameEnds;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SameEndsTest {

    @Test
    public void testSameEnds() {
        SameEnds sameEnds = new SameEnds();
        assertThat(sameEnds.sameEnds("abXYab")).isEqualTo("ab");
        assertThat(sameEnds.sameEnds("xx")).isEqualTo("x");
        assertThat(sameEnds.sameEnds("xxx")).isEqualTo("x");
        assertThat(sameEnds.sameEnds("xxxx")).isEqualTo("xx");
        assertThat(sameEnds.sameEnds("javaXYZjava")).isEqualTo("java");
        assertThat(sameEnds.sameEnds("javajava")).isEqualTo("java");
        assertThat(sameEnds.sameEnds("xavaXYZjava")).isEqualTo("");
        assertThat(sameEnds.sameEnds("Hello! and Hello!")).isEqualTo("Hello!");
        assertThat(sameEnds.sameEnds("x")).isEqualTo("");
        assertThat(sameEnds.sameEnds("")).isEqualTo("");
        assertThat(sameEnds.sameEnds("abcb")).isEqualTo("");
        assertThat(sameEnds.sameEnds("mymmy")).isEqualTo("my");
    }

}
