package com.harcyah.kata.codingbat.logic2.makeBricks;

public class MakeBricks {

    public boolean makeBricks(int small, int big, int goal) {
        int maxNecessaryBig = goal / 5;
        int maxValueWithBig = big * 5;
        int maxUsableBig = maxValueWithBig <= goal ? big : maxNecessaryBig;
        for (int i = 0; i <= maxUsableBig; i++) {
            if (5 * i <= goal) {
                int needed = goal - (5 * i);
                if (needed <= small) {
                    return true;
                }
            }
        }
        return false;
    }

}
