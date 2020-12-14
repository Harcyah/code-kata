package com.harcyah.kata.codingbat.string3.mirrorEnds;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MirrorEndsTest {

    @Test
    public void testMirrorEnds() {
        MirrorEnds mirrorEnds = new MirrorEnds();
        assertThat(mirrorEnds.mirrorEnds("abXYZba")).isEqualTo("ab");
        assertThat(mirrorEnds.mirrorEnds("abca")).isEqualTo("a");
        assertThat(mirrorEnds.mirrorEnds("aba")).isEqualTo("aba");
        assertThat(mirrorEnds.mirrorEnds("abab")).isEqualTo("");
        assertThat(mirrorEnds.mirrorEnds("xxx")).isEqualTo("xxx");
        assertThat(mirrorEnds.mirrorEnds("xxYxx")).isEqualTo("xxYxx");
        assertThat(mirrorEnds.mirrorEnds("Hi and iH")).isEqualTo("Hi ");
        assertThat(mirrorEnds.mirrorEnds("x")).isEqualTo("x");
        assertThat(mirrorEnds.mirrorEnds("")).isEqualTo("");
        assertThat(mirrorEnds.mirrorEnds("123and then 321")).isEqualTo("123");
        assertThat(mirrorEnds.mirrorEnds("band andab")).isEqualTo("ba");
    }

}
