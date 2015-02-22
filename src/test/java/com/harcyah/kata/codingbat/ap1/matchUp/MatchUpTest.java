package com.harcyah.kata.codingbat.ap1.matchUp;

import org.junit.Assert;
import org.junit.Test;

public class MatchUpTest {

	@Test
	public void testMatchUp() {
		MatchUp matchUp = new MatchUp();
		Assert.assertEquals(1, matchUp.matchUp(new String[] { "aa", "bb", "cc" }, new String[] { "aaa", "xx", "bb" }));
		Assert.assertEquals(2, matchUp.matchUp(new String[] { "aa", "bb", "cc" }, new String[] { "aaa", "b", "bb" }));
		Assert.assertEquals(1, matchUp.matchUp(new String[] { "aa", "bb", "cc" }, new String[] { "", "", "ccc" }));
		Assert.assertEquals(1, matchUp.matchUp(new String[] { "", "", "ccc" }, new String[] { "aa", "bb", "cc" }));
		Assert.assertEquals(0, matchUp.matchUp(new String[] { "", "", "" }, new String[] { "", "bb", "cc" }));
		Assert.assertEquals(0, matchUp.matchUp(new String[] { "aa", "bb", "cc" }, new String[] { "", "", "" }));
		Assert.assertEquals(1, matchUp.matchUp(new String[] { "aa", "", "ccc" }, new String[] { "", "bb", "cc" }));
		Assert.assertEquals(0, matchUp.matchUp(new String[] { "x", "y", "z" }, new String[] { "y", "z", "x" }));
		Assert.assertEquals(1, matchUp.matchUp(new String[] { "", "y", "z" }, new String[] { "", "y", "x" }));
		Assert.assertEquals(3, matchUp.matchUp(new String[] { "x", "y", "z" }, new String[] { "xx", "yyy", "zzz" }));
		Assert.assertEquals(2, matchUp.matchUp(new String[] { "x", "y", "z" }, new String[] { "xx", "yyy", "" }));
		Assert.assertEquals(3, matchUp.matchUp(new String[] { "b", "x", "y", "z" }, new String[] { "a", "xx", "yyy", "zzz" }));
		Assert.assertEquals(1, matchUp.matchUp(new String[] { "aaa", "bb", "c" }, new String[] { "aaa", "xx", "bb" }));
	}

}
