package com.harcyah.kata.codingbat.array1.double23;

public class Double23 {

    public boolean double23(int[] nums) {
        return (nums.length == 2) && (nums[0] == nums[1]) && ((nums[0] == 2) || (nums[0] == 3));
    }

}
