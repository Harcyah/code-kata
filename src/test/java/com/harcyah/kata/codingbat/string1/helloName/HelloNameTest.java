package com.harcyah.kata.codingbat.string1.helloName;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloNameTest {

    @Test
    public void testHelloName() {
        HelloName helloName = new HelloName();
        assertEquals("Hello Bob!", helloName.helloName("Bob"));
        assertEquals("Hello Alice!", helloName.helloName("Alice"));
        assertEquals("Hello X!", helloName.helloName("X"));
        assertEquals("Hello Dolly!", helloName.helloName("Dolly"));
        assertEquals("Hello Alpha!", helloName.helloName("Alpha"));
        assertEquals("Hello Omega!", helloName.helloName("Omega"));
        assertEquals("Hello Goodbye!", helloName.helloName("Goodbye"));
        assertEquals("Hello ho ho ho!", helloName.helloName("ho ho ho"));
        assertEquals("Hello xyz!!", helloName.helloName("xyz!"));
        assertEquals("Hello Hello!", helloName.helloName("Hello"));
    }

}
