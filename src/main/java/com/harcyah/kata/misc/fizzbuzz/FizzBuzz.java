package com.harcyah.kata.misc.fizzbuzz;

import java.util.LinkedHashSet;
import java.util.Set;

public class FizzBuzz {

    public static void main(String[] args) {
        Set<Filter> filters = new LinkedHashSet<Filter>();
        filters.add(Filter.Filters.MULT_3_5);
        filters.add(Filter.Filters.MULT_3);
        filters.add(Filter.Filters.MULT_5);

        for (int i = 1; i < 101; i++) {
            String label = String.valueOf(i);
            for (Filter filter : filters) {
                if (filter.matches(i)) {
                    label = filter.getLabel();
                    break;
                }
            }
            System.out.println(label);
        }
    }

}
