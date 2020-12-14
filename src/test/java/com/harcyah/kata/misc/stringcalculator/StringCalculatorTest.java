package com.harcyah.kata.misc.stringcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class StringCalculatorTest {

    @Test
    public void testAddEmptyString() throws NegativeNumberException {
        StringCalculator sc = new StringCalculator("");
        assertEquals(0, sc.add());
    }

    @Test
    public void testAddOneDigit() throws NegativeNumberException {
        StringCalculator sc = new StringCalculator("1");
        assertEquals(1, sc.add());
    }

    @Test
    public void testAddTwoDigits() throws NegativeNumberException {
        StringCalculator sc = new StringCalculator("2,3");
        assertEquals(5, sc.add());
    }

    @Test
    public void testAddFiveDigits() throws NegativeNumberException {
        StringCalculator sc = new StringCalculator("1,2,3,4,5");
        assertEquals(15, sc.add());
    }

    @Test
    public void testAddHandlesLineFeedSeparator() throws NegativeNumberException {
        StringCalculator sc = new StringCalculator("1\n2,3");
        assertEquals(6, sc.add());
    }

    @Test
    public void testAddHandlesCustomSeparator() throws NegativeNumberException {
        StringCalculator sc = new StringCalculator("#\n1#2#3#34");
        assertEquals(40, sc.add());
    }

    @Test
    public void testAddCannotHandleNegativeNumbers() {
        try {
            StringCalculator sc = new StringCalculator("-40,5,15,-10,20");
            sc.add();
            fail();
        } catch (NegativeNumberException e) {
            assertEquals("Unable to handle negative numbers: -40,-10", e.getMessage());
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

}
