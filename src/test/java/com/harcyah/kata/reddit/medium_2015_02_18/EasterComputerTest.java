package com.harcyah.kata.reddit.medium_2015_02_18;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class EasterComputerTest {

    @Test
    public void testCompute() {
        EasterComputer ec = new EasterComputer();
        assertEquals(LocalDate.of(2006, 4, 16), ec.compute(2006));
        assertEquals(LocalDate.of(2014, 4, 20), ec.compute(2014));
        assertEquals(LocalDate.of(2015, 4, 5), ec.compute(2015));
        assertEquals(LocalDate.of(2016, 3, 27), ec.compute(2016));
        assertEquals(LocalDate.of(2017, 4, 16), ec.compute(2017));
    }

}
