package com.harcyah.kata.reddit.easy_2015_01_12;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsbnValidatorTest {

    @Test
    public void testValidatorSuccess() {
        IsbnValidator isbn = new IsbnValidator();
        assertTrue(isbn.isValid("1-84356-028-3"));
        assertTrue(isbn.isValid("0-684-84328-5"));
        assertTrue(isbn.isValid("0-8044-2957-X"));
        assertTrue(isbn.isValid("0-85131-041-9"));
        assertTrue(isbn.isValid("0-943396-04-2"));
        assertTrue(isbn.isValid("0-9752298-0-X"));
    }

    @Test
    public void testValidatorFailure() {
        IsbnValidator isbn = new IsbnValidator();
        assertFalse(isbn.isValid("2-84356-028-3"));
        assertFalse(isbn.isValid("0-784-84328-5"));
        assertFalse(isbn.isValid("0-9044-2957-X"));
        assertFalse(isbn.isValid("0-95131-041-9"));
        assertFalse(isbn.isValid("0-443396-04-2"));
        assertFalse(isbn.isValid("0-7752298-0-X"));
    }

}
