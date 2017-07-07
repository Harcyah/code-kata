package com.harcyah.kata.exercism.transpose;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Transpose {

    private static final String SEP = "\n";
    private static final char DEFAULT = ' ';

    public String transpose(String input) {
        String[] lines = input.split(SEP);
        int w = Arrays.stream(lines).map(String::length).max(Integer::compare).get();
        int h = lines.length;
        char[][] source = toCharArray(lines, w, h);
        return Arrays.stream(source).map(String::new).collect(Collectors.joining(SEP)).trim();
    }

    private char[][] toCharArray(String[] lines, int width, int height) {
        char[][] array = new char[width][height];
        for (int x=0; x<width; x++) {
            for (int y=0; y<height; y++) {
                char c = tryGet(lines, x, y);
                array[x][y] = c;
            }
        }
        return array;
    }

    private char tryGet(String[] lines, int x, int y) {
        if (y > lines.length - 1) {
            return DEFAULT;
        }

        String line = lines[y];
        if (x > line.length() - 1) {
            return DEFAULT;
        }

        return line.charAt(x);
    }

}

