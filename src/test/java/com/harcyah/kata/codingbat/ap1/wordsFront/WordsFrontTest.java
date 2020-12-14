package com.harcyah.kata.codingbat.ap1.wordsFront;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class WordsFrontTest {

    @Test
    public void testWordsFront() {
        WordsFront wordsFront = new WordsFront();
        assertArrayEquals(new String[]{"a"}, wordsFront.wordsFront(new String[]{"a", "b", "c", "d"}, 1));
        assertArrayEquals(new String[]{"a", "b"}, wordsFront.wordsFront(new String[]{"a", "b", "c", "d"}, 2));
        assertArrayEquals(new String[]{"a", "b", "c"}, wordsFront.wordsFront(new String[]{"a", "b", "c", "d"}, 3));
        assertArrayEquals(new String[]{"a", "b", "c", "d"}, wordsFront.wordsFront(new String[]{"a", "b", "c", "d"}, 4));
        assertArrayEquals(new String[]{"Hi"}, wordsFront.wordsFront(new String[]{"Hi", "There"}, 1));
        assertArrayEquals(new String[]{"Hi", "There"}, wordsFront.wordsFront(new String[]{"Hi", "There"}, 2));
    }

}
