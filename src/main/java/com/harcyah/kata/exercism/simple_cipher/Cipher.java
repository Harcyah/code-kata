package com.harcyah.kata.exercism.simple_cipher;

import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cipher {

    private static final Pattern PATTERN = Pattern.compile("[a-z]+");
    private static final Random RANDOM = new Random(System.currentTimeMillis());
    private static final char[] ALPHABET = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    protected final String key;

    public Cipher(String key) {
        Matcher matcher = PATTERN.matcher(key);
        if (matcher.matches() == false) {
            throw new IllegalArgumentException();
        }
        this.key = key;
    }

    public Cipher() {
        this.key = random(100);
    }

    private String random(int length) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            char random = (char) (97 + RANDOM.nextInt(25));
            sb.append(random);
        }
        return sb.toString();
    }

    public String getKey() {
        return key;
    }

    public String decode(String ciphertext) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ciphertext.length(); i++) {
            char p = ciphertext.charAt(i);
            int cipher = Arrays.binarySearch(ALPHABET, p);
            int plain = getOffset(i);
            int index = cipher - plain;
            if (index < 0) {
                index += ALPHABET.length;
            }
            sb.append(ALPHABET[index]);
        }
        return sb.toString();
    }

    public String encode(String plaintext) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < plaintext.length(); i++) {
            char p = plaintext.charAt(i);
            int plain = Arrays.binarySearch(ALPHABET, p);
            int cipher = getOffset(i);
            int index = plain + cipher;
            if (index >= ALPHABET.length) {
                index -= ALPHABET.length;
            }
            sb.append(ALPHABET[index]);
        }
        return sb.toString();
    }

    protected int getOffset(int index) {
        char c = key.charAt(index);
        return Arrays.binarySearch(ALPHABET, c);
    }

}
