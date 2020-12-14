package com.harcyah.kata.exercism.matrix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountRowsTest {

    public static Collection<Object[]> getTestData() {
        return Arrays.asList(new Object[][]{
            {"0", 1},
            {"0 1", 1},
            {"0\n" + "1", 2},
            {"0 1\n" + "2 3", 2},
            {"0 1 2\n" + "3 4 5\n" + "6 7 8", 3}
        });
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void countRowsTest(String matrixAsString, int numberOfRows) {
        Matrix matrix = new Matrix(matrixAsString);
        assertEquals(numberOfRows, matrix.getRowsCount());
    }

}
