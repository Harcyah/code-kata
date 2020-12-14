package com.harcyah.kata.codingbat.warmup2.stringYak;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringYakTest {

    @Test
    public void testStringYak() {
        StringYak stringYak = new StringYak();
        assertEquals("pak", stringYak.stringYak("yakpak"));
        assertEquals("pak", stringYak.stringYak("pakyak"));
        assertEquals("123ya", stringYak.stringYak("yak123ya"));
        assertEquals("", stringYak.stringYak("yak"));
        assertEquals("xxx", stringYak.stringYak("yakxxxyak"));
        assertEquals("HiHi", stringYak.stringYak("HiyakHi"));
        assertEquals("xxxyyzzz", stringYak.stringYak("xxxyakyyyakzzz"));
    }

}
