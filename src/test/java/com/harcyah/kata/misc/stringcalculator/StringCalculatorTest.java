package com.harcyah.kata.misc.stringcalculator;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

    @Test
    public void testAddEmptyString() throws NegativeNumberException {
        StringCalculator sc = new StringCalculator("");
        Assert.assertEquals(0, sc.add());
    }

    @Test
    public void testAddOneDigit() throws NegativeNumberException {
        StringCalculator sc = new StringCalculator("1");
        Assert.assertEquals(1, sc.add());
    }

    @Test
    public void testAddTwoDigits() throws NegativeNumberException {
        StringCalculator sc = new StringCalculator("2,3");
        Assert.assertEquals(5, sc.add());
    }

    @Test
    public void testAddFiveDigits() throws NegativeNumberException {
        StringCalculator sc = new StringCalculator("1,2,3,4,5");
        Assert.assertEquals(15, sc.add());
    }

    @Test
    public void testAddHandlesLineFeedSeparator() throws NegativeNumberException {
        StringCalculator sc = new StringCalculator("1\n2,3");
        Assert.assertEquals(6, sc.add());
    }

    @Test
    public void testAddHandlesCustomSeparator() throws NegativeNumberException {
        StringCalculator sc = new StringCalculator("#\n1#2#3#34");
        Assert.assertEquals(40, sc.add());
    }

    @Test
    public void testAddCannotHandleNegativeNumbers() throws NegativeNumberException {
        try {
            StringCalculator sc = new StringCalculator("-40,5,15,-10,20");
            sc.add();
            Assert.fail();
        } catch (NegativeNumberException e) {
            Assert.assertEquals("Unable to handle negative numbers: -40,-10", e.getMessage());
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

}
