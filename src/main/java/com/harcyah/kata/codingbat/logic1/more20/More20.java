package com.harcyah.kata.codingbat.logic1.more20;

public class More20 {

    public boolean more20(int n) {
        return (((n - 1) % 20) == 0) || (((n - 2) % 20) == 0);
    }

}
