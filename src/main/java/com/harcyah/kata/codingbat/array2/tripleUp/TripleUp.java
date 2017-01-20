package com.harcyah.kata.codingbat.array2.tripleUp;

public class TripleUp {

    public boolean tripleUp(int[] nums) {
        if (nums.length < 3) {
            return false;
        }

        for (int i = 0; i < (nums.length - 2); i++) {
            int a = nums[i];
            int b = nums[i + 1];
            int c = nums[i + 2];
            if ((b == (a + 1)) && (c == (a + 2))) {
                return true;
            }
        }
        return false;
    }

}
