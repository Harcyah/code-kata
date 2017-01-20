package com.harcyah.kata.codingbat.array2.evenOdd;

public class EvenOdd {

    public int[] evenOdd(int[] nums) {
        int[] out = new int[nums.length];
        int sIndex = 0;
        int eIndex = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            int v = nums[i];
            if ((v % 2) == 0) {
                out[sIndex] = v;
                sIndex++;
            } else {
                out[eIndex] = v;
                eIndex--;
            }
        }
        return out;
    }

}
