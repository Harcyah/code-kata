package com.harcyah.kata.codingbat.logic1.fizzString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzStringTest {

    @Test
    public void testFizzString() {
        FizzString fizzString = new FizzString();
        assertEquals("Fizz", fizzString.fizzString("fig"));
        assertEquals("Buzz", fizzString.fizzString("dib"));
        assertEquals("FizzBuzz", fizzString.fizzString("fib"));
        assertEquals("abc", fizzString.fizzString("abc"));
        assertEquals("Fizz", fizzString.fizzString("fooo"));
        assertEquals("booo", fizzString.fizzString("booo"));
        assertEquals("Buzz", fizzString.fizzString("ooob"));
        assertEquals("FizzBuzz", fizzString.fizzString("fooob"));
        assertEquals("Fizz", fizzString.fizzString("f"));
        assertEquals("Buzz", fizzString.fizzString("b"));
        assertEquals("Buzz", fizzString.fizzString("abcb"));
        assertEquals("Hello", fizzString.fizzString("Hello"));
        assertEquals("Buzz", fizzString.fizzString("Hellob"));
        assertEquals("af", fizzString.fizzString("af"));
        assertEquals("bf", fizzString.fizzString("bf"));
        assertEquals("FizzBuzz", fizzString.fizzString("fb"));
    }

}
