package com.harcyah.kata.codingbat.map2.word0;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class Word0Test {

    @Test
    public void testWord0() {
        Word0 word0 = new Word0();
        assertThat(word0.word0(new String[] { "a", "b", "a", "b" })).isEqualTo(Map.of("b", 0, "a", 0));
        assertThat(word0.word0(new String[] { "a", "b", "a", "c", "b" })).isEqualTo(Map.of("b", 0, "c", 0, "a", 0));
        assertThat(word0.word0(new String[] { "c", "b", "a" })).isEqualTo(Map.of("b", 0, "c", 0, "a", 0));
        assertThat(word0.word0(new String[] { "c", "c", "c", "c" })).isEqualTo(Map.of("c", 0));
        assertThat(word0.word0(new String[] {})).isEqualTo(Map.of());
    }

}
