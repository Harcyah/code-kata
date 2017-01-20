package com.harcyah.kata.codingbat.array2.post4;

public class Post4 {

    public int[] post4(int[] nums) {
        int index = nums.length - 1;
        for (int i = index; i >= 0; i--) {
            int v = nums[i];
            if (v == 4) {
                index = i;
                break;
            }
        }

        int[] out = new int[nums.length - index - 1];
        for (int i = 0; i < out.length; i++) {
            out[i] = nums[index + i + 1];
        }
        return out;
    }

}
