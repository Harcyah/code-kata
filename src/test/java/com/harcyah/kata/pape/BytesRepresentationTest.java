package com.harcyah.kata.pape;

import com.harcyah.kata.pape.BytesRepresentation.Unit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BytesRepresentationTest {

    protected BytesRepresentation br = new BytesRepresentation();

    @Test
    public void testBytes() {
        assertEquals("123.0 Byte", br.toBytesString(Unit.Byte, 123));
        assertEquals("123.0 Byte", br.toBytesString(123));
    }

    @Test
    public void testKyloBytes() {
        assertEquals("15.323 KByte", br.toBytesString(Unit.KByte, 15323));
        assertEquals("15.323 KByte", br.toBytesString(15323));
    }

    @Test
    public void testMegaBytes() {
        assertEquals("15.323 MByte", br.toBytesString(Unit.MByte, 15323000));
        assertEquals("15.323 MByte", br.toBytesString(15323000));
    }

    @Test
    public void testGigaBytes() {
        assertEquals("1.532300001 GByte", br.toBytesString(Unit.GByte, 1532300001));
        assertEquals("1.532300001 GByte", br.toBytesString(1532300001));
    }

}
