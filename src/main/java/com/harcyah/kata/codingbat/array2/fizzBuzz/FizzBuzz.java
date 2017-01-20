package com.harcyah.kata.codingbat.array2.fizzBuzz;

public class FizzBuzz {

    public String[] fizzBuzz(int start, int end) {
        int l = end - start;
        String[] out = new String[l];
        for (int i = 0; i < l; i++) {
            int value = start + i;
            out[i] = "";

            if (value % 3 == 0) {
                out[i] += "Fizz";
            }

            if (value % 5 == 0) {
                out[i] += "Buzz";
            }

            if (out[i].length() == 0) {
                out[i] = String.valueOf(value);
            }
        }
        return out;
    }

}
