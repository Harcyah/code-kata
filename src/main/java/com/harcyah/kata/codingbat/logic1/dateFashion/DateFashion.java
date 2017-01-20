package com.harcyah.kata.codingbat.logic1.dateFashion;

public class DateFashion {

    public int dateFashion(int you, int date) {
        if (isVEryStylish(you, date))
            return 2;
        if (isTramp(you, date))
            return 0;
        return 1;
    }

    public boolean isVEryStylish(int y, int d) {
        return (y >= 8 && d > 2) || (d >= 8 && y > 2);
    }

    public boolean isTramp(int y, int d) {
        return y <= 2 || d <= 2;
    }

}
