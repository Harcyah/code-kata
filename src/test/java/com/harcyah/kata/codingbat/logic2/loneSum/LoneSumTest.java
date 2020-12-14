package com.harcyah.kata.codingbat.logic2.loneSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoneSumTest {

    @Test
    public void testLoneSum() {
        LoneSum loneSum = new LoneSum();
        assertEquals(6, loneSum.loneSum(1, 2, 3));
        assertEquals(2, loneSum.loneSum(3, 2, 3));
        assertEquals(0, loneSum.loneSum(3, 3, 3));
        assertEquals(9, loneSum.loneSum(9, 2, 2));
        assertEquals(9, loneSum.loneSum(2, 2, 9));
        assertEquals(9, loneSum.loneSum(2, 9, 2));
        assertEquals(14, loneSum.loneSum(2, 9, 3));
        assertEquals(9, loneSum.loneSum(4, 2, 3));
        assertEquals(3, loneSum.loneSum(1, 3, 1));
    }

}
