package com.harcyah.kata.codingbat.map2.wordCount;

import com.harcyah.kata.codingbat.MapBuilder;
import org.junit.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class WordCountTest {

    @Test
    public void testWordCount() {
        WordCount wordCount = new WordCount();
        assertThat(wordCount.wordCount(new String[]{"a", "b", "a", "c", "b"}))
            .isEqualTo(Map.of("b", 2, "c", 1, "a", 2));
        assertThat(wordCount.wordCount(new String[]{"c", "b", "a"}))
            .isEqualTo(Map.of("b", 1, "c", 1, "a", 1));
        assertThat(wordCount.wordCount(new String[]{"c", "c", "c", "c"}))
            .isEqualTo(Map.of("c", 4));
        assertThat(wordCount.wordCount(new String[]{}))
            .isEqualTo(Map.of());
        assertThat(wordCount.wordCount(new String[]{"this", "and", "this", ""}))
            .isEqualTo(Map.of("", 1, "this", 2, "and", 1));
        assertThat(wordCount.wordCount(new String[]{"x", "y", "x", "Y", "X"}))
            .isEqualTo(Map.of("Y", 1, "X", 1, "y", 1, "x", 2));
        assertThat(wordCount.wordCount(new String[]{"123", "0", "123", "1"}))
            .isEqualTo(Map.of("1", 1, "0", 1, "123", 2));
        assertThat(wordCount.wordCount(new String[]{"d", "a", "e", "d", "a", "d", "b", "b", "z", "a", "a", "b", "z", "x", "b", "f", "x", "two", "b", "one", "two"}))
            .isEqualTo(MapBuilder.build("f", 1, "two", 2, "d", 3, "e", 1, "b", 5, "one", 1, "a", 4, "z", 2, "x", 2));
        assertThat(wordCount.wordCount(new String[]{"apple", "banana", "apple", "apple", "tea", "coffee", "banana"}))
            .isEqualTo(Map.of("banana", 2, "apple", 3, "coffee", 1, "tea", 1));
    }

}
