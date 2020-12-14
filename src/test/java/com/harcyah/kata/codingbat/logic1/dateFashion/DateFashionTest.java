package com.harcyah.kata.codingbat.logic1.dateFashion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateFashionTest {

    @Test
    public void testDateFashion() {
        DateFashion dateFashion = new DateFashion();
        assertEquals(2, dateFashion.dateFashion(5, 10));
        assertEquals(0, dateFashion.dateFashion(5, 2));
        assertEquals(1, dateFashion.dateFashion(5, 5));
        assertEquals(1, dateFashion.dateFashion(3, 3));
        assertEquals(0, dateFashion.dateFashion(10, 2));
        assertEquals(0, dateFashion.dateFashion(2, 9));
        assertEquals(2, dateFashion.dateFashion(9, 9));
        assertEquals(2, dateFashion.dateFashion(10, 5));
        assertEquals(0, dateFashion.dateFashion(2, 2));
        assertEquals(1, dateFashion.dateFashion(3, 7));
        assertEquals(0, dateFashion.dateFashion(2, 7));
        assertEquals(0, dateFashion.dateFashion(6, 2));
    }

}
