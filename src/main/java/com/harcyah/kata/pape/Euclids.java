package com.harcyah.kata.pape;

// http://www.home.hs-karlsruhe.de/~pach0003/informatik_1/aufgaben/en/recursion.html#euclid
public class Euclids {

    public int getGCD(int a, int b) {
        if (a == b) {
            return a;
        }
        if (a > b) {
            return getGCD(a - b, b);
        } else {
            return getGCD(a, b - a);
        }
    }

}
