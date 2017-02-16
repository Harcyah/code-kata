package com.harcyah.kata.exercism.perfect_numbers;

import java.util.HashSet;
import java.util.Set;

final class NaturalNumber {

    private Classification classification;

    public NaturalNumber(int number) {
        Set<Long> factors = getFactors(number);
        long sum = factors.stream().filter(x -> x != number).reduce(1L, Long::sum);

        if (sum < number) {
            classification = Classification.DEFICIENT;
        } else if (sum > number) {
            classification = Classification.ABUNDANT;
        } else {
            classification = Classification.PERFECT;
        }
    }

    private Set<Long> getFactors(int input) {
        Set<Long> factors = new HashSet<>();
        long max = input;
        for (long i = 2; i<max + 1; i++) {
            if (input % i == 0) {
                long mirror = input / i;
                factors.add(i);
                factors.add(mirror);
                max = mirror;
            }
        }

        return factors;
    }

    public Classification getClassification() {
        return classification;
    }

}
