package com.harcyah.kata.codingbat.array2.either24;

public class Either24 {

    public boolean either24(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        boolean has22 = false;
        boolean has44 = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == 2 && nums[i] == 2) {
                has22 = true;
            }
            if (nums[i - 1] == 4 && nums[i] == 4) {
                has44 = true;
            }
        }

        return has22 ^ has44;
    }


}


