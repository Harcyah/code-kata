package com.harcyah.kata.codingbat.string2.getSandwich;

public class GetSandwich {

    private static final String BREAD = "bread";
    private static final int LENGTH = BREAD.length();

    public String getSandwich(String source) {
        int firstIndex = source.indexOf(BREAD);
        if (firstIndex < 0) {
            return "";
        }

        String suffix = source.substring(firstIndex + LENGTH);
        int secondIndex = suffix.lastIndexOf(BREAD);
        if (secondIndex < 0) {
            return "";
        }

        return suffix.substring(0, secondIndex);
    }

}
