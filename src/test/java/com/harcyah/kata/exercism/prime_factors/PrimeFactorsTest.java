package com.harcyah.kata.exercism.prime_factors;

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
public class PrimeFactorsTest {

    private final long input;
    private final List<Long> expectedOutput;

    @Parameters(name = "Prime factors of {0} = {1}")
    public static Collection<Object[]> data() {
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

    @Test
    public void test() {
        assertEquals(expectedOutput, PrimeFactors.getForNumber(input));
    }

}
