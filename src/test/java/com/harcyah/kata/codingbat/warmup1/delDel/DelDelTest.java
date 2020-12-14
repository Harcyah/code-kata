package com.harcyah.kata.codingbat.warmup1.delDel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DelDelTest {

    @Test
    public void testDelDel() {
        DelDel delDel = new DelDel();
        assertEquals("abc", delDel.delDel("adelbc"));
        assertEquals("aHello", delDel.delDel("adelHello"));
        assertEquals("adedbc", delDel.delDel("adedbc"));
        assertEquals("abcdel", delDel.delDel("abcdel"));
        assertEquals("add", delDel.delDel("add"));
        assertEquals("ad", delDel.delDel("ad"));
        assertEquals("a", delDel.delDel("a"));
        assertEquals("", delDel.delDel(""));
        assertEquals("del", delDel.delDel("del"));
        assertEquals("a", delDel.delDel("adel"));
        assertEquals("aadelbb", delDel.delDel("aadelbb"));
    }

}
