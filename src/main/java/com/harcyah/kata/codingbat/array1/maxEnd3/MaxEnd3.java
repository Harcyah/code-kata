package com.harcyah.kata.codingbat.array1.maxEnd3;

public class MaxEnd3 {

    public int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[2]);
        return new int[]{max, max, max};
    }

}
