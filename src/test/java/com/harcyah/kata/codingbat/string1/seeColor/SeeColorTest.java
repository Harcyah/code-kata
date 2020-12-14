package com.harcyah.kata.codingbat.string1.seeColor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeeColorTest {

    @Test
    public void testSeeColor() {
        SeeColor seeColor = new SeeColor();
        assertEquals("red", seeColor.seeColor("redxx"));
        assertEquals("", seeColor.seeColor("xxred"));
        assertEquals("blue", seeColor.seeColor("blueTimes"));
        assertEquals("", seeColor.seeColor("NoColor"));
        assertEquals("red", seeColor.seeColor("red"));
        assertEquals("", seeColor.seeColor("re"));
        assertEquals("", seeColor.seeColor("blu"));
        assertEquals("blue", seeColor.seeColor("blue"));
        assertEquals("", seeColor.seeColor("a"));
        assertEquals("", seeColor.seeColor(""));
        assertEquals("", seeColor.seeColor("xyzred"));
    }

}
