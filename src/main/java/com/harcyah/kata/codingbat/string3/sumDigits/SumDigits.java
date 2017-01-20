package com.harcyah.kata.codingbat.string3.sumDigits;

public class SumDigits {

    public int sumDigits(String source) {
        int sum = 0;
        for (int i = 0; i < source.length(); i++) {
            sum += Character.isDigit(source.charAt(i)) ? Integer.parseInt(source.substring(i, i + 1)) : 0;
        }
        return sum;
    }

}
