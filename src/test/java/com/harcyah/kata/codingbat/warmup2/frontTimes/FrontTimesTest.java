package com.harcyah.kata.codingbat.warmup2.frontTimes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrontTimesTest {

    @Test
    public void testFrontTimes() {
        FrontTimes frontTimes = new FrontTimes();
        assertEquals("ChoCho", frontTimes.frontTimes("Chocolate", 2));
        assertEquals("ChoChoCho", frontTimes.frontTimes("Chocolate", 3));
        assertEquals("AbcAbcAbc", frontTimes.frontTimes("Abc", 3));
        assertEquals("AbAbAbAb", frontTimes.frontTimes("Ab", 4));
        assertEquals("AAAA", frontTimes.frontTimes("A", 4));
        assertEquals("", frontTimes.frontTimes("", 4));
        assertEquals("", frontTimes.frontTimes("Abc", 0));
    }

}
