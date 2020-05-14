package com.harcyah.kata.codingbat.ap1.copyEvens;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CopyEvensTest {

    @Test
    public void testCopyEvens() {
        CopyEvens copyEvens = new CopyEvens();
        assertArrayEquals(new int[]{2, 4}, copyEvens.copyEvens(new int[]{3, 2, 4, 5, 8}, 2));
        assertArrayEquals(new int[]{2, 4, 8}, copyEvens.copyEvens(new int[]{3, 2, 4, 5, 8}, 3));
        assertArrayEquals(new int[]{6, 2, 4}, copyEvens.copyEvens(new int[]{6, 1, 2, 4, 5, 8}, 3));
        assertArrayEquals(new int[]{6, 2, 4, 8}, copyEvens.copyEvens(new int[]{6, 1, 2, 4, 5, 8}, 4));
        assertArrayEquals(new int[]{4}, copyEvens.copyEvens(new int[]{3, 1, 4, 1, 5}, 1));
        assertArrayEquals(new int[]{2}, copyEvens.copyEvens(new int[]{2}, 1));
        assertArrayEquals(new int[]{6, 2}, copyEvens.copyEvens(new int[]{6, 2, 4, 8}, 2));
        assertArrayEquals(new int[]{6, 2, 4}, copyEvens.copyEvens(new int[]{6, 2, 4, 8}, 3));
        assertArrayEquals(new int[]{6, 2, 4, 8}, copyEvens.copyEvens(new int[]{6, 2, 4, 8}, 4));
        assertArrayEquals(new int[]{8}, copyEvens.copyEvens(new int[]{1, 8, 4}, 1));
        assertArrayEquals(new int[]{8, 4}, copyEvens.copyEvens(new int[]{1, 8, 4}, 2));
        assertArrayEquals(new int[]{2, 8}, copyEvens.copyEvens(new int[]{2, 8, 4}, 2));
    }

}
