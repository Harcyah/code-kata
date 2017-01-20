package com.harcyah.kata.pape;

import org.junit.Assert;
import org.junit.Test;

public class DayOfTheWeekTest {

    private static final int SUNDAY = 0;
    private static final int WEDNESDAY = 3;
    private static final int THURSDAY = 4;
    private static final int FRIDAY = 5;

    @Test
    public void testGetDayOfWeek() {
        DayOfTheWeek dotw = new DayOfTheWeek();
        Assert.assertEquals(SUNDAY, dotw.getDayOfWeek(1953, 1, 18));
        Assert.assertEquals(SUNDAY, dotw.getDayOfWeek(1953, 8, 2));
        Assert.assertEquals(FRIDAY, dotw.getDayOfWeek(1998, 3, 13));
        Assert.assertEquals(THURSDAY, dotw.getDayOfWeek(1916, 3, 23));
        Assert.assertEquals(SUNDAY, dotw.getDayOfWeek(2007, 4, 8));
        Assert.assertEquals(SUNDAY, dotw.getDayOfWeek(2010, 4, 4));
        Assert.assertEquals(WEDNESDAY, dotw.getDayOfWeek(2006, 3, 1));
        Assert.assertEquals(WEDNESDAY, dotw.getDayOfWeek(2007, 2, 21));
        Assert.assertEquals(WEDNESDAY, dotw.getDayOfWeek(2010, 2, 17));
    }

}
