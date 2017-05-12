package com.harcyah.kata.codingbat.functional2;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class NoZTest {

    @Test
    public void testNoZ() {
        NoZ noZ = new NoZ();
        assertThat(noZ.noZ(Arrays.asList("aaa", "bbb", "aza"))).containsExactly("aaa", "bbb");
        assertThat(noZ.noZ(Arrays.asList("hziz", "hzello", "hi"))).containsExactly("hi");
        assertThat(noZ.noZ(Arrays.asList("hello", "howz", "are", "youz"))).containsExactly("hello", "are");
        assertThat(noZ.noZ(Arrays.asList())).containsExactly();
        assertThat(noZ.noZ(Arrays.asList(""))).containsExactly("");
        assertThat(noZ.noZ(Arrays.asList("x", "y", "z"))).containsExactly("x", "y");
    }

}
