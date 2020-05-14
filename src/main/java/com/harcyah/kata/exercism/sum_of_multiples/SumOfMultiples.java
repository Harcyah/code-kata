package com.harcyah.kata.exercism.sum_of_multiples;

public class SumOfMultiples {

    public int sum(int max, int[] values) {
        int sum = 0;
        for (int i = 1; i < max; i++) {
            sum += process(i, values);
        }
        return sum;
    }

    private int process(int i, int[] values) {
        for (int value : values) {
            if (i % value == 0) {
                return i;
            }
        }
        return 0;
    }

}
