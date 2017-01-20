package com.harcyah.kata.pape;

// http://www.home.hs-karlsruhe.de/~pach0003/informatik_1/aufgaben/en/flowcontrol.html#day_of_week
public class DayOfTheWeek {

    public int getDayOfWeek(int year, int month, int day) {
        int z;
        int b;
        if (month >= 3) {
            z = year;
            b = 2;
        } else {
            z = year - 1;
            b = 0;
        }
        int keith = ((23 * month) / 9);
        keith += day;
        keith += 4;
        keith += year;
        keith += Math.floorDiv(z, 4);
        keith -= Math.floorDiv(z, 100);
        keith += Math.floorDiv(z, 400);
        keith -= b;
        return keith % 7;
    }

}
