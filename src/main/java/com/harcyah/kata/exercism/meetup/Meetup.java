package com.harcyah.kata.exercism.meetup;

import org.joda.time.DateTime;

public class Meetup {

    protected int month;
    protected int year;

    public Meetup(int month, int year) {
        this.month = month;
        this.year = year;
    }

    protected DateTime slideDate(DateTime dt, int untilDOW, int bonusWeeks) {
        while (dt.getDayOfWeek() != untilDOW) {
            dt = dt.plusDays(1);
        }
        return dt.plusWeeks(bonusWeeks);
    }

    public DateTime day(int day, MeetupSchedule schedule) {
        DateTime dt = new DateTime(year, month, 1, 0, 0);
        switch (schedule) {
            case FIRST:
                return slideDate(dt, day, 0);
            case SECOND:
                return slideDate(dt, day, 1);
            case THIRD:
                return slideDate(dt, day, 2);
            case FOURTH:
                return slideDate(dt, day, 3);
            case LAST:
                dt = dt.plusMonths(1).minusDays(1);
                while (dt.getDayOfWeek() != day) {
                    dt = dt.minusDays(1);
                }
                return dt;
            case TEENTH:
                dt = new DateTime(year, month, 13, 0, 0);
                while (dt.getDayOfWeek() != day) {
                    dt = dt.plusDays(1);
                }
                return dt;
            default:
                return null;
        }
    }

}