package com.harcyah.kata.reddit.easy_2015_01_12;

import org.junit.Assert;
import org.junit.Test;

public class ISBNValidatorTest {

	@Test
	public void testValidatorSuccess() {
		ISBNValidator isbn = new ISBNValidator();
		Assert.assertTrue(isbn.isValid("1-84356-028-3"));
		Assert.assertTrue(isbn.isValid("0-684-84328-5"));
		Assert.assertTrue(isbn.isValid("0-8044-2957-X"));
		Assert.assertTrue(isbn.isValid("0-85131-041-9"));
		Assert.assertTrue(isbn.isValid("0-943396-04-2"));
		Assert.assertTrue(isbn.isValid("0-9752298-0-X"));
	}

	@Test
	public void testValidatorFailure() {
		ISBNValidator isbn = new ISBNValidator();
		Assert.assertFalse(isbn.isValid("2-84356-028-3"));
		Assert.assertFalse(isbn.isValid("0-784-84328-5"));
		Assert.assertFalse(isbn.isValid("0-9044-2957-X"));
		Assert.assertFalse(isbn.isValid("0-95131-041-9"));
		Assert.assertFalse(isbn.isValid("0-443396-04-2"));
		Assert.assertFalse(isbn.isValid("0-7752298-0-X"));
	}

}
