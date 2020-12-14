package com.harcyah.kata.exercism.run_length_encoding;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RunLengthEncodingTest {
    private RunLengthEncoding runLengthEncoding;

    @BeforeEach
    public void setUp() {
        runLengthEncoding = new RunLengthEncoding();
    }

    @Test
    public void encodeEmpty() {
        assertEquals("", runLengthEncoding.encode(""));
    }

    @Test
    public void encodeWithOnlySingleValues() {
        assertEquals("XYZ", runLengthEncoding.encode("XYZ"));
    }

    @Test
    public void encodeWithNoSingleValues() {
        assertEquals("2A3B4C", runLengthEncoding.encode("AABBBCCCC"));
    }

    @Test
    public void encodeWithMixedValues() {
        assertEquals("12WB12W3B24WB", runLengthEncoding.encode("WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWB"));
    }

    @Test
    public void encodeWithWhitespaceValues() {
        assertEquals("2 hs2q q2w2 ", runLengthEncoding.encode("  hsqq qww  "));
    }

    @Test
    public void encodeWithLowercaseValues() {
        assertEquals("2a3b4c", runLengthEncoding.encode("aabbbcccc"));
    }

    @Test
    public void decodeEmpty() {
        assertEquals("", runLengthEncoding.decode(""));
    }

    @Test
    public void decodeWithOnlySingleValues() {
        assertEquals("XYZ", runLengthEncoding.decode("XYZ"));
    }

    @Test
    public void decodeWithNoSingleValues() {
        assertEquals("AABBBCCCC", runLengthEncoding.decode("2A3B4C"));
    }

    @Test
    public void decodeWithMixedValues() {
        assertEquals("WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWB", runLengthEncoding.decode("12WB12W3B24WB"));
    }

    @Test
    public void decodeWithWhitespaceValues() {
        assertEquals("  hsqq qww  ", runLengthEncoding.decode("2 hs2q q2w2 "));
    }

    @Test
    public void decodeWithLowercaseValues() {
        assertEquals("aabbbcccc", runLengthEncoding.decode("2a3b4c"));
    }

    @Test
    public void encodeThenDecode() {
        String inOut = "zzz ZZ  zZ";
        String encoded = runLengthEncoding.encode(inOut);
        assertEquals(inOut, runLengthEncoding.decode(encoded));
    }

}
