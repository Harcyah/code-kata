package com.harcyah.kata.codingbat.logic2.roundSum;

public class RoundSum {

    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public int round10(int num) {
        return Math.round(num / 10.f) * 10;
    }

}
