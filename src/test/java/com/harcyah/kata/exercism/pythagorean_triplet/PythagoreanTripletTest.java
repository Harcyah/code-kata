package com.harcyah.kata.exercism.pythagorean_triplet;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PythagoreanTripletTest {

    @Test
    public void shouldCalculateSum() {
        PythagoreanTriplet sut = new PythagoreanTriplet(3, 4, 5);
        final int expected = 12;
        final int actual = sut.calculateSum();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateProduct() {
        PythagoreanTriplet sut = new PythagoreanTriplet(3, 4, 5);
        final long expected = 60L;
        final long actual = sut.calculateProduct();
        assertEquals(expected, actual);
    }

    @Test
    public void testIsPythagoreanOK() {
        PythagoreanTriplet sut = new PythagoreanTriplet(3, 4, 5);
        assertTrue(sut.isPythagorean());
    }

    @Test
    public void testIsPythagoreanFail() {
        PythagoreanTriplet sut = new PythagoreanTriplet(5, 6, 7);
        assertFalse(sut.isPythagorean());
    }

    @Test
    public void shouldMakeTripletsUpToTen() {
        final List<Long> actual
                = PythagoreanTriplet
                .makeTripletsList()
                .withFactorsLessThanOrEqualTo(10)
                .build()
                .stream()
                .map(t -> t.calculateProduct())
                .sorted()
                .collect(Collectors.toList());
        final List<Long> expected = List.of(60L, 480L);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMakeTripletsElevenToTwenty() {
        final List<Long> actual
                = PythagoreanTriplet
                .makeTripletsList()
                .withFactorsGreaterThanOrEqualTo(11)
                .withFactorsLessThanOrEqualTo(20)
                .build()
                .stream()
                .map(t -> t.calculateProduct())
                .sorted((p1, p2) -> Double.compare(p1, p2))
                .collect(Collectors.toList());
        final List<Long> expected = List.of(3840L);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMakeTripletsAndFilterOnSum() {
        final List<Long> actual
                = PythagoreanTriplet
                .makeTripletsList()
                .withFactorsLessThanOrEqualTo(100)
                .thatSumTo(180)
                .build()
                .stream()
                .map(t -> t.calculateProduct())
                .sorted((p1, p2) -> Double.compare(p1, p2))
                .collect(Collectors.toList());
        final List<Long> expected = List.of(118080L, 168480L, 202500L);
        assertEquals(expected, actual);
    }

}
