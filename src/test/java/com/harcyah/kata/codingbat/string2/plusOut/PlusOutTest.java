package com.harcyah.kata.codingbat.string2.plusOut;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlusOutTest {

    @Test
    public void testPlusOut() {
        PlusOut plusOut = new PlusOut();
        assertEquals("++xy++", plusOut.plusOut("12xy34", "xy"));
        assertEquals("1+++++", plusOut.plusOut("12xy34", "1"));
        assertEquals("++xy++xy+++xy", plusOut.plusOut("12xy34xyabcxy", "xy"));
        assertEquals("ab++ab++++", plusOut.plusOut("abXYabcXYZ", "ab"));
        assertEquals("++++abc+++", plusOut.plusOut("abXYabcXYZ", "abc"));
        assertEquals("++XY+++XY+", plusOut.plusOut("abXYabcXYZ", "XY"));
        assertEquals("+++++++XYZ", plusOut.plusOut("abXYxyzXYZ", "XYZ"));
        assertEquals("++++++", plusOut.plusOut("--++ab", "++"));
        assertEquals("++xxxx++", plusOut.plusOut("aaxxxxbb", "xx"));
        assertEquals("++3++3", plusOut.plusOut("123123", "3"));
    }

}
