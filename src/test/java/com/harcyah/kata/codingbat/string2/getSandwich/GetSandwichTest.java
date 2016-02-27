package com.harcyah.kata.codingbat.string2.getSandwich;

import org.junit.Assert;
import org.junit.Test;

public class GetSandwichTest {

	@Test
	public void testGetSandwich() {
		GetSandwich getSandwich = new GetSandwich();
		Assert.assertEquals("jam", getSandwich.getSandwich("breadjambread"));
		Assert.assertEquals("jam", getSandwich.getSandwich("xxbreadjambreadyy"));
		Assert.assertEquals("", getSandwich.getSandwich("xxbreadyy"));
		Assert.assertEquals("breadjam", getSandwich.getSandwich("xxbreadbreadjambreadyy"));
		Assert.assertEquals("A", getSandwich.getSandwich("breadAbread"));
		Assert.assertEquals("", getSandwich.getSandwich("breadbread"));
		Assert.assertEquals("", getSandwich.getSandwich("abcbreaz"));
		Assert.assertEquals("", getSandwich.getSandwich("xyz"));
		Assert.assertEquals("", getSandwich.getSandwich(""));
		Assert.assertEquals("breax", getSandwich.getSandwich("breadbreaxbread"));
		Assert.assertEquals("y", getSandwich.getSandwich("breaxbreadybread"));
		Assert.assertEquals("breadbread", getSandwich.getSandwich("breadbreadbreadbread"));
	}

}
