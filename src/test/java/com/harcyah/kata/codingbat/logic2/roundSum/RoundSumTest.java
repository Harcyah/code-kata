package com.harcyah.kata.codingbat.logic2.roundSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoundSumTest {

    @Test
    public void testRoundSum() {
        RoundSum roundSum = new RoundSum();
        assertEquals(60, roundSum.roundSum(16, 17, 18));
        assertEquals(30, roundSum.roundSum(12, 13, 14));
        assertEquals(10, roundSum.roundSum(6, 4, 4));
        assertEquals(20, roundSum.roundSum(4, 6, 5));
        assertEquals(10, roundSum.roundSum(4, 4, 6));
        assertEquals(10, roundSum.roundSum(9, 4, 4));
        assertEquals(0, roundSum.roundSum(0, 0, 1));
        assertEquals(10, roundSum.roundSum(0, 9, 0));
        assertEquals(40, roundSum.roundSum(10, 10, 19));
        assertEquals(90, roundSum.roundSum(20, 30, 40));
        assertEquals(100, roundSum.roundSum(45, 21, 30));
        assertEquals(60, roundSum.roundSum(23, 11, 26));
        assertEquals(70, roundSum.roundSum(23, 24, 25));
        assertEquals(80, roundSum.roundSum(25, 24, 25));
        assertEquals(70, roundSum.roundSum(23, 24, 29));
        assertEquals(70, roundSum.roundSum(11, 24, 36));
        assertEquals(90, roundSum.roundSum(24, 36, 32));
        assertEquals(50, roundSum.roundSum(14, 12, 26));
        assertEquals(40, roundSum.roundSum(12, 10, 24));
    }

}
