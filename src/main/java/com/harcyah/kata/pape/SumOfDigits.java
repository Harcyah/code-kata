package com.harcyah.kata.pape;

// http://www.home.hs-karlsruhe.de/~pach0003/informatik_1/aufgaben/en/arrays.html#digits
public class SumOfDigits {

    public long sum(char[] numbers) {
        long sum = 0;
        for (char c : numbers) {
            sum += c - '0';
        }
        return sum;
    }

}
