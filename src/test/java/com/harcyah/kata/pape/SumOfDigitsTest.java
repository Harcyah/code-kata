package com.harcyah.kata.pape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfDigitsTest {

    @Test
    public void test() {
        SumOfDigits sod = new SumOfDigits();
        assertEquals(6L, sod.sum(new char[]{'0', '1', '5'}));
        assertEquals(30L, sod.sum(new char[]{'1', '9', '8', '9', '3'}));
    }

}
