package com.harcyah.kata.codingbat.array2.sum13;

public class Sum13 {

    public int sum13(int[] nums) {
        int sum = 0;
        boolean skipNext = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 13) {
                if (skipNext) {
                    skipNext = false;
                } else {
                    sum += nums[i];
                }
            } else {
                skipNext = true;
            }
        }
        return sum;
    }

}

