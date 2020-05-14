package com.harcyah.kata.codingbat.string1.middleTwo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MiddleTwoTest {

    @Test
    public void testMiddleTwo() {
        MiddleTwo middleTwo = new MiddleTwo();
        assertEquals("ri", middleTwo.middleTwo("string"));
        assertEquals("od", middleTwo.middleTwo("code"));
        assertEquals("ct", middleTwo.middleTwo("Practice"));
        assertEquals("ab", middleTwo.middleTwo("ab"));
        assertEquals("45", middleTwo.middleTwo("0123456789"));
    }

}
