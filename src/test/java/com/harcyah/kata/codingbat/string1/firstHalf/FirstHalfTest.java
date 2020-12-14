package com.harcyah.kata.codingbat.string1.firstHalf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstHalfTest {

    @Test
    public void testFirstHalf() {
        FirstHalf firstHalf = new FirstHalf();
        assertEquals("Woo", firstHalf.firstHalf("WooHoo"));
        assertEquals("Hello", firstHalf.firstHalf("HelloThere"));
        assertEquals("abc", firstHalf.firstHalf("abcdef"));
        assertEquals("a", firstHalf.firstHalf("ab"));
        assertEquals("", firstHalf.firstHalf(""));
        assertEquals("01234", firstHalf.firstHalf("0123456789"));
        assertEquals("kit", firstHalf.firstHalf("kitten"));
    }

}
