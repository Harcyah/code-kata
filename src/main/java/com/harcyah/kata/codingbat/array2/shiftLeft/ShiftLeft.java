package com.harcyah.kata.codingbat.array2.shiftLeft;

public class ShiftLeft {

    public int[] shiftLeft(int[] nums) {
        if (nums.length < 2) {
            return nums;
        }

        int i;
        int head = nums[0];
        for (i = 0; i < (nums.length - 1); i++) {
            nums[i] = nums[i + 1];
        }
        nums[i] = head;
        return nums;
    }

}
