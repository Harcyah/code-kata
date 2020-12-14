package com.harcyah.kata.codingbat.logic2.noTeenSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NoTeenSumTest {

    @Test
    public void testNoTeenSum() {
        NoTeenSum noTeenSum = new NoTeenSum();
        assertEquals(6, noTeenSum.noTeenSum(1, 2, 3));
        assertEquals(3, noTeenSum.noTeenSum(2, 13, 1));
        assertEquals(3, noTeenSum.noTeenSum(2, 1, 14));
        assertEquals(18, noTeenSum.noTeenSum(2, 1, 15));
        assertEquals(19, noTeenSum.noTeenSum(2, 1, 16));
        assertEquals(3, noTeenSum.noTeenSum(2, 1, 17));
        assertEquals(3, noTeenSum.noTeenSum(17, 1, 2));
        assertEquals(19, noTeenSum.noTeenSum(2, 15, 2));
        assertEquals(16, noTeenSum.noTeenSum(16, 17, 18));
        assertEquals(0, noTeenSum.noTeenSum(17, 18, 19));
        assertEquals(32, noTeenSum.noTeenSum(15, 16, 1));
        assertEquals(30, noTeenSum.noTeenSum(15, 15, 19));
        assertEquals(31, noTeenSum.noTeenSum(15, 19, 16));
        assertEquals(5, noTeenSum.noTeenSum(5, 17, 18));
        assertEquals(16, noTeenSum.noTeenSum(17, 18, 16));
        assertEquals(0, noTeenSum.noTeenSum(17, 19, 18));
    }

}
