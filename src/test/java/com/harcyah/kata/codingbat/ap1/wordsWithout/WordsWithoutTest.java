package com.harcyah.kata.codingbat.ap1.wordsWithout;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WordsWithoutTest {

    @Test
    public void testWordsWithout() {
        WordsWithout wordsWithout = new WordsWithout();
        assertThat(wordsWithout.wordsWithout(new String[]{"a", "b", "c", "a"}, "a"))
            .isEqualTo(new String[]{"b", "c"});
        assertThat(wordsWithout.wordsWithout(new String[]{"a", "b", "c", "a"}, "b"))
            .isEqualTo(new String[]{"a", "c", "a"});
        assertThat(wordsWithout.wordsWithout(new String[]{"a", "b", "c", "a"}, "c"))
            .isEqualTo(new String[]{"a", "b", "a"});
        assertThat(wordsWithout.wordsWithout(new String[]{"b", "c", "a", "a"}, "b"))
            .isEqualTo(new String[]{"c", "a", "a"});
        assertThat(wordsWithout.wordsWithout(new String[]{"xx", "yyy", "x", "yy", "x"}, "x"))
            .isEqualTo(new String[]{"xx", "yyy", "yy"});
        assertThat(wordsWithout.wordsWithout(new String[]{"xx", "yyy", "x", "yy", "x"}, "yy"))
            .isEqualTo(new String[]{"xx", "yyy", "x", "x"});
        assertThat(wordsWithout.wordsWithout(new String[]{"aa", "ab", "ac", "aa"}, "aa"))
            .isEqualTo(new String[]{"ab", "ac"});
    }

}
