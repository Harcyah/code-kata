package com.harcyah.kata.exercism.raindrops;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RaindropsTest {

    public static Collection<Object[]> getTestData() {
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

    @ParameterizedTest
    @MethodSource("getTestData")
    public void test(int input, String output) {
        assertEquals(output, Raindrops.convert(input));
    }

}
