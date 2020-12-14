package com.harcyah.kata.exercism.pascals_triangle;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PascalsTriangleTest {

    @Test
    public void testTriangleWithFourRows() {
        int[][] expectedOutput = new int[][]{
            {1},
            {1, 1},
            {1, 2, 1},
            {1, 3, 3, 1},
        };

        assertArrayEquals(expectedOutput, PascalsTriangle.computeTriangle(4));
    }

    @Test
    public void testTriangleWithSixRows() {
        int[][] expectedOutput = new int[][]{
            {1},
            {1, 1},
            {1, 2, 1},
            {1, 3, 3, 1},
            {1, 4, 6, 4, 1},
            {1, 5, 10, 10, 5, 1}
        };

        assertArrayEquals(expectedOutput, PascalsTriangle.computeTriangle(6));
    }

    @Test
    public void testExpectEmptyTriangle() {
        int[][] expectedOutput = new int[][]{
        };

        assertArrayEquals(expectedOutput, PascalsTriangle.computeTriangle(0));
    }

    @Test
    public void testValidInput() {
        int[][] input = new int[][]{
            {1},
            {1, 1},
            {1, 2, 1},
            {1, 3, 3, 1},
            {1, 4, 6, 4, 1},
        };

        assertTrue(PascalsTriangle.isTriangle(input));
    }

    @Test
    public void testInvalidInput() {
        int[][] input = new int[][]{
            {1},
            {1, 1},
            {1, 2, 1},
            {1, 4, 4, 1},
        };

        assertFalse(PascalsTriangle.isTriangle(input));
    }

    @Test
    public void testValidatesNotNegativeRows() {
        assertThatThrownBy(() -> PascalsTriangle.computeTriangle(-1))
            .isInstanceOf(IllegalArgumentException.class);
    }

}
