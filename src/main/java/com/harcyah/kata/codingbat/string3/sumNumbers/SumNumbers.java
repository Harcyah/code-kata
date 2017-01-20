package com.harcyah.kata.codingbat.string3.sumNumbers;

public class SumNumbers {

    public int sumNumbers(String source) {
        int sum = 0;
        StringBuffer accumulator = new StringBuffer();
        for (int i = 0; i < source.length(); i++) {
            char c = source.charAt(i);
            if (Character.isDigit(c)) {
                accumulator.append(c);
            } else {
                if (accumulator.length() > 0) {
                    sum += Integer.parseInt(accumulator.toString());
                    accumulator = new StringBuffer();
                }
            }
        }
        if (accumulator.length() > 0) {
            sum += Integer.parseInt(accumulator.toString());
        }
        return sum;
    }

}
