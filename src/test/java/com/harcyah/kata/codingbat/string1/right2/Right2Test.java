package com.harcyah.kata.codingbat.string1.right2;

import org.junit.Assert;
import org.junit.Test;

public class Right2Test {

	@Test
	public void testRight2() {
		Right2 right2 = new Right2();
		Assert.assertEquals("loHel", right2.right2("Hello"));
		Assert.assertEquals("vaja", right2.right2("java"));
		Assert.assertEquals("Hi", right2.right2("Hi"));
		Assert.assertEquals("deco", right2.right2("code"));
		Assert.assertEquals("atc", right2.right2("cat"));
		Assert.assertEquals("45123", right2.right2("12345"));
	}

}
