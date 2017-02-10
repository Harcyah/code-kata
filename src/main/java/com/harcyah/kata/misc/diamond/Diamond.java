package com.harcyah.kata.misc.diamond;

import com.google.common.base.Joiner;

import java.util.Arrays;

public class Diamond {

    public String diamondOf(char letter) {
        int number = letter - 'A' + 1;
        int size = 2 * (number - 1) + 1;

        String[] lines = new String[size];
        for (int i=0; i<size / 2 + 1; i++) {
            char c = (char) ('A' + i);

            int leftPosition = size / 2 + 1 - i - 1;
            int rightPosition = size - leftPosition - 1;
            char[] buffer = new char[size];
            Arrays.fill(buffer, ' ');
            buffer[leftPosition] = c;
            buffer[rightPosition] = c;
            String line = new String(buffer);

            lines[i] = line;
            lines[size - 1 - i] = line;
        }

        return Joiner.on("").join(lines);
    }

}
