package com.harcyah.kata.codingbat.string2.countCode;

import org.junit.Assert;
import org.junit.Test;

public class CountCodeTest {

	@Test
	public void testCountCode() {
		CountCode countCode = new CountCode();
		Assert.assertEquals(1, countCode.countCode("aaacodebbb"));
		Assert.assertEquals(2, countCode.countCode("codexxcode"));
		Assert.assertEquals(2, countCode.countCode("cozexxcope"));
		Assert.assertEquals(1, countCode.countCode("cozfxxcope"));
		Assert.assertEquals(1, countCode.countCode("xxcozeyycop"));
		Assert.assertEquals(0, countCode.countCode("cozcop"));
		Assert.assertEquals(0, countCode.countCode("abcxyz"));
		Assert.assertEquals(1, countCode.countCode("code"));
		Assert.assertEquals(0, countCode.countCode("ode"));
		Assert.assertEquals(0, countCode.countCode("c"));
		Assert.assertEquals(0, countCode.countCode(""));
		Assert.assertEquals(3, countCode.countCode("AAcodeBBcoleCCccoreDD"));
		Assert.assertEquals(2, countCode.countCode("AAcodeBBcoleCCccorfDD"));
		Assert.assertEquals(3, countCode.countCode("coAcodeBcoleccoreDD"));
	}

}
