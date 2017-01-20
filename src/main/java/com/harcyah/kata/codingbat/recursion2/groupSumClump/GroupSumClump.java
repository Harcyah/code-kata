package com.harcyah.kata.codingbat.recursion2.groupSumClump;

public class GroupSumClump {

    public boolean groupSumClump(int start, int[] nums, int target) {
        if (start == nums.length) {
            return target == 0;
        }

        int curr = nums[start];
        int next = start + 1;
        int pack = curr;
        while ((next < nums.length) && (nums[next] == curr)) {
            next++;
            pack += curr;
        }

        return groupSumClump(next, nums, target - pack) || groupSumClump(next, nums, target);
    }

}
