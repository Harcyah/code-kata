package com.harcyah.kata.codingbat.string1.twiceN;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwiceNTest {

    @Test
    public void testNTwice() {
        TwiceN sut = new TwiceN();
        assertEquals("Helo", sut.twiceN("Hello", 2));
        assertEquals("Choate", sut.twiceN("Chocolate", 3));
        assertEquals("Ce", sut.twiceN("Chocolate", 1));
        assertEquals("", sut.twiceN("Chocolate", 0));
        assertEquals("Hellello", sut.twiceN("Hello", 4));
        assertEquals("CodeCode", sut.twiceN("Code", 4));
        assertEquals("Code", sut.twiceN("Code", 2));
    }

}
