package com.harcyah.kata.projecteuler;

public class Problem006 {

    public long getSumSquareDifference() {
        long sumSquares = 0;
        long squareSum = 0;

        for (int i = 1; i < 101; i++) {
            sumSquares += i * i;
            squareSum += i;
        }
        squareSum *= squareSum;

        return squareSum - sumSquares;
    }

}
