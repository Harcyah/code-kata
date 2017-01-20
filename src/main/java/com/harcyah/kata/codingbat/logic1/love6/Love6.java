package com.harcyah.kata.codingbat.logic1.love6;

public class Love6 {

    public boolean love6(int a, int b) {
        return (a == 6) || (b == 6) || ((a + b) == 6) || (Math.abs(a - b) == 6);
    }

}
