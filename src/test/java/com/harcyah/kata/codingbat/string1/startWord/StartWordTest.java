package com.harcyah.kata.codingbat.string1.startWord;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StartWordTest {

    @Test
    public void testStartWord() {
        StartWord startWord = new StartWord();
        assertEquals("hi", startWord.startWord("hippo", "hi"));
        assertEquals("hip", startWord.startWord("hippo", "xip"));
        assertEquals("h", startWord.startWord("hippo", "i"));
        assertEquals("", startWord.startWord("hippo", "ix"));
        assertEquals("", startWord.startWord("h", "ix"));
        assertEquals("", startWord.startWord("", "i"));
        assertEquals("hi", startWord.startWord("hip", "zi"));
        assertEquals("hip", startWord.startWord("hip", "zip"));
        assertEquals("", startWord.startWord("hip", "zig"));
        assertEquals("h", startWord.startWord("h", "z"));
        assertEquals("hippo", startWord.startWord("hippo", "xippo"));
        assertEquals("", startWord.startWord("hippo", "xyz"));
        assertEquals("hip", startWord.startWord("hippo", "hip"));
        assertEquals("kit", startWord.startWord("kitten", "cit"));
        assertEquals("kit", startWord.startWord("kit", "cit"));
    }

}
