package com.harcyah.kata.codingbat.recursion1.factorial;

public class Factorial {

    public int factorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

}
