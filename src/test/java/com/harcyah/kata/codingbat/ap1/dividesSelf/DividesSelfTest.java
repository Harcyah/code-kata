package com.harcyah.kata.codingbat.ap1.dividesSelf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DividesSelfTest {

    @Test
    public void testDividesSelf() {
        DividesSelf dividesSelf = new DividesSelf();
        assertTrue(dividesSelf.dividesSelf(128));
        assertTrue(dividesSelf.dividesSelf(12));
        assertFalse(dividesSelf.dividesSelf(120));
        assertTrue(dividesSelf.dividesSelf(122));
        assertFalse(dividesSelf.dividesSelf(13));
        assertFalse(dividesSelf.dividesSelf(32));
        assertTrue(dividesSelf.dividesSelf(22));
        assertFalse(dividesSelf.dividesSelf(42));
        assertTrue(dividesSelf.dividesSelf(212));
        assertFalse(dividesSelf.dividesSelf(213));
        assertTrue(dividesSelf.dividesSelf(162));
    }

}
