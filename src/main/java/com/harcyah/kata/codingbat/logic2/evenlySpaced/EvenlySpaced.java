package com.harcyah.kata.codingbat.logic2.evenlySpaced;

import java.util.Arrays;

public class EvenlySpaced {

    public boolean evenlySpaced(int a, int b, int c) {
        Integer[] values = new Integer[3];
        values[0] = a;
        values[1] = b;
        values[2] = c;
        Arrays.sort(values);
        return values[1] - values[0] == values[2] - values[1];
    }

}
