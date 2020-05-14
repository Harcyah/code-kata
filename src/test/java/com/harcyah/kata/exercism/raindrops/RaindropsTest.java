package com.harcyah.kata.exercism.raindrops;

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
public class RaindropsTest {

    private final int input;
    private final String expectedOutput;

    @Parameters
    public static Collection<Object[]> data() {
        return List.of(new Object[][]{
            // Non-primes
            {1, "1"},
            {52, "52"},
            {12121, "12121"},

            // Numbers with 3 as a prime factor
            {3, "Pling"},
            {6, "Pling"},
            {9, "Pling"},

            // Numbers with 5 as a prime factor
            {5, "Plang"},
            {10, "Plang"},
            {25, "Plang"},

            // Numbers with 7 as a prime factor
            {7, "Plong"},
            {14, "Plong"},
            {49, "Plong"},

            // Numbers with multiple activating prime factors
            {15, "PlingPlang"},
            {21, "PlingPlong"},
            {35, "PlangPlong"},
            {105, "PlingPlangPlong"},
        });
    }

    @Test
    public void test() {
        assertEquals(expectedOutput, Raindrops.convert(input));
    }

}
