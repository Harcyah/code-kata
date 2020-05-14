package com.harcyah.kata.codingbat.string1.makeAbba;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakeAbbaTest {

    @Test
    public void testMakeAbba() {
        MakeAbba makeAbba = new MakeAbba();
        assertEquals("HiByeByeHi", makeAbba.makeAbba("Hi", "Bye"));
        assertEquals("YoAliceAliceYo", makeAbba.makeAbba("Yo", "Alice"));
        assertEquals("WhatUpUpWhat", makeAbba.makeAbba("What", "Up"));
        assertEquals("aaabbbbbbaaa", makeAbba.makeAbba("aaa", "bbb"));
        assertEquals("xyyx", makeAbba.makeAbba("x", "y"));
        assertEquals("xx", makeAbba.makeAbba("x", ""));
        assertEquals("yy", makeAbba.makeAbba("", "y"));
        assertEquals("BoYaYaBo", makeAbba.makeAbba("Bo", "Ya"));
        assertEquals("YaYaYaYa", makeAbba.makeAbba("Ya", "Ya"));
    }

}
