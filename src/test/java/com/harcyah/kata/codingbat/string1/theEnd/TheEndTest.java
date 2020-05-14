package com.harcyah.kata.codingbat.string1.theEnd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TheEndTest {

    @Test
    public void testTheEnd() {
        TheEnd theEnd = new TheEnd();
        assertEquals("H", theEnd.theEnd("Hello", true));
        assertEquals("o", theEnd.theEnd("Hello", false));
        assertEquals("o", theEnd.theEnd("oh", true));
        assertEquals("h", theEnd.theEnd("oh", false));
        assertEquals("x", theEnd.theEnd("x", true));
        assertEquals("x", theEnd.theEnd("x", false));
        assertEquals("j", theEnd.theEnd("java", true));
        assertEquals("e", theEnd.theEnd("chocolate", false));
        assertEquals("1", theEnd.theEnd("1234", true));
        assertEquals("e", theEnd.theEnd("code", false));
    }

}
