package com.harcyah.kata.exercism.luhn;

import lombok.Getter;

@Getter
public class Luhn {

    private static final int ZERO = 48;

    private final String addends;
    private final int checkSum;
    private final long checkDigit;
    private final boolean valid;

    public Luhn(long value) {
        int digits = (int) Math.log10(value) + 1;
        StringBuilder sb = new StringBuilder(" ".repeat(digits));
        String valueAsString = String.valueOf(value);

        int checksum = 0;
        for (int i = 0; i < digits; i++) {
            int index = digits - i - 1;
            int digit = Character.getNumericValue(valueAsString.charAt(index));
            int check;
            if ((i & 1) == 1) {
                int doubledDigit = digit * 2;
                check = doubledDigit > 10 ? doubledDigit - 9 : doubledDigit;
            } else {
                check = digit;
            }
            sb.setCharAt(index, (char) (ZERO + check));
            checksum += check;
        }

        this.addends = sb.toString();
        this.checkSum = checksum;
        this.checkDigit = value % 10;
        this.valid = checkSum % 10 == 0;
    }

    public static long create(long value) {
        for (int i = 0; i < 10; i++) {
            long test = value * 10 + i;
            if (new Luhn(test).isValid()) {
                return test;
            }
        }
        throw new UnsupportedOperationException();
    }

}
