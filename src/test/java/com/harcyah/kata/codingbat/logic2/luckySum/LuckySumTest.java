package com.harcyah.kata.codingbat.logic2.luckySum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LuckySumTest {

    @Test
    public void testLuckySum() {
        LuckySum luckySum = new LuckySum();
        assertEquals(6, luckySum.luckySum(1, 2, 3));
        assertEquals(3, luckySum.luckySum(1, 2, 13));
        assertEquals(1, luckySum.luckySum(1, 13, 3));
        assertEquals(1, luckySum.luckySum(1, 13, 13));
        assertEquals(13, luckySum.luckySum(6, 5, 2));
        assertEquals(0, luckySum.luckySum(13, 2, 3));
        assertEquals(0, luckySum.luckySum(13, 2, 13));
        assertEquals(0, luckySum.luckySum(13, 13, 2));
        assertEquals(13, luckySum.luckySum(9, 4, 13));
        assertEquals(8, luckySum.luckySum(8, 13, 2));
        assertEquals(10, luckySum.luckySum(7, 2, 1));
        assertEquals(6, luckySum.luckySum(3, 3, 13));
    }

}
