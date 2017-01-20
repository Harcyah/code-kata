package com.harcyah.kata.codingbat.array1.makeEnds;

public class MakeEnds {

    public int[] makeEnds(int[] nums) {
        int[] out = new int[2];
        out[0] = nums[0];
        out[1] = nums[nums.length - 1];
        return out;
    }

}
