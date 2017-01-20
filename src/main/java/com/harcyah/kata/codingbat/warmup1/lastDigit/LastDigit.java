package com.harcyah.kata.codingbat.warmup1.lastDigit;

public class LastDigit {

    public boolean lastDigit(int a, int b) {
        return getLastDigit(a) == getLastDigit(b);
    }

    public int getLastDigit(int v) {
        int digit = v;
        while (digit >= 10) {
            digit = digit % 10;
        }
        return digit;
    }

}