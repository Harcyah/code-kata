package com.harcyah.kata.pape;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MultiplicationTableTest {

    @Test
    public void testGet3() {
        MultiplicationTable mt = new MultiplicationTable();
        int[][] table = mt.get(1, 3);
        assertThat(table).hasDimensions(3, 3);
        assertArrayEquals(new int[]{1, 2, 3}, table[0]);
        assertArrayEquals(new int[]{2, 4, 6}, table[1]);
        assertArrayEquals(new int[]{3, 6, 9}, table[2]);
    }

    @Test
    public void testGet5() {
        MultiplicationTable mt = new MultiplicationTable();
        int[][] table = mt.get(1, 5);
        assertThat(table).hasDimensions(5, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, table[0]);
        assertArrayEquals(new int[]{2, 4, 6, 8, 10}, table[1]);
        assertArrayEquals(new int[]{3, 6, 9, 12, 15}, table[2]);
        assertArrayEquals(new int[]{4, 8, 12, 16, 20}, table[3]);
        assertArrayEquals(new int[]{5, 10, 15, 20, 25}, table[4]);
    }

}
