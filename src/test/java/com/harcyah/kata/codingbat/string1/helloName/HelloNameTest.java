package com.harcyah.kata.codingbat.string1.helloName;

import org.junit.Assert;
import org.junit.Test;

public class HelloNameTest {

    @Test
    public void testHelloName() {
        HelloName helloName = new HelloName();
        Assert.assertEquals("Hello Bob!", helloName.helloName("Bob"));
        Assert.assertEquals("Hello Alice!", helloName.helloName("Alice"));
        Assert.assertEquals("Hello X!", helloName.helloName("X"));
        Assert.assertEquals("Hello Dolly!", helloName.helloName("Dolly"));
        Assert.assertEquals("Hello Alpha!", helloName.helloName("Alpha"));
        Assert.assertEquals("Hello Omega!", helloName.helloName("Omega"));
        Assert.assertEquals("Hello Goodbye!", helloName.helloName("Goodbye"));
        Assert.assertEquals("Hello ho ho ho!", helloName.helloName("ho ho ho"));
        Assert.assertEquals("Hello xyz!!", helloName.helloName("xyz!"));
        Assert.assertEquals("Hello Hello!", helloName.helloName("Hello"));
    }

}
