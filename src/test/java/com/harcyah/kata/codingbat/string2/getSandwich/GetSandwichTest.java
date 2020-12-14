package com.harcyah.kata.codingbat.string2.getSandwich;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetSandwichTest {

    @Test
    public void testGetSandwich() {
        GetSandwich getSandwich = new GetSandwich();
        assertEquals("jam", getSandwich.getSandwich("breadjambread"));
        assertEquals("jam", getSandwich.getSandwich("xxbreadjambreadyy"));
        assertEquals("", getSandwich.getSandwich("xxbreadyy"));
        assertEquals("breadjam", getSandwich.getSandwich("xxbreadbreadjambreadyy"));
        assertEquals("A", getSandwich.getSandwich("breadAbread"));
        assertEquals("", getSandwich.getSandwich("breadbread"));
        assertEquals("", getSandwich.getSandwich("abcbreaz"));
        assertEquals("", getSandwich.getSandwich("xyz"));
        assertEquals("", getSandwich.getSandwich(""));
        assertEquals("breax", getSandwich.getSandwich("breadbreaxbread"));
        assertEquals("y", getSandwich.getSandwich("breaxbreadybread"));
        assertEquals("breadbread", getSandwich.getSandwich("breadbreadbreadbread"));
    }

}
