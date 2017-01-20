package com.harcyah.kata.codingbat.logic1.specialEleven;

public class SpecialEleven {

    public boolean specialEleven(int n) {
        return ((n % 11) == 0) || (((n - 1) % 11) == 0);
    }

}
