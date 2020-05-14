package com.harcyah.kata.pape;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramsTest {

    @Test
    public void testAnagrams() {
        Anagrams anagrams = new Anagrams();
        assertFalse(anagrams.isAnagram("Foo", "Bar"));
        assertTrue(anagrams.isAnagram("Desperation", "A Rope Ends It"));
        assertTrue(anagrams.isAnagram("Clint Eastwood", "Old West Action"));
    }

}
