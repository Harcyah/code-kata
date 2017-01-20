package com.harcyah.kata.codingbat.array1.biggerTwo;

public class BiggerTwo {

    public int[] biggerTwo(int[] a, int[] b) {
        return (a[0] + a[1]) >= (b[0] + b[1]) ? a : b;
    }

}
