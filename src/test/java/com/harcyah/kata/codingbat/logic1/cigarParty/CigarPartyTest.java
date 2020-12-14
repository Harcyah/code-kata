package com.harcyah.kata.codingbat.logic1.cigarParty;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CigarPartyTest {

    @Test
    public void testCigarParty() {
        CigarParty cigarParty = new CigarParty();
        assertFalse(cigarParty.cigarParty(30, false));
        assertTrue(cigarParty.cigarParty(50, false));
        assertTrue(cigarParty.cigarParty(70, true));
        assertFalse(cigarParty.cigarParty(30, true));
        assertTrue(cigarParty.cigarParty(50, true));
        assertTrue(cigarParty.cigarParty(60, false));
        assertFalse(cigarParty.cigarParty(61, false));
        assertTrue(cigarParty.cigarParty(40, false));
        assertFalse(cigarParty.cigarParty(39, false));
        assertTrue(cigarParty.cigarParty(40, true));
        assertFalse(cigarParty.cigarParty(39, true));
    }

}
