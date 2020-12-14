package com.harcyah.kata.codingbat.warmup2.stringTimes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringTimesTest {

    @Test
    public void testStringTimes() {
        StringTimes stringTimes = new StringTimes();
        assertEquals("HiHi", stringTimes.stringTimes("Hi", 2));
        assertEquals("HiHiHi", stringTimes.stringTimes("Hi", 3));
        assertEquals("Hi", stringTimes.stringTimes("Hi", 1));
        assertEquals("", stringTimes.stringTimes("Hi", 0));
        assertEquals("HiHiHiHiHi", stringTimes.stringTimes("Hi", 5));
        assertEquals("Oh Boy!Oh Boy!", stringTimes.stringTimes("Oh Boy!", 2));
        assertEquals("xxxx", stringTimes.stringTimes("x", 4));
        assertEquals("", stringTimes.stringTimes("", 4));
        assertEquals("codecode", stringTimes.stringTimes("code", 2));
        assertEquals("codecodecode", stringTimes.stringTimes("code", 3));
    }

}
