package com.harcyah.kata.misc.fizzbuzz;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FizzBuzz {

    public List<String> run() {
        Set<Filter> filters = new LinkedHashSet<>();
        filters.add(Filter.Filters.MULT_3_5);
        filters.add(Filter.Filters.MULT_3);
        filters.add(Filter.Filters.MULT_5);

        List<String> results = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            String label = String.valueOf(i);
            for (Filter filter : filters) {
                if (filter.matches(i)) {
                    label = filter.getLabel();
                    break;
                }
            }
            results.add(label);
        }
        return results;
    }

}
