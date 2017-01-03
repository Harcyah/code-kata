package com.harcyah.kata.exercism.all_your_base;

final class BaseConverter {

    private static final int[] ZERO = new int[] { 0 };
    private final int valueBase10;

    public BaseConverter(int base, int[] digits) {
        if (base < 2) {
            throw new IllegalArgumentException("Bases must be at least 2.");
        }
        if (digits.length == 0) {
            throw new IllegalArgumentException("You must supply at least one digit.");
        }
        for (int digit : digits) {
            if (digit >= base) {
                throw new IllegalArgumentException("All digits must be strictly less than the base.");
            }
            if (digit < 0) {
                throw new IllegalArgumentException("Digits may not be negative.");
            }
        }

        int leadingZeroes = 0;
        int acc = 0;
        for (int i=0; i<digits.length; i++) {
            int pow = digits.length - i - 1;
            int digit = digits[i];
            acc += digit * Math.pow(base, pow);
            if (digit == 0 && acc == 0) {
                leadingZeroes++;
            }
        }

        if (leadingZeroes > 0 && digits.length > 1) {
            throw new IllegalArgumentException("Digits may not contain leading zeros.");
        }

        this.valueBase10 = acc;
    }

    public int[] convertToBase(int base) {
        if (base < 2) {
            throw new IllegalArgumentException("Bases must be at least 2.");
        }
        if (valueBase10 == 0) {
            return ZERO;
        }

        int length = (int) (Math.log(valueBase10) / Math.log(base)) + 1;
        int index = length - 1;
        int[] digits = new int[length];
        int copy = valueBase10;

        while (copy >= base) {
            int q = copy / base;
            int r = copy % base;
            digits[index] = r;
            index--;
            copy = q;
        }
        digits[index] = copy;

        return digits;
    }

}
