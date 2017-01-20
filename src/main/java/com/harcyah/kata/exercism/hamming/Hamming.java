package com.harcyah.kata.exercism.hamming;

public class Hamming {

    public static int compute(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException();
        }

        int hamming = 0;
        for (int i = 0; i < leftStrand.length(); i++) {
            char left = leftStrand.charAt(i);
            char right = rightStrand.charAt(i);
            hamming += (left != right) ? 1 : 0;
        }
        return hamming;
    }

}
