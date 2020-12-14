package com.harcyah.kata.codingbat.warmup1.notString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NotStringTest {

    @Test
    public void testNotString() {
        NotString notString = new NotString();
        assertEquals("not candy", notString.notString("candy"));
        assertEquals("not x", notString.notString("x"));
        assertEquals("not bad", notString.notString("not bad"));
        assertEquals("not bad", notString.notString("bad"));
        assertEquals("not", notString.notString("not"));
        assertEquals("not is not", notString.notString("is not"));
        assertEquals("not no", notString.notString("no"));
    }

}
