package com.harcyah.kata.pape;

import org.junit.Assert;
import org.junit.Test;

import com.harcyah.kata.pape.BytesRepresentation.Unit;

public class BytesRepresentationTest {

	protected BytesRepresentation br = new BytesRepresentation();

	@Test
	public void testBytes() {
		Assert.assertEquals("123.0 Byte", br.toBytesString(Unit.Byte, 123));
		Assert.assertEquals("123.0 Byte", br.toBytesString(123));
	}

	@Test
	public void testKyloBytes() {
		Assert.assertEquals("15.323 KByte", br.toBytesString(Unit.KByte, 15323));
		Assert.assertEquals("15.323 KByte", br.toBytesString(15323));
	}

	@Test
	public void testMegaBytes() {
		Assert.assertEquals("15.323 MByte", br.toBytesString(Unit.MByte, 15323000));
		Assert.assertEquals("15.323 MByte", br.toBytesString(15323000));
	}

	@Test
	public void testGigaBytes() {
		Assert.assertEquals("1.532300001 GByte", br.toBytesString(Unit.GByte, 1532300001));
		Assert.assertEquals("1.532300001 GByte", br.toBytesString(1532300001));
	}

}
