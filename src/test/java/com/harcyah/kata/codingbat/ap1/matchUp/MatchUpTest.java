package com.harcyah.kata.codingbat.ap1.matchUp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatchUpTest {

    @Test
    public void testMatchUp() {
        MatchUp matchUp = new MatchUp();
        assertEquals(1, matchUp.matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"aaa", "xx", "bb"}));
        assertEquals(2, matchUp.matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"aaa", "b", "bb"}));
        assertEquals(1, matchUp.matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"", "", "ccc"}));
        assertEquals(1, matchUp.matchUp(new String[]{"", "", "ccc"}, new String[]{"aa", "bb", "cc"}));
        assertEquals(0, matchUp.matchUp(new String[]{"", "", ""}, new String[]{"", "bb", "cc"}));
        assertEquals(0, matchUp.matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"", "", ""}));
        assertEquals(1, matchUp.matchUp(new String[]{"aa", "", "ccc"}, new String[]{"", "bb", "cc"}));
        assertEquals(0, matchUp.matchUp(new String[]{"x", "y", "z"}, new String[]{"y", "z", "x"}));
        assertEquals(1, matchUp.matchUp(new String[]{"", "y", "z"}, new String[]{"", "y", "x"}));
        assertEquals(3, matchUp.matchUp(new String[]{"x", "y", "z"}, new String[]{"xx", "yyy", "zzz"}));
        assertEquals(2, matchUp.matchUp(new String[]{"x", "y", "z"}, new String[]{"xx", "yyy", ""}));
        assertEquals(3, matchUp.matchUp(new String[]{"b", "x", "y", "z"}, new String[]{"a", "xx", "yyy", "zzz"}));
        assertEquals(1, matchUp.matchUp(new String[]{"aaa", "bb", "c"}, new String[]{"aaa", "xx", "bb"}));
    }

}
