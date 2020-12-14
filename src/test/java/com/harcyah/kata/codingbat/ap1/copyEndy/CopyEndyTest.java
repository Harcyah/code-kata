package com.harcyah.kata.codingbat.ap1.copyEndy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CopyEndyTest {

    @Test
    public void testCopyEndy() {
        CopyEndy copyEndy = new CopyEndy();
        assertArrayEquals(new int[]{9, 90}, copyEndy.copyEndy(new int[]{9, 11, 90, 22, 6}, 2));
        assertArrayEquals(new int[]{9, 90, 6}, copyEndy.copyEndy(new int[]{9, 11, 90, 22, 6}, 3));
        assertArrayEquals(new int[]{1, 1}, copyEndy.copyEndy(new int[]{12, 1, 1, 13, 0, 20}, 2));
        assertArrayEquals(new int[]{1, 1, 0}, copyEndy.copyEndy(new int[]{12, 1, 1, 13, 0, 20}, 3));
        assertArrayEquals(new int[]{0}, copyEndy.copyEndy(new int[]{0}, 1));
        assertArrayEquals(new int[]{10, 90}, copyEndy.copyEndy(new int[]{10, 11, 90}, 2));
        assertArrayEquals(new int[]{90, 100}, copyEndy.copyEndy(new int[]{90, 22, 100}, 2));
        assertArrayEquals(new int[]{10}, copyEndy.copyEndy(new int[]{12, 11, 10, 89, 101, 4}, 1));
        assertArrayEquals(new int[]{2, 2}, copyEndy.copyEndy(new int[]{13, 2, 2, 0}, 2));
        assertArrayEquals(new int[]{2, 2, 0}, copyEndy.copyEndy(new int[]{13, 2, 2, 0}, 3));
        assertArrayEquals(new int[]{2, 2}, copyEndy.copyEndy(new int[]{13, 2, 13, 2, 0, 30}, 2));
        assertArrayEquals(new int[]{2, 2, 0}, copyEndy.copyEndy(new int[]{13, 2, 13, 2, 0, 30}, 3));
    }

}
