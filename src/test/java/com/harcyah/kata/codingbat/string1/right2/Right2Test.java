package com.harcyah.kata.codingbat.string1.right2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Right2Test {

    @Test
    public void testRight2() {
        Right2 right2 = new Right2();
        assertEquals("loHel", right2.right2("Hello"));
        assertEquals("vaja", right2.right2("java"));
        assertEquals("Hi", right2.right2("Hi"));
        assertEquals("deco", right2.right2("code"));
        assertEquals("atc", right2.right2("cat"));
        assertEquals("45123", right2.right2("12345"));
    }

}
