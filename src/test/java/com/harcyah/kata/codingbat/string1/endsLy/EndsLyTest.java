package com.harcyah.kata.codingbat.string1.endsLy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EndsLyTest {

    @Test
    public void testEndsLy() {
        EndsLy endsLy = new EndsLy();
        assertTrue(endsLy.endsLy("oddly"));
        assertFalse(endsLy.endsLy("y"));
        assertFalse(endsLy.endsLy("oddy"));
        assertFalse(endsLy.endsLy("oddl"));
        assertFalse(endsLy.endsLy("olydd"));
        assertTrue(endsLy.endsLy("ly"));
        assertFalse(endsLy.endsLy(""));
        assertFalse(endsLy.endsLy("falsey"));
        assertTrue(endsLy.endsLy("evenly"));
    }

}
