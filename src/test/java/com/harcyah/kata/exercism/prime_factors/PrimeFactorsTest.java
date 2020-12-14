package com.harcyah.kata.exercism.prime_factors;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeFactorsTest {

    public static Collection<Object[]> getTestData() {
        return List.of(new Object[][]{
            {1L, List.of()},
            {2L, List.of(2L)},
            {3L, List.of(3L)},
            {4L, List.of(2L, 2L)},
            {6L, List.of(2L, 3L)},
            {8L, List.of(2L, 2L, 2L)},
            {9L, List.of(3L, 3L)},
            {27L, List.of(3L, 3L, 3L)},
            {625L, List.of(5L, 5L, 5L, 5L)},
            {901255L, List.of(5L, 17L, 23L, 461L)},
            {93819012551L, List.of(11L, 9539L, 894119L)}
        });
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void test(long input, List<Long> expectedOutput) {
        assertEquals(expectedOutput, PrimeFactors.getForNumber(input));
    }

}
