package com.harcyah.kata.codingbat.logic1.teenSum;

public class TeenSum {

    public int teenSum(int a, int b) {
        return (isTeen(a) || isTeen(b)) ? 19 : a + b;
    }

    public boolean isTeen(int a) {
        return a >= 13 && a <= 19;
    }

}
