package com.harcyah.kata.misc.fizzbuzz;

import com.harcyah.kata.misc.fizzbuzz.Filter.Filters;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FilterTest {

    @Test
    public void testFilter3() {
        assertEquals("Fizz", Filters.MULT_3.getLabel());
        assertTrue(Filters.MULT_3.matches(3));
        assertTrue(Filters.MULT_3.matches(15));
        assertTrue(Filters.MULT_3.matches(33));
        assertFalse(Filters.MULT_3.matches(4));
        assertFalse(Filters.MULT_3.matches(5));
        assertFalse(Filters.MULT_3.matches(32));
    }

    @Test
    public void testFilter5() {
        assertEquals("Buzz", Filters.MULT_5.getLabel());
        assertTrue(Filters.MULT_5.matches(5));
        assertTrue(Filters.MULT_5.matches(15));
        assertTrue(Filters.MULT_5.matches(50));
        assertFalse(Filters.MULT_5.matches(4));
        assertFalse(Filters.MULT_5.matches(6));
        assertFalse(Filters.MULT_5.matches(32));
    }

    @Test
    public void testFilter35() {
        assertTrue(Filters.MULT_3_5.matches(15));
        assertTrue(Filters.MULT_3_5.matches(30));
        assertTrue(Filters.MULT_3_5.matches(45));
        assertFalse(Filters.MULT_3_5.matches(4));
        assertFalse(Filters.MULT_3_5.matches(6));
        assertFalse(Filters.MULT_3_5.matches(32));
    }

}
