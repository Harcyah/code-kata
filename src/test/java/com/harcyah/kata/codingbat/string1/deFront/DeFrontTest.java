package com.harcyah.kata.codingbat.string1.deFront;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeFrontTest {

    @Test
    public void testDeFront() {
        DeFront deFront = new DeFront();
        assertEquals("llo", deFront.deFront("Hello"));
        assertEquals("va", deFront.deFront("java"));
        assertEquals("aay", deFront.deFront("away"));
        assertEquals("ay", deFront.deFront("axy"));
        assertEquals("abc", deFront.deFront("abc"));
        assertEquals("by", deFront.deFront("xby"));
        assertEquals("ab", deFront.deFront("ab"));
        assertEquals("a", deFront.deFront("ax"));
        assertEquals("ab", deFront.deFront("axb"));
        assertEquals("aa", deFront.deFront("aaa"));
        assertEquals("bc", deFront.deFront("xbc"));
        assertEquals("bb", deFront.deFront("bbb"));
        assertEquals("zz", deFront.deFront("bazz"));
        assertEquals("", deFront.deFront("ba"));
        assertEquals("abxyz", deFront.deFront("abxyz"));
        assertEquals("", deFront.deFront("hi"));
        assertEquals("s", deFront.deFront("his"));
        assertEquals("", deFront.deFront("xz"));
        assertEquals("z", deFront.deFront("zzz"));
    }

}
