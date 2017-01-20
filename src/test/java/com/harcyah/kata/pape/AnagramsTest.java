package com.harcyah.kata.pape;

import org.junit.Assert;
import org.junit.Test;

public class AnagramsTest {

    @Test
    public void testAnagrams() {
        Anagrams anagrams = new Anagrams();
        Assert.assertFalse(anagrams.isAnagram("Foo", "Bar"));
        Assert.assertTrue(anagrams.isAnagram("Desperation", "A Rope Ends It"));
        Assert.assertTrue(anagrams.isAnagram("Clint Eastwood", "Old West Action"));
    }

}
