package com.harcyah.kata.codingbat.recursion2.groupSum6;

public class GroupSum6 {

    public boolean groupSum6(int start, int[] nums, int target) {
        if (start == nums.length) {
            return target == 0;
        }

        int curr = nums[start];
        if (curr == 6) {
            return groupSum6(start + 1, nums, target - curr);
        } else {
            return groupSum6(start + 1, nums, target - curr) || groupSum6(start + 1, nums, target);
        }
    }

}
