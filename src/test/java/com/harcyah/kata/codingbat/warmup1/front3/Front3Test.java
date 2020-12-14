package com.harcyah.kata.codingbat.warmup1.front3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Front3Test {

    @Test
    public void testFront3() {
        Front3 front3 = new Front3();
        assertEquals("JavJavJav", front3.front3("Java"));
        assertEquals("ChoChoCho", front3.front3("Chocolate"));
        assertEquals("abcabcabc", front3.front3("abc"));
        assertEquals("abcabcabc", front3.front3("abcXYZ"));
        assertEquals("ababab", front3.front3("ab"));
        assertEquals("aaa", front3.front3("a"));
        assertEquals("", front3.front3(""));
    }

}
