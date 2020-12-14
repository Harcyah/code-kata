package com.harcyah.kata.codingbat.logic1.teenSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeenSumTest {

    @Test
    public void testTeenSum() {
        TeenSum teenSum = new TeenSum();
        assertEquals(7, teenSum.teenSum(3, 4));
        assertEquals(19, teenSum.teenSum(10, 13));
        assertEquals(19, teenSum.teenSum(13, 2));
        assertEquals(19, teenSum.teenSum(3, 19));
        assertEquals(19, teenSum.teenSum(13, 13));
        assertEquals(20, teenSum.teenSum(10, 10));
        assertEquals(19, teenSum.teenSum(6, 14));
        assertEquals(19, teenSum.teenSum(15, 2));
        assertEquals(19, teenSum.teenSum(19, 19));
        assertEquals(19, teenSum.teenSum(19, 20));
        assertEquals(19, teenSum.teenSum(2, 18));
        assertEquals(16, teenSum.teenSum(12, 4));
        assertEquals(22, teenSum.teenSum(2, 20));
        assertEquals(19, teenSum.teenSum(2, 17));
        assertEquals(19, teenSum.teenSum(2, 16));
        assertEquals(13, teenSum.teenSum(6, 7));
    }

}
