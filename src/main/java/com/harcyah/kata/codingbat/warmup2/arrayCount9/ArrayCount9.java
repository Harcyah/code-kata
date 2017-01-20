package com.harcyah.kata.codingbat.warmup2.arrayCount9;

public class ArrayCount9 {

    public int arrayCount9(int[] nums) {
        int nine = 0;
        for (int i = 0; i < nums.length; i++) {
            nine += nums[i] == 9 ? 1 : 0;
        }
        return nine;
    }

}
