package com.harcyah.kata.exercism.nth_prime;

public class Prime {

    public static int nth(int number) {
        if (number == 0) {
            throw new IllegalArgumentException();
        }

        int value = 2;
        int primes = 0;
        while (primes != number) {
            if (isPrime(value)) {
                primes++;
                if (primes == number) {
                    return value;
                }
            }
            value++;
        }
        return 0;
    }

    protected static boolean isPrime(int value) {
        int sqrt = (int) Math.sqrt(value);
        for (int i = 2; i <= sqrt; i++) {
            if ((float) value % i == 0) {
                return false;
            }
        }
        return true;
    }


}
