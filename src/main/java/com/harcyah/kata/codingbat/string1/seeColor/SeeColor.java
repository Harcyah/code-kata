package com.harcyah.kata.codingbat.string1.seeColor;

public class SeeColor {

    public String seeColor(String str) {
        String[] colors = new String[]{"red", "blue"};
        for (String color : colors) {
            if (str.startsWith(color)) {
                return color;
            }
        }
        return "";
    }

}
