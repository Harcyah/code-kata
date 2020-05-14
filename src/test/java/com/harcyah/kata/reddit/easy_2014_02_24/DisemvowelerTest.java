package com.harcyah.kata.reddit.easy_2014_02_24;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DisemvowelerTest {

    @Test
    public void testDisemvoweleStringOne() {
        Disemvoweler disemvoweler = new Disemvoweler();
        Pair<String, String> pair = disemvoweler.disemvowele("all those who believe in psychokinesis raise my hand");
        assertEquals("llthswhblvnpsychknssrsmyhnd", pair.getRight());
        assertEquals("aoeoeieeioieiaiea", pair.getLeft());
    }

    @Test
    public void testDisemvoweleStringTwo() {
        Disemvoweler disemvoweler = new Disemvoweler();
        Pair<String, String> pair = disemvoweler.disemvowele("did you hear about the excellent farmer who was outstanding in his field");
        assertEquals("ddyhrbtthxcllntfrmrwhwststndngnhsfld", pair.getRight());
        assertEquals("ioueaaoueeeeaeoaouaiiiie", pair.getLeft());
    }

}
