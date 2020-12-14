package com.harcyah.kata.exercism.difference_of_squares;

import java.util.stream.IntStream;

public class Difference {

    public static int computeSquareOfSumTo(int i) {
        int sum = (i * (i + 1)) / 2;
        return sum * sum;
    }

    public static int computeSumOfSquaresTo(int i) {
        return IntStream.range(0, i + 1).map(x -> x * x).sum();
    }

    public static int betweenSquareOfSumAndSumOfSquaresTo(int i) {
        return computeSquareOfSumTo(i) - computeSumOfSquaresTo(i);
    }

}
