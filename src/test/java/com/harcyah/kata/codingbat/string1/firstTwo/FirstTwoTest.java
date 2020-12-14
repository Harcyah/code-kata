package com.harcyah.kata.codingbat.string1.firstTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstTwoTest {

    @Test
    public void testFirstTwo() {
        FirstTwo firstTwo = new FirstTwo();
        assertEquals("He", firstTwo.firstTwo("Hello"));
        assertEquals("ab", firstTwo.firstTwo("abcdefg"));
        assertEquals("ab", firstTwo.firstTwo("ab"));
        assertEquals("a", firstTwo.firstTwo("a"));
        assertEquals("", firstTwo.firstTwo(""));
        assertEquals("Ki", firstTwo.firstTwo("Kitten"));
        assertEquals("hi", firstTwo.firstTwo("hi"));
        assertEquals("hi", firstTwo.firstTwo("hiya"));
    }

}
