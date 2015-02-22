package com.harcyah.kata.codingbat.ap1.dividesSelf;

import org.junit.Assert;
import org.junit.Test;

public class DividesSelfTest {

	@Test
	public void testDividesSelf() {
		DividesSelf dividesSelf = new DividesSelf();
		Assert.assertEquals(true, dividesSelf.dividesSelf(128));
		Assert.assertEquals(true, dividesSelf.dividesSelf(12));
		Assert.assertEquals(false, dividesSelf.dividesSelf(120));
		Assert.assertEquals(true, dividesSelf.dividesSelf(122));
		Assert.assertEquals(false, dividesSelf.dividesSelf(13));
		Assert.assertEquals(false, dividesSelf.dividesSelf(32));
		Assert.assertEquals(true, dividesSelf.dividesSelf(22));
		Assert.assertEquals(false, dividesSelf.dividesSelf(42));
		Assert.assertEquals(true, dividesSelf.dividesSelf(212));
		Assert.assertEquals(false, dividesSelf.dividesSelf(213));
		Assert.assertEquals(true, dividesSelf.dividesSelf(162));
	}

}
