package com.harcyah.kata.codingbat.logic2.closeFar;

public class CloseFar {

    public boolean closeFar(int a, int b, int c) {
        return (isClose(a, b) && isFar(c, b, a))
                || (isClose(a, c) && isFar(b, a, c));
    }

    public boolean isClose(int a, int b) {
        return Math.abs(a - b) <= 1;
    }

    public boolean isFar(int f, int a, int b) {
        return Math.abs(a - f) >= 2 && Math.abs(b - f) >= 2;
    }

}
