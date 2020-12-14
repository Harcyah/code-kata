package com.harcyah.kata.exercism.strain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrainTest {

    @Test
    public void emptyKeep() {
        List<Integer> input = new LinkedList<>();
        List<Integer> expectedOutput = new LinkedList<>();
        assertEquals(expectedOutput, Strain.keep(input, x -> x < 10));
    }

    @Test
    public void keepEverything() {
        List<Integer> input = List.of(1, 2, 3);
        List<Integer> expectedOutput = List.of(1, 2, 3);
        assertEquals(expectedOutput, Strain.keep(input, x -> x < 10));
    }

    @Test
    public void keepFirstAndLast() {
        List<Integer> input = List.of(1, 2, 3);
        List<Integer> expectedOutput = List.of(1, 3);
        assertEquals(expectedOutput, Strain.keep(input, x -> x % 2 != 0));
    }

    @Test
    public void keepNeitherFirstNorLast() {
        List<Integer> input = List.of(1, 2, 3, 4, 5);
        List<Integer> expectedOutput = List.of(2, 4);
        assertEquals(expectedOutput, Strain.keep(input, x -> x % 2 == 0));
    }

    @Test
    public void keepStrings() {
        List<String> words = List.of("apple zebra banana zombies cherimoya zelot".split(" "));
        List<String> expectedOutput = List.of("zebra", "zombies", "zelot");
        assertEquals(expectedOutput,
            Strain.keep(words, x -> x.startsWith("z")));
    }

    @Test
    public void keepArrays() {
        List<List<Integer>> actual = List.of(
            List.of(1, 2, 3),
            List.of(5, 5, 5),
            List.of(5, 1, 2),
            List.of(2, 1, 2),
            List.of(1, 5, 2),
            List.of(2, 2, 1),
            List.of(1, 2, 5));
        List<List<Integer>> expectedOutput = List.of(
            List.of(5, 5, 5),
            List.of(5, 1, 2),
            List.of(1, 5, 2),
            List.of(1, 2, 5));
        assertEquals(expectedOutput,
            Strain.keep(actual, col -> col.contains(5)));
    }

    @Test
    public void emptyDiscard() {
        List<Integer> input = new LinkedList<>();
        List<Integer> expectedOutput = new LinkedList<>();
        assertEquals(expectedOutput, Strain.discard(input, x -> x < 10));
    }

    @Test
    public void discardNothing() {
        List<Integer> input = List.of(1, 2, 3);
        List<Integer> expectedOutput = List.of(1, 2, 3);
        assertEquals(expectedOutput, Strain.discard(input, x -> x > 10));
    }

    @Test
    public void discardFirstAndLast() {
        List<Integer> input = List.of(1, 2, 3);
        List<Integer> expectedOutput = List.of(2);
        assertEquals(expectedOutput, Strain.discard(input, x -> x % 2 != 0));

    }

    @Test
    public void discardNeitherFirstNorLast() {
        List<Integer> input = List.of(1, 2, 3, 4, 5);
        List<Integer> expectedOutput = List.of(1, 3, 5);
        assertEquals(expectedOutput, Strain.discard(input, x -> x % 2 == 0));
    }

    @Test
    public void discardStrings() {
        List<String> words = Arrays
            .asList("apple zebra banana zombies cherimoya zelot".split(" "));
        List<String> expectedOutput = List.of("apple", "banana", "cherimoya");
        assertEquals(expectedOutput,
            Strain.discard(words, x -> x.startsWith("z")));
    }

    @Test
    public void discardArrays() {
        List<List<Integer>> actual = List.of(
            List.of(1, 2, 3),
            List.of(5, 5, 5),
            List.of(5, 1, 2),
            List.of(2, 1, 2),
            List.of(1, 5, 2),
            List.of(2, 2, 1),
            List.of(1, 2, 5));
        List<List<Integer>> expectedOutput = List.of(
            List.of(1, 2, 3),
            List.of(2, 1, 2),
            List.of(2, 2, 1));
        assertEquals(expectedOutput,
            Strain.discard(actual, col -> col.contains(5)));
    }

}
