package com.harcyah.kata.projecteuler;

import java.math.BigInteger;

public class Problem056 {

    public long getPowerfulDigitSum() {
        long max = 0L;
        for (int a = 0; a < 100; a++) {
            for (int b = 0; b < 100; b++) {
                BigInteger bia = new BigInteger(String.valueOf(a));
                BigInteger pow = bia.pow(b);
                String value = pow.toString();
                long sum = sumDigits(value);
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    public int sumDigits(String value) {
        int sum = 0;
        for (int i = 0; i < value.length(); i++) {
            sum += Integer.parseInt(value.substring(i, i + 1));
        }
        return sum;
    }

}
