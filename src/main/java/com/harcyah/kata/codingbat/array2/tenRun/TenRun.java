package com.harcyah.kata.codingbat.array2.tenRun;

public class TenRun {

    public int[] tenRun(int[] nums) {
        Integer lastPowerOfTen = null;

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            if ((value % 10) == 0) {
                lastPowerOfTen = value;
            } else {
                if (lastPowerOfTen != null) {
                    nums[i] = lastPowerOfTen;
                }
            }
        }
        return nums;
    }

}
