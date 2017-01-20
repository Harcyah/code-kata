package com.harcyah.kata.codingbat.array3.maxMirror;

public class MaxMirror {

    public int maxMirror(int[] nums) {
        int max = nums.length;
        for (; max > 0; max--) {
            for (int i = 0; i <= (nums.length - max); i++) {
                for (int j = 0; j <= (nums.length - max); j++) {
                    if (match(max, i, j, nums)) {
                        return max;
                    }
                }
            }

        }
        return max;
    }

    private boolean match(int max, int groupIndex, int versusIndex, int[] nums) {
        for (int i = 0; i < max; i++) {
            int left = nums[groupIndex + i];
            int right = nums[(versusIndex + max) - i - 1];
            if (left != right) {
                return false;
            }
        }
        return true;
    }

}
