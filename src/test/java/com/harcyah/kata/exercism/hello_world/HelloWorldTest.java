package com.harcyah.kata.exercism.hello_world;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

    @Test
    public void helloNoName() {
        assertEquals("Hello, World!", HelloWorld.hello(""));
        assertEquals("Hello, World!", HelloWorld.hello(null));
    }

    @Test
    public void helloSampleName() {
        assertEquals("Hello, Alice!", HelloWorld.hello("Alice"));
    }

    @Test
    public void helloAnotherSampleName() {
        assertEquals("Hello, Bob!", HelloWorld.hello("Bob"));
    }

}
