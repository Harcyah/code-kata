package com.harcyah.kata.exercism.octal;

public class Octal {

    private int decimal;

    public Octal(String octal) {
        this.decimal = 0;

        for (int i = 0; i < octal.length(); i++) {
            char c = octal.charAt(i);
            if (!Character.isDigit(c) || c == '8' || c == '9') {
                decimal = 0;
                break;
            }

            int digit = Character.getNumericValue(c);
            decimal += digit * Math.pow(8, octal.length() - i - 1);
        }
    }

    public int getDecimal() {
        return decimal;
    }

}
