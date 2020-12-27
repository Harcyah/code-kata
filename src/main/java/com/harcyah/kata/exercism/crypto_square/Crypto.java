package com.harcyah.kata.exercism.crypto_square;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Crypto {

    private final String normalized;
    private final int cols;
    private final int rows;
    private final char[][] plainSegments;

    public Crypto(String plain) {
        this.normalized = getNormalized(plain);

        double sqrt = Math.sqrt(normalized.length());
        if (sqrt == Math.rint(sqrt)) {
            this.cols = (int) sqrt;
            this.rows = (int) sqrt;
        } else {
            this.cols = (int) Math.floor(sqrt) + 1;
            this.rows = (int) Math.ceil(normalized.length() / (float) cols);
        }

        this.plainSegments = buildPlainSegments(cols, rows, normalized);
    }

    private String getNormalized(String plain) {
        StringBuilder sb = new StringBuilder();
        for (char c : plain.toCharArray()) {
            if (Character.isAlphabetic(c) || Character.isDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }

    private char[][] buildPlainSegments(int cols, int rows, String str) {
        char[][] array = new char[rows][];
        for (int i = 0; i < rows; i++) {
            array[i] = new char[cols];
            Arrays.fill(array[i], ' ');
            int start = i * cols;
            int end = Math.min((i + 1) * cols, str.length());
            char[] line = str.substring(start, end).toCharArray();
            System.arraycopy(line, 0, array[i], 0, line.length);
        }
        return array;
    }

    public String getNormalizedPlaintext() {
        return normalized;
    }

    public int getSquareSize() {
        return cols;
    }

    public List<String> getPlaintextSegments() {
        List<String> segments = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            String segment = new String(plainSegments[i]).trim();
            if (!segment.isEmpty()) {
                segments.add(segment);
            }
        }
        return segments;
    }

    public String getCipherText() {
        return getCipherText(false);
    }

    public String getCipherText(boolean keepSpaces) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                char c = plainSegments[j][i];
                if (keepSpaces || Character.isAlphabetic(c)) {
                    sb.append(c);
                }
            }
        }
        return sb.toString().trim();
    }

    public String getNormalizedCipherText() {
        String cipher = getCipherText(true);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cipher.length(); i++) {
            sb.append(cipher.charAt(i));
            int index = i + 1;
            if (index > 0 && index % (cols - 1) == 0) {
                sb.append(" ");
            }
        }
        return sb.toString().replaceAll("\\s+", " ").trim();
    }

}
