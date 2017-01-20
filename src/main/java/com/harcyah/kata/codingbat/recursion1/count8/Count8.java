package com.harcyah.kata.codingbat.recursion1.count8;

public class Count8 {

    public int count8(int n) {
        if (n < 10) {
            return n == 8 ? 1 : 0;
        }

        int v = 0;
        if ((n % 100) == 88) {
            v = 2;
        } else if ((n % 10) == 8) {
            v = 1;
        }

        return v + count8(n / 10);
    }

}
