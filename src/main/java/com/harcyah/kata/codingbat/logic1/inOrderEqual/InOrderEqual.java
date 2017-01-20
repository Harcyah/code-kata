package com.harcyah.kata.codingbat.logic1.inOrderEqual;

public class InOrderEqual {

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        return equalOk
                ? (a <= b && b <= c)
                : (a < b && b < c);
    }

}
