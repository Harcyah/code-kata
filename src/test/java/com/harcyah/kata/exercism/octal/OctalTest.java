package com.harcyah.kata.exercism.octal;

import lombok.AllArgsConstructor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@AllArgsConstructor
@RunWith(Parameterized.class)
public class OctalTest {

    private final String input;
    private final int expectedOutput;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
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

    @Test
    public void test() {
        Octal octal = new Octal(input);

        assertEquals(expectedOutput, octal.getDecimal());
    }

}
