package com.harcyah.kata.codingbat.warmup2.stringBits;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringBitsTest {

    @Test
    public void testStringBits() {
        StringBits stringBits = new StringBits();
        assertEquals("Hlo", stringBits.stringBits("Hello"));
        assertEquals("H", stringBits.stringBits("Hi"));
        assertEquals("Hello", stringBits.stringBits("Heeololeo"));
        assertEquals("HHH", stringBits.stringBits("HiHiHi"));
        assertEquals("", stringBits.stringBits(""));
        assertEquals("Getns", stringBits.stringBits("Greetings"));
        assertEquals("Coot", stringBits.stringBits("Chocoate"));
        assertEquals("p", stringBits.stringBits("pi"));
        assertEquals("HloKte", stringBits.stringBits("Hello Kitten"));
        assertEquals("happy", stringBits.stringBits("hxaxpxpxy"));
    }

}
