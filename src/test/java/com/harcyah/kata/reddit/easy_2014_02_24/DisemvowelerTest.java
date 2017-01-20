package com.harcyah.kata.reddit.easy_2014_02_24;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.Assert;
import org.junit.Test;

public class DisemvowelerTest {

    @Test
    public void testDisemvoweleStringOne() throws Exception {
        Disemvoweler disemvoweler = new Disemvoweler();
        Pair<String, String> pair = disemvoweler.disemvowele("all those who believe in psychokinesis raise my hand");
        Assert.assertEquals("llthswhblvnpsychknssrsmyhnd", pair.getRight());
        Assert.assertEquals("aoeoeieeioieiaiea", pair.getLeft());
    }

    @Test
    public void testDisemvoweleStringTwo() throws Exception {
        Disemvoweler disemvoweler = new Disemvoweler();
        Pair<String, String> pair = disemvoweler.disemvowele("did you hear about the excellent farmer who was outstanding in his field");
        Assert.assertEquals("ddyhrbtthxcllntfrmrwhwststndngnhsfld", pair.getRight());
        Assert.assertEquals("ioueaaoueeeeaeoaouaiiiie", pair.getLeft());
    }

}
