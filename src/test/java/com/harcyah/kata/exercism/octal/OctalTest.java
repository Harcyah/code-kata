package com.harcyah.kata.exercism.octal;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OctalTest {

    public static Collection<Object[]> getTestData() {
        return List.of(new Object[][]{
                {"1", 1},
                {"10", 8},
                {"17", 15},
                {"11", 9},
                {"130", 88},
                {"2047", 1063},
                {"7777", 4095},
                {"1234567", 342391},
                {"carrot", 0},
                {"8", 0},
                {"9", 0},
                {"6789", 0},
                {"abc1z", 0},
                {"011", 9}
        });
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void test(String input, int expectedOutput) {
        Octal octal = new Octal(input);

        assertEquals(expectedOutput, octal.getDecimal());
    }

}
