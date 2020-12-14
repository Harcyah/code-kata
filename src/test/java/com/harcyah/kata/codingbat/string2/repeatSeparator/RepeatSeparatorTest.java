package com.harcyah.kata.codingbat.string2.repeatSeparator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatSeparatorTest {

    @Test
    public void testRepeatSeparator() {
        RepeatSeparator repeatSeparator = new RepeatSeparator();
        assertEquals("WordXWordXWord", repeatSeparator.repeatSeparator("Word", "X", 3));
        assertEquals("ThisAndThis", repeatSeparator.repeatSeparator("This", "And", 2));
        assertEquals("This", repeatSeparator.repeatSeparator("This", "And", 1));
        assertEquals("Hi-n-Hi", repeatSeparator.repeatSeparator("Hi", "-n-", 2));
        assertEquals("AAA", repeatSeparator.repeatSeparator("AAA", "", 1));
        assertEquals("", repeatSeparator.repeatSeparator("AAA", "", 0));
        assertEquals("ABABABABA", repeatSeparator.repeatSeparator("A", "B", 5));
        assertEquals("abcXXabcXXabc", repeatSeparator.repeatSeparator("abc", "XX", 3));
        assertEquals("abcXXabc", repeatSeparator.repeatSeparator("abc", "XX", 2));
        assertEquals("abc", repeatSeparator.repeatSeparator("abc", "XX", 1));
        assertEquals("XYZaXYZ", repeatSeparator.repeatSeparator("XYZ", "a", 2));
    }

}
