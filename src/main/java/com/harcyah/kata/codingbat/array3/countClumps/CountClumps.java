package com.harcyah.kata.codingbat.array3.countClumps;

public class CountClumps {

    public int countClumps(int[] nums) {
        int clumps = 0;
        if (nums.length < 2) {
            return clumps;
        }

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];

            int steps = 1;
            while (((i + steps) < nums.length) && (nums[i + steps] == value)) {
                steps++;
            }

            if (steps > 1) {
                clumps++;
                i += steps - 1;
            }
        }

        return clumps;
    }

}
