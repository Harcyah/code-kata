package com.harcyah.kata.exercism.simple_cipher;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class IncorrectKeyCipherTest {

    @Test
    public void cipherThrowsWithAllCapsKey() {
        assertThatThrownBy(() -> new Cipher("ABCDEF"))
            .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void cipherThrowsWithAnyCapsKey() {
        assertThatThrownBy(() -> new Cipher("abcdEFg"))
            .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void cipherThrowsWithNumericKey() {
        assertThatThrownBy(() -> new Cipher("12345"))
            .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void cipherThrowsWithAnyNumericKey() {
        assertThatThrownBy(() -> new Cipher("abcd345ef"))
            .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void cipherThrowsWithEmptyKey() {
        assertThatThrownBy(() -> new Cipher(""))
            .isInstanceOf(IllegalArgumentException.class);
    }

}
