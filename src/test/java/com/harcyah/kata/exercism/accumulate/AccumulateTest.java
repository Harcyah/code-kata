package com.harcyah.kata.exercism.accumulate;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccumulateTest {

    @Test
    public void emptyAccumulateProducesEmptyAccumulation() {
        List<Integer> input = new LinkedList<>();
        List<Integer> expectedOutput = new LinkedList<>();
        assertEquals(expectedOutput, Accumulate.accumulate(input, x -> x * x));
    }

    @Test
    public void accumulateSquares() {
        List<Integer> input = List.of(1, 2, 3);
        List<Integer> expectedOutput = List.of(1, 4, 9);
        assertEquals(expectedOutput, Accumulate.accumulate(input, x -> x * x));
    }

    @Test
    public void accumulateUpperCases() {
        List<String> input = List.of("hello", "world");
        List<String> expectedOutput = List.of("HELLO", "WORLD");
        assertEquals(expectedOutput, Accumulate.accumulate(input, String::toUpperCase));
    }

    @Test
    public void accumulateReversedStrings() {
        List<String> input = List.of("the quick brown fox etc".split(" "));
        List<String> expectedOutput = List.of("eht kciuq nworb xof cte".split(" "));
        assertEquals(expectedOutput, Accumulate.accumulate(input, this::reverse));
    }

    private String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    @Test
    public void accumulateWithinAccumulate() {
        List<String> input1 = List.of("a", "b", "c");
        List<String> input2 = List.of("1", "2", "3");
        List<String> expectedOutput = List.of("a1 a2 a3", "b1 b2 b3", "c1 c2 c3");
        assertEquals(expectedOutput, Accumulate.accumulate(
                input1, c ->
                        String.join(" ", Accumulate.accumulate(input2, d -> c + d))
        ));
    }

}
