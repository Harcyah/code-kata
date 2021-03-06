package com.harcyah.kata.exercism.simple_cipher;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubstitutionCipherTest {

    private static final String KEY = "abcdefghij";
    private Cipher cipher;

    @BeforeEach
    public void setup() {
        this.cipher = new Cipher(KEY);
    }

    @Test
    public void cipherKeepsTheSubmittedKey() {
        assertEquals(KEY, cipher.getKey());
    }

    @Test
    public void cipherCanEncodeWithGivenKey() {
        String expectedOutput = "abcdefghij";

        assertEquals(expectedOutput, cipher.encode("aaaaaaaaaa"));
    }

    @Test
    public void cipherCanDecodeWithGivenKey() {
        String expectedOutput = "aaaaaaaaaa";

        assertEquals(expectedOutput, cipher.decode("abcdefghij"));
    }

    @Test
    public void cipherIsReversibleGivenKey() {
        String plainText = "abcdefghij";

        assertEquals(plainText, cipher.decode(cipher.encode("abcdefghij")));
    }

    @Test
    public void cipherCanDoubleShiftEncode() {
        String plainText = "iamapandabear";
        String expectedOutput = "qayaeaagaciai";

        assertEquals(expectedOutput, new Cipher(plainText).encode(plainText));
    }

    @Test
    public void cipherCanWrapEncode() {
        String expectedOutput = "zabcdefghi";

        assertEquals(expectedOutput, cipher.encode("zzzzzzzzzz"));
    }

    @Test
    public void cipherCanEncodeMessageThatIsShorterThanTheKey() {
        String expectedOutput = "abcde";

        assertEquals(expectedOutput, cipher.encode("aaaaa"));
    }

    @Test
    public void cipherCanDecodeMessageThatIsShorterThanTheKey() {
        String expectedOutput = "aaaaa";

        assertEquals(expectedOutput, cipher.decode("abcde"));
    }

}
