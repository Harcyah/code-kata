package com.harcyah.kata.codingbat.logic2.luckySum;

public class LuckySum {

    public int luckySum(int a, int b, int c) {
        if (a == 13) {
            return 0;
        }
        if (b == 13) {
            return a;
        }
        if (c == 13) {
            c = 0;
        }
        return a + b + c;
    }

}
