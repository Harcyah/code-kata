package com.harcyah.kata.codingbat.string1.makeOutWord;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakeOutWordTest {

    @Test
    public void testMakeOutWord() {
        MakeOutWord makeOutWord = new MakeOutWord();
        assertEquals("<<Yay>>", makeOutWord.makeOutWord("<<>>", "Yay"));
        assertEquals("<<WooHoo>>", makeOutWord.makeOutWord("<<>>", "WooHoo"));
        assertEquals("[[word]]", makeOutWord.makeOutWord("[[]]", "word"));
        assertEquals("HHHellooo", makeOutWord.makeOutWord("HHoo", "Hello"));
        assertEquals("abYAYyz", makeOutWord.makeOutWord("abyz", "YAY"));
    }

}
