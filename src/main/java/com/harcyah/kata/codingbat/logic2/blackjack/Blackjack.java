package com.harcyah.kata.codingbat.logic2.blackjack;

public class Blackjack {

    public int blackjack(int a, int b) {
        a = a > 21 ? 0 : a;
        b = b > 21 ? 0 : b;
        return Math.max(a, b);
    }

}
