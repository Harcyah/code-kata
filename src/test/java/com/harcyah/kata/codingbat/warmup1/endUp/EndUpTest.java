package com.harcyah.kata.codingbat.warmup1.endUp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EndUpTest {

    @Test
    public void testEndUp() {
        EndUp endUp = new EndUp();
        assertEquals("HeLLO", endUp.endUp("Hello"));
        assertEquals("hi thERE", endUp.endUp("hi there"));
        assertEquals("HI", endUp.endUp("hi"));
        assertEquals("woo HOO", endUp.endUp("woo hoo"));
        assertEquals("xyZ12", endUp.endUp("xyz12"));
        assertEquals("X", endUp.endUp("x"));
        assertEquals("", endUp.endUp(""));
    }

}
