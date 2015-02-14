package com.harcyah.kata.codingbat.warmup1.endUp;

import org.junit.Assert;
import org.junit.Test;

public class EndUpTest {

	@Test
	public void testEndUp() {
		EndUp endUp = new EndUp();
		Assert.assertEquals("HeLLO", endUp.endUp("Hello"));
		Assert.assertEquals("hi thERE", endUp.endUp("hi there"));
		Assert.assertEquals("HI", endUp.endUp("hi"));
		Assert.assertEquals("woo HOO", endUp.endUp("woo hoo"));
		Assert.assertEquals("xyZ12", endUp.endUp("xyz12"));
		Assert.assertEquals("X", endUp.endUp("x"));
		Assert.assertEquals("", endUp.endUp(""));
	}

}