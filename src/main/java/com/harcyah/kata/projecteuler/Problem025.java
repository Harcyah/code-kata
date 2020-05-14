package com.harcyah.kata.projecteuler;

import java.math.BigInteger;

public class Problem025 {

    public int getFibonacciSequenceLength(int limit) {
        BigInteger p = BigInteger.ONE;
        BigInteger v = BigInteger.ONE;
        int f = 2;
        while (String.valueOf(v).length() < limit) {
            BigInteger tempP = p;
            BigInteger tempV = v;
            p = v;
            v = tempP.add(tempV);
            f++;
        }
        return f;
    }

}
