package com.harcyah.kata.codingbat.string1.middleThree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MiddleThreeTest {

    @Test
    public void testMiddleThree() {
        MiddleThree middleThree = new MiddleThree();
        assertEquals("and", middleThree.middleThree("Candy"));
        assertEquals("and", middleThree.middleThree("and"));
        assertEquals("lvi", middleThree.middleThree("solving"));
        assertEquals("yet", middleThree.middleThree("Hi yet Hi"));
        assertEquals("yet", middleThree.middleThree("java yet java"));
        assertEquals("col", middleThree.middleThree("Chocolate"));
        assertEquals("xyz", middleThree.middleThree("XabcxyzabcX"));
    }

}
