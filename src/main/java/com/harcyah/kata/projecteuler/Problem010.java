package com.harcyah.kata.projecteuler;

public class Problem010 {

    public long getSummationOfPrimes(int limit) {
        int number = 2;
        long sum = 0;
        while (number < limit) {
            if (Prime.isPrime(number)) {
                sum += number;
            }
            number++;
        }
        return sum;
    }

}
