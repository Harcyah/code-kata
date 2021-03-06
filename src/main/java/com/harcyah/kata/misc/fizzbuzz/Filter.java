package com.harcyah.kata.misc.fizzbuzz;

public interface Filter {

    boolean matches(int i);

    String getLabel();

    enum Filters implements Filter {

        MULT_3_5 {
            @Override
            public boolean matches(int i) {
                return MULT_3.matches(i) && MULT_5.matches(i);
            }

            @Override
            public String getLabel() {
                return MULT_3.getLabel() + MULT_5.getLabel();
            }

        },

        MULT_3 {
            @Override
            public boolean matches(int i) {
                return i % 3 == 0;
            }

            @Override
            public String getLabel() {
                return "Fizz";
            }

        },

        MULT_5 {
            @Override
            public boolean matches(int i) {
                return i % 5 == 0;
            }

            @Override
            public String getLabel() {
                return "Buzz";
            }

        }

    }

}
