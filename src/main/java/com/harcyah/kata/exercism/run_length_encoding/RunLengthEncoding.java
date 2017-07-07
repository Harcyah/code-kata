package com.harcyah.kata.exercism.run_length_encoding;

import java.util.Collections;

public class RunLengthEncoding {

    public String encode(String data) {
        return encode("", data);
    }

    private String encode(String stack, String data) {
        if (data.isEmpty()) {
            return stack;
        }

        String letter = data.substring(0, 1);
        String suffix = data.substring(1);
        int counter = 1;
        while (suffix.startsWith(letter)) {
            counter++;
            suffix = data.substring(counter);
        }

        if (counter == 1) {
            return encode(stack + letter, suffix);
        } else {
            return encode(stack + counter + letter, suffix);
        }
    }

    public String decode(String data) {
        if (data.isEmpty()) {
            return "";
        }

        int index = 0;
        char firstChar = data.charAt(index);
        if (Character.isAlphabetic(firstChar) || Character.isWhitespace(firstChar)) {
            return firstChar + decode(data.substring(1));
        }

        String number = "";
        while (Character.isDigit(data.charAt(index))) {
            number = data.substring(0, index++ + 1);
        }

        int count = Integer.parseInt(number);
        String letter = data.substring(index, index + 1);

        return String.join("", Collections.nCopies(count, letter)) + decode(data.substring(index + 1));
    }

}
