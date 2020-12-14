package com.harcyah.kata.exercism.matrix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class GetLastColumnTest {

    public static Collection<Object[]> getTestData() {
        return Arrays.asList(new Object[][]{
            {"0", new int[]{0}},
            {"0 1", new int[]{1}},
            {"0\n" + "1", new int[]{0, 1}},
            {"0 1\n" + "2 3", new int[]{1, 3}},
            {"0 1 2\n" + "3 4 5\n" + "6 7 8", new int[]{2, 5, 8}}
        });
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void getLastColumnTest(String matrixAsString, int[] lastColumn) {
        Matrix matrix = new Matrix(matrixAsString);
        assertArrayEquals(lastColumn, matrix.getColumn(matrix.getColumnsCount() - 1));
    }

}
