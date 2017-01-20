package com.harcyah.kata.codingbat.recursion1.sumDigits;

public class SumDigits {

    public int sumDigits(int n) {
        if ((n % 10) == n) {
            return n;
        }
        return (n % 10) + sumDigits(n / 10);
    }

}
