package com.harcyah.kata.codingbat.warmup1.in3050;

public class In3050 {

    public boolean in3050(int a, int b) {
        return areIn(a, b, 30, 40) || areIn(a, b, 40, 50);
    }

    public boolean areIn(int a, int b, int min, int max) {
        return isIn(a, min, max) && isIn(b, min, max);
    }

    public boolean isIn(int v, int min, int max) {
        return v >= min && v <= max;
    }

}