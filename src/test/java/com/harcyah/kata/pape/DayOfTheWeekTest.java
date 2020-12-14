package com.harcyah.kata.pape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayOfTheWeekTest {

    private static final int SUNDAY = 0;
    private static final int WEDNESDAY = 3;
    private static final int THURSDAY = 4;
    private static final int FRIDAY = 5;

    @Test
    public void testGetDayOfWeek() {
        DayOfTheWeek dotw = new DayOfTheWeek();
        assertEquals(SUNDAY, dotw.getDayOfWeek(1953, 1, 18));
        assertEquals(SUNDAY, dotw.getDayOfWeek(1953, 8, 2));
        assertEquals(FRIDAY, dotw.getDayOfWeek(1998, 3, 13));
        assertEquals(THURSDAY, dotw.getDayOfWeek(1916, 3, 23));
        assertEquals(SUNDAY, dotw.getDayOfWeek(2007, 4, 8));
        assertEquals(SUNDAY, dotw.getDayOfWeek(2010, 4, 4));
        assertEquals(WEDNESDAY, dotw.getDayOfWeek(2006, 3, 1));
        assertEquals(WEDNESDAY, dotw.getDayOfWeek(2007, 2, 21));
        assertEquals(WEDNESDAY, dotw.getDayOfWeek(2010, 2, 17));
    }

}
