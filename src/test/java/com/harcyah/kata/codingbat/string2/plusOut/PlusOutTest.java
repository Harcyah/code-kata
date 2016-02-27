package com.harcyah.kata.codingbat.string2.plusOut;

import org.junit.Assert;
import org.junit.Test;

public class PlusOutTest {

	@Test
	public void testPlusOut() {
		PlusOut plusOut = new PlusOut();
		Assert.assertEquals("++xy++", plusOut.plusOut("12xy34", "xy"));
		Assert.assertEquals("1+++++", plusOut.plusOut("12xy34", "1"));
		Assert.assertEquals("++xy++xy+++xy", plusOut.plusOut("12xy34xyabcxy", "xy"));
		Assert.assertEquals("ab++ab++++", plusOut.plusOut("abXYabcXYZ", "ab"));
		Assert.assertEquals("++++abc+++", plusOut.plusOut("abXYabcXYZ", "abc"));
		Assert.assertEquals("++XY+++XY+", plusOut.plusOut("abXYabcXYZ", "XY"));
		Assert.assertEquals("+++++++XYZ", plusOut.plusOut("abXYxyzXYZ", "XYZ"));
		Assert.assertEquals("++++++", plusOut.plusOut("--++ab", "++"));
		Assert.assertEquals("++xxxx++", plusOut.plusOut("aaxxxxbb", "xx"));
		Assert.assertEquals("++3++3", plusOut.plusOut("123123", "3"));
	}

}
