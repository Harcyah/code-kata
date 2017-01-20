package com.harcyah.kata.codingbat.logic1.shareDigit;

public class ShareDigit {

    public boolean shareDigit(int a, int b) {
        int la = a / 10;
        int ra = a % 10;
        int lb = b / 10;
        int rb = b % 10;
        return (la == lb) || (la == rb) || (ra == lb) || (ra == rb);
    }

}
