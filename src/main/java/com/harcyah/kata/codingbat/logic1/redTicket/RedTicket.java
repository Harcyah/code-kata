package com.harcyah.kata.codingbat.logic1.redTicket;

public class RedTicket {

    public int redTicket(int a, int b, int c) {
        if ((a + b + c) == 6) {
            return 10;
        }
        if ((a == b) && (b == c)) {
            return 5;
        }
        if ((b != a) && (c != a)) {
            return 1;
        }
        return 0;
    }

}
