package com.harcyah.kata.pape;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

public class MultiplicationTableTest {

    @Test
    public void testGet3() throws Exception {
        MultiplicationTable mt = new MultiplicationTable();
        int[][] table = mt.get(1, 3);
        Assertions.assertThat(table).hasSize(3);
        Assert.assertArrayEquals(new int[]{1, 2, 3}, table[0]);
        Assert.assertArrayEquals(new int[]{2, 4, 6}, table[1]);
        Assert.assertArrayEquals(new int[]{3, 6, 9}, table[2]);
    }

    @Test
    public void testGet5() throws Exception {
        MultiplicationTable mt = new MultiplicationTable();
        int[][] table = mt.get(1, 5);
        Assertions.assertThat(table).hasSize(5);
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, table[0]);
        Assert.assertArrayEquals(new int[]{2, 4, 6, 8, 10}, table[1]);
        Assert.assertArrayEquals(new int[]{3, 6, 9, 12, 15}, table[2]);
        Assert.assertArrayEquals(new int[]{4, 8, 12, 16, 20}, table[3]);
        Assert.assertArrayEquals(new int[]{5, 10, 15, 20, 25}, table[4]);
    }

}
