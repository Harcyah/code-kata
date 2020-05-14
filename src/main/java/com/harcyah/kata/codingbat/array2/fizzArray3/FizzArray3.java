package com.harcyah.kata.codingbat.array2.fizzArray3;

public class FizzArray3 {

    public int[] fizzArray3(int start, int end) {
        int l = end - start;
        int[] array = new int[l];
        for (int i = start; i < end; i++) {
            array[i - start] = i;
        }
        return array;
    }

}

