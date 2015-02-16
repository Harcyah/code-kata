package com.harcyah.kata.codingbat.warmup1.mixStart;

import org.junit.Assert;
import org.junit.Test;

public class MixStartTest {

	@Test
	public void testMixStart() {
		MixStart mixStart = new MixStart();
		Assert.assertTrue(mixStart.mixStart("mix snacks"));
		Assert.assertTrue(mixStart.mixStart("pix snacks"));
		Assert.assertFalse(mixStart.mixStart("piz snacks"));
		Assert.assertTrue(mixStart.mixStart("nix"));
		Assert.assertFalse(mixStart.mixStart("ni"));
		Assert.assertFalse(mixStart.mixStart("n"));
		Assert.assertFalse(mixStart.mixStart(""));
	}

}