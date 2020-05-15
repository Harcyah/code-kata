package com.harcyah.kata.codingbat.warmup2.countXX;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountXxTest {

    @Test
    public void testCount() {
        CountXx sut = new CountXx();
        assertEquals(1, sut.count("abcxx"));
        assertEquals(2, sut.count("xxx"));
        assertEquals(3, sut.count("xxxx"));
        assertEquals(0, sut.count("abc"));
        assertEquals(0, sut.count("Hello there"));
        assertEquals(2, sut.count("Hexxo thxxe"));
        assertEquals(0, sut.count(""));
        assertEquals(0, sut.count("Kittens"));
        assertEquals(2, sut.count("Kittensxxx"));
    }

}
