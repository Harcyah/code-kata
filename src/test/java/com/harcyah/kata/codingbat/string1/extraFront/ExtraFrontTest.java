package com.harcyah.kata.codingbat.string1.extraFront;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtraFrontTest {

    @Test
    public void testExtraFront() {
        ExtraFront extraFront = new ExtraFront();
        assertEquals("HeHeHe", extraFront.extraFront("Hello"));
        assertEquals("ababab", extraFront.extraFront("ab"));
        assertEquals("HHH", extraFront.extraFront("H"));
        assertEquals("", extraFront.extraFront(""));
        assertEquals("CaCaCa", extraFront.extraFront("Candy"));
        assertEquals("CoCoCo", extraFront.extraFront("Code"));
    }

}
