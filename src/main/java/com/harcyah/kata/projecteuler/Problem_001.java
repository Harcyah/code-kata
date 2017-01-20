package com.harcyah.kata.projecteuler;

public class Problem_001 {

    public int sumMultipleThreeAndFive(int goal) {
        int sum = 0;
        for (int i = 0; i < goal; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                sum += i;
            }
        }
        return sum;
    }

}
