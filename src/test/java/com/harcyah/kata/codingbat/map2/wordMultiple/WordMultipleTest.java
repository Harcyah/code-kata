package com.harcyah.kata.codingbat.map2.wordMultiple;

import com.harcyah.kata.codingbat.MapBuilder;
import org.junit.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class WordMultipleTest {

    @Test
    public void testWordMultiple() {
        WordMultiple wordMultiple = new WordMultiple();
        assertThat(wordMultiple.wordMultiple(new String[] { "a", "b", "a", "c", "b" }))
            .isEqualTo(Map.of("b", true, "c", false, "a", true));
        assertThat(wordMultiple.wordMultiple(new String[] { "c", "b", "a" }))
            .isEqualTo(Map.of("b", false, "c", false, "a", false));
        assertThat(wordMultiple.wordMultiple(new String[] { "c", "c", "c", "c" }))
            .isEqualTo(Map.of("c", true));
        assertThat(wordMultiple.wordMultiple(new String[] {}))
            .isEqualTo(Map.of());
        assertThat(wordMultiple.wordMultiple(new String[] { "this", "and", "this" }))
            .isEqualTo(Map.of("this", true, "and", false));
        assertThat(wordMultiple.wordMultiple(new String[] { "d", "a", "e", "d", "a", "d", "b", "b", "z", "a", "a", "b", "z", "x" }))
            .isEqualTo(MapBuilder.build("d", true, "e", false, "b", true, "a", true, "z", true, "x", false));
    }

}
