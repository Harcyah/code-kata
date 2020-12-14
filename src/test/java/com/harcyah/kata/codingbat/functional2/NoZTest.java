package com.harcyah.kata.codingbat.functional2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class NoZTest {

    @Test
    public void testNoZ() {
        NoZ noZ = new NoZ();
        assertThat(noZ.noZ(List.of("aaa", "bbb", "aza")))
            .containsExactly("aaa", "bbb");
        assertThat(noZ.noZ(List.of("hziz", "hzello", "hi")))
            .containsExactly("hi");
        assertThat(noZ.noZ(List.of("hello", "howz", "are", "youz")))
            .containsExactly("hello", "are");
        assertThat(noZ.noZ(List.of()))
            .containsExactly();
        assertThat(noZ.noZ(List.of("")))
            .containsExactly("");
        assertThat(noZ.noZ(List.of("x", "y", "z")))
            .containsExactly("x", "y");
    }

}
