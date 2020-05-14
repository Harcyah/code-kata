package com.harcyah.kata.projecteuler;

import java.math.BigInteger;

public class Problem020 {

    public int getFactorialDigitSum(int limit) {
        BigInteger bi = new BigInteger("1");
        for (int i = 1; i < (limit + 1); i++) {
            BigInteger b = new BigInteger(i + "");
            bi = bi.multiply(b);
        }

        String str = bi.toString();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Integer.parseInt(str.charAt(i) + "");
        }

        return sum;
    }

}
