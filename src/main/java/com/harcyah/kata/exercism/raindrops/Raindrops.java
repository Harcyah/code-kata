package com.harcyah.kata.exercism.raindrops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Raindrops {

    public static List<Long> getForNumber(long input) {
        if (input == 1) {
            return Arrays.asList();
        }

        List<Long> factors = new ArrayList<>();
        long root = (int) Math.floor(Math.sqrt(input));
        for (long i = 2; i <= root; i++) {
            long mod = input % i;
            if (mod == 0) {
                factors.add(i);
                factors.addAll(getForNumber(input / i));
                break;
            }
        }
        if (factors.isEmpty()) {
            factors.add(input);
        }
        return factors;
    }

    public static String convert(int input) {
        List<Long> primes = getForNumber(input);

        StringBuffer sb = new StringBuffer();
        if (primes.contains(3L)) {
            sb.append("Pling");
        }
        if (primes.contains(5L)) {
            sb.append("Plang");
        }
        if (primes.contains(7L)) {
            sb.append("Plong");
        }
        if (sb.length() == 0) {
            sb.append(String.valueOf(input));
        }

        return sb.toString();
    }

}