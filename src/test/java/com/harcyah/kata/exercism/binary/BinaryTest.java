package com.harcyah.kata.exercism.binary;

import lombok.AllArgsConstructor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@AllArgsConstructor
@RunWith(Parameterized.class)
public class BinaryTest {

    private final String input;
    private final int expectedOutput;

    @Parameters
    public static Collection<Object[]> data() {
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

    @Test
    public void test() {
        Binary binary = new Binary(input);

        assertEquals(expectedOutput, binary.getDecimal());
    }

}
