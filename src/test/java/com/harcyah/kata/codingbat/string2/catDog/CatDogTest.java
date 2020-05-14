package com.harcyah.kata.codingbat.string2.catDog;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CatDogTest {

    @Test
    public void testCatDog() {
        CatDog catDog = new CatDog();
        assertTrue(catDog.catDog("catdog"));
        assertFalse(catDog.catDog("catcat"));
        assertTrue(catDog.catDog("1cat1cadodog"));
        assertFalse(catDog.catDog("catxxdogxxxdog"));
        assertTrue(catDog.catDog("catxdogxdogxcat"));
        assertFalse(catDog.catDog("catxdogxdogxca"));
        assertFalse(catDog.catDog("dogdogcat"));
        assertTrue(catDog.catDog("dogogcat"));
        assertFalse(catDog.catDog("dog"));
        assertFalse(catDog.catDog("cat"));
        assertTrue(catDog.catDog("ca"));
        assertTrue(catDog.catDog("c"));
        assertTrue(catDog.catDog(""));
    }

}
