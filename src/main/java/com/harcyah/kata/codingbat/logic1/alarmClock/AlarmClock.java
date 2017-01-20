package com.harcyah.kata.codingbat.logic1.alarmClock;

public class AlarmClock {

    public String alarmClock(int day, boolean vacancy) {
        if ((day == 0) || (day == 6)) {
            return vacancy ? "off" : "10:00";
        } else {
            return vacancy ? "10:00" : "7:00";
        }
    }

}
