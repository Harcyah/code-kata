package com.harcyah.kata.misc.diamond;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiamondTest {

    @Test
    public void diamondOfA() throws Exception {
        Diamond diamond = new Diamond();
        String s = diamond.diamondOf('A');
        assertEquals("A", s);
    }

    @Test
    public void diamondOfC() throws Exception {
        Diamond diamond = new Diamond();
        String s = diamond.diamondOf('C');
        assertEquals(
            "  A  " +
            " B B " +
            "C   C" +
            " B B " +
            "  A  ",
            s);
    }

    @Test
    public void diamondOfE() throws Exception {
        Diamond diamond = new Diamond();
        String s = diamond.diamondOf('E');
        assertEquals(
                "    A    " +
                "   B B   " +
                "  C   C  " +
                " D     D " +
                "E       E" +
                " D     D " +
                "  C   C  " +
                "   B B   " +
                "    A    ",
                s);
    }

}
