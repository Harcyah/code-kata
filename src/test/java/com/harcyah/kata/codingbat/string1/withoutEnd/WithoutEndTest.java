package com.harcyah.kata.codingbat.string1.withoutEnd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WithoutEndTest {

    @Test
    public void testWithoutEnd() {
        WithoutEnd withoutEnd = new WithoutEnd();
        assertEquals("ell", withoutEnd.withoutEnd("Hello"));
        assertEquals("av", withoutEnd.withoutEnd("java"));
        assertEquals("odin", withoutEnd.withoutEnd("coding"));
        assertEquals("od", withoutEnd.withoutEnd("code"));
        assertEquals("", withoutEnd.withoutEnd("ab"));
        assertEquals("hocolate", withoutEnd.withoutEnd("Chocolate!"));
        assertEquals("itte", withoutEnd.withoutEnd("kitten"));
        assertEquals("ooho", withoutEnd.withoutEnd("woohoo"));
    }

}
