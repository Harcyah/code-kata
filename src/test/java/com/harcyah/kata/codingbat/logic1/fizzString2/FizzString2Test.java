package com.harcyah.kata.codingbat.logic1.fizzString2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzString2Test {

    @Test
    public void testFizzString2() {
        FizzString2 fizzString2 = new FizzString2();
        assertEquals("1!", fizzString2.fizzString2(1));
        assertEquals("2!", fizzString2.fizzString2(2));
        assertEquals("Fizz!", fizzString2.fizzString2(3));
        assertEquals("4!", fizzString2.fizzString2(4));
        assertEquals("Buzz!", fizzString2.fizzString2(5));
        assertEquals("Fizz!", fizzString2.fizzString2(6));
        assertEquals("7!", fizzString2.fizzString2(7));
        assertEquals("8!", fizzString2.fizzString2(8));
        assertEquals("Fizz!", fizzString2.fizzString2(9));
        assertEquals("FizzBuzz!", fizzString2.fizzString2(15));
        assertEquals("16!", fizzString2.fizzString2(16));
        assertEquals("Fizz!", fizzString2.fizzString2(18));
        assertEquals("19!", fizzString2.fizzString2(19));
        assertEquals("Fizz!", fizzString2.fizzString2(21));
        assertEquals("44!", fizzString2.fizzString2(44));
        assertEquals("FizzBuzz!", fizzString2.fizzString2(45));
        assertEquals("Buzz!", fizzString2.fizzString2(100));
    }

}
