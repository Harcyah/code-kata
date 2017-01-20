package com.harcyah.kata.codingbat.array2.sameEnds;

public class SameEnds {

    public boolean sameEnds(int[] nums, int len) {
        int endStartsAt = nums.length - len;
        for (int i = 0; i < len; i++) {
            int left = nums[i];
            int right = nums[endStartsAt + i];
            if (left != right) {
                return false;
            }
        }
        return true;
    }

}
