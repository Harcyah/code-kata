package com.harcyah.kata.codingbat.logic1.less20;

public class Less20 {

    public boolean less20(int n) {
        return (((n + 1) % 20) == 0) || (((n + 2) % 20) == 0);
    }

}
