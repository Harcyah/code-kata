package com.harcyah.kata.codingbat.array1.fix23;

public class Fix23 {

    public int[] fix23(int[] nums) {
        if ((nums[0] == 2) && (nums[1] == 3)) {
            nums[1] = 0;
        }
        if ((nums[1] == 2) && (nums[2] == 3)) {
            nums[2] = 0;
        }
        return nums;
    }

}
