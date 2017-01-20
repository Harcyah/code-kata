package com.harcyah.kata.codingbat.logic1.greenTicket;

public class GreenTicket {

    public int greenTicket(int a, int b, int c) {
        if ((a == b) && (b == c)) {
            return 20;
        }
        if ((a == b) || (a == c) || (b == c)) {
            return 10;
        }
        return 0;
    }

}
