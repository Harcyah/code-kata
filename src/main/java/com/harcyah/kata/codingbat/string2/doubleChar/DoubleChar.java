package com.harcyah.kata.codingbat.string2.doubleChar;

public class DoubleChar {

    public String doubleChar(String str) {
        StringBuffer buffer = new StringBuffer();
        for (char c : str.toCharArray()) {
            buffer.append(c).append(c);
        }
        return buffer.toString();
    }

}
