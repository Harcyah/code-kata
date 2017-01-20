package com.harcyah.kata.exercism.binary;

public class Binary {

    protected int value = 0;
    protected boolean invalid = false;

    public Binary(String bits) {
        for (int i = 0; i < bits.length(); i++) {
            char c = bits.charAt(i);
            if (c != '0' && c != '1') {
                invalid = true;
            } else {
                int bit = c == '1' ? 1 : 0;
                int pow = bits.length() - i - 1;
                value += bit * Math.pow(2, pow);
            }
        }
    }

    public int getDecimal() {
        return invalid ? 0 : value;
    }

}