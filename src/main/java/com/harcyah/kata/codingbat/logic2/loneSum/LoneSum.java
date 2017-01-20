package com.harcyah.kata.codingbat.logic2.loneSum;

public class LoneSum {

    public int loneSum(int a, int b, int c) {
        int sum = 0;
        sum += add(a, a, b, c);
        sum += add(b, a, b, c);
        sum += add(c, a, b, c);
        return sum;
    }

    public int add(int a, int v1, int v2, int v3) {
        int appears = 0;
        if (a == v1)
            appears++;
        if (a == v2)
            appears++;
        if (a == v3)
            appears++;
        return appears == 1 ? a : 0;
    }

}
