package com.harcyah.kata.codingbat.logic1.lessBy10;

public class LessBy10 {

    public boolean lessBy10(int a, int b, int c) {
        int ac = Math.abs(a - c);
        int ab = Math.abs(a - b);
        int bc = Math.abs(b - c);
        return ac >= 10 || ab >= 10 || bc >= 10;
    }

}
