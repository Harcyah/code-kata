package com.harcyah.kata.codingbat.ap1.wordsWithoutList;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordsWithoutListTest {

    @Test
    public void testWordsWithoutList() {
        WordsWithoutList wordsWithoutList = new WordsWithoutList();
        assertEquals(List.of("bb", "ccc"), wordsWithoutList.wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 1));
        assertEquals(List.of("a", "bb", "b"), wordsWithoutList.wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 3));
        assertEquals(List.of("a", "bb", "b", "ccc"), wordsWithoutList.wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 4));
        assertEquals(List.of("xx", "yyy", "yy"), wordsWithoutList.wordsWithoutList(new String[]{"xx", "yyy", "x", "yy", "z"}, 1));
        assertEquals(List.of("yyy", "x", "z"), wordsWithoutList.wordsWithoutList(new String[]{"xx", "yyy", "x", "yy", "z"}, 2));
    }

}
