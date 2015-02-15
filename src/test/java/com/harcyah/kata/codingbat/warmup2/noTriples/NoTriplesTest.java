package com.harcyah.kata.codingbat.warmup2.noTriples;

import org.junit.Assert;
import org.junit.Test;

public class NoTriplesTest {

	@Test
	public void testNoTriples() {
		NoTriples noTriples = new NoTriples();
		Assert.assertEquals(true, noTriples.noTriples(new int[] { 1, 1, 2, 2, 1 }));
		Assert.assertEquals(false, noTriples.noTriples(new int[] { 1, 1, 2, 2, 2, 1 }));
		Assert.assertEquals(false, noTriples.noTriples(new int[] { 1, 1, 1, 2, 2, 2, 1 }));
		Assert.assertEquals(true, noTriples.noTriples(new int[] { 1, 1, 2, 2, 1, 2, 1 }));
		Assert.assertEquals(true, noTriples.noTriples(new int[] { 1, 2, 1 }));
		Assert.assertEquals(false, noTriples.noTriples(new int[] { 1, 1, 1 }));
		Assert.assertEquals(true, noTriples.noTriples(new int[] { 1, 1 }));
		Assert.assertEquals(true, noTriples.noTriples(new int[] { 1 }));
		Assert.assertEquals(true, noTriples.noTriples(new int[] {}));
	}
}
