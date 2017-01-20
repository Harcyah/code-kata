package com.harcyah.kata.codingbat.logic1.maxMod5;

public class MaxMod5 {

    public int maxMod5(int a, int b) {
        if (a == b) {
            return 0;
        }

        int ra = a % 5;
        int rb = b % 5;
        if (ra == rb) {
            return Math.min(a, b);
        }

        return Math.max(a, b);
    }

}
