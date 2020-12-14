package com.harcyah.kata.projecteuler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem015Test {

    @Test
    public void testCountLatticePaths() {
        Problem015 sut = new Problem015();
        assertEquals(6L, sut.countLatticePaths(2));
        assertEquals(137846528820L, sut.countLatticePaths(20));
    }

}
