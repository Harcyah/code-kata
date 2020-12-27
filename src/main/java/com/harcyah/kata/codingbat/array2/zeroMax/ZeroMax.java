package com.harcyah.kata.codingbat.array2.zeroMax;

public class ZeroMax {

    public int[] zeroMax(int[] nums) {
        int[] out = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int v = nums[i];
            if (v == 0) {
                out[i] = getLargestOddValue(nums, i + 1);
            } else {
                out[i] = v;
            }
        }
        return out;
    }

    private int getLargestOddValue(int[] nums, int index) {
        int odd = 0;
        for (int i = index; i < nums.length; i++) {
            int v = nums[i];
            if (v < 0) {
                continue;
            }
            if ((v & 1) == 1) {
                odd = Math.max(odd, v);
            }
        }
        return odd;
    }

}
