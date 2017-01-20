package com.harcyah.kata.codingbat.ap1.sumHeights2;

public class SumHeights2 {

    public int sumHeights2(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            int lo = heights[i];
            int hi = heights[i + 1];
            int dst = lo - hi;
            sum += Math.abs(dst > 0 ? dst : dst * 2);
        }
        return sum;
    }

}
