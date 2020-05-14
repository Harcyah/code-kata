package com.harcyah.kata.codingbat.string1.conCat;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConCatTest {

    @Test
    public void testConCat() {
        ConCat conCat = new ConCat();
        assertEquals("abcat", conCat.conCat("abc", "cat"));
        assertEquals("dogcat", conCat.conCat("dog", "cat"));
        assertEquals("abc", conCat.conCat("abc", ""));
        assertEquals("cat", conCat.conCat("", "cat"));
        assertEquals("pig", conCat.conCat("pig", "g"));
        assertEquals("pigdoggy", conCat.conCat("pig", "doggy"));
    }

}
