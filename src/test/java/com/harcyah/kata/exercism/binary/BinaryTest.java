package com.harcyah.kata.exercism.binary;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTest {

    public static Collection<Object[]> getTestData() {
        return List.of(new Object[][]{
                {"1", 1},
                {"10", 2},
                {"11", 3},
                {"100", 4},
                {"1001", 9},
                {"11010", 26},
                {"10001101000", 1128},
                {"2", 0},
                {"5", 0},
                {"9", 0},
                {"134678", 0},
                {"abc10z", 0},
                {"011", 3}
        });
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void test(String input, int expectedOutput) {
        Binary binary = new Binary(input);

        assertEquals(expectedOutput, binary.getDecimal());
    }

}
