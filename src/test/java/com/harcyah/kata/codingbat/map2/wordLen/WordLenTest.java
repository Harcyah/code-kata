package com.harcyah.kata.codingbat.map2.wordLen;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class WordLenTest {

    @Test
    public void testWordLen() {
        WordLen wordLen = new WordLen();
        assertThat(wordLen.wordLen(new String[] { "a", "bb", "a", "bb" }))
            .isEqualTo(Map.of("a", 1, "bb", 2));
        assertThat(wordLen.wordLen(new String[] { "this", "and", "that", "and" }))
            .isEqualTo(Map.of("that", 4, "this", 4, "and", 3));
        assertThat(wordLen.wordLen(new String[] { "code", "code", "code", "bug" }))
            .isEqualTo(Map.of("bug", 3, "code", 4));
        assertThat(wordLen.wordLen(new String[] {}))
            .isEqualTo(Map.of());
        assertThat(wordLen.wordLen(new String[] { "z" }))
            .isEqualTo(Map.of("z", 1));
    }

}
