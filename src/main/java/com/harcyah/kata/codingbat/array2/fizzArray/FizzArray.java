package com.harcyah.kata.codingbat.array2.fizzArray;

public class FizzArray {

    public int[] fizzArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        return array;
    }


}


