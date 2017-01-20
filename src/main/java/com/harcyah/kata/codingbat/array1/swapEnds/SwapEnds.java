package com.harcyah.kata.codingbat.array1.swapEnds;

public class SwapEnds {

    public int[] swapEnds(int[] nums) {
        int head = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = head;
        return nums;
    }

}
