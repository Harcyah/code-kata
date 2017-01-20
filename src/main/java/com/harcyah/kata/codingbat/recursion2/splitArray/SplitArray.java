package com.harcyah.kata.codingbat.recursion2.splitArray;

public class SplitArray {

    public boolean splitArray(int[] nums) {
        return canSplit(0, nums, 0, 0);
    }

    private boolean canSplit(int start, int[] nums, int left, int right) {
        if (start >= nums.length) {
            return left == right;
        }
        return canSplit(start + 1, nums, left + nums[start], right) || canSplit(start + 1, nums, left, right + nums[start]);
    }

}
