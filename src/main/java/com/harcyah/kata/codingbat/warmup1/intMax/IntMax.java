package com.harcyah.kata.codingbat.warmup1.intMax;

public class IntMax {

    public int intMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        return (c > max) ? c : max;
    }

}