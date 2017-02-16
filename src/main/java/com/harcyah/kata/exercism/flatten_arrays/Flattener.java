package com.harcyah.kata.exercism.flatten_arrays;

import java.util.ArrayList;
import java.util.List;

final class Flattener {

    public List<Object> flatten(List<Object> original) {
        List<Object> out = new ArrayList<>();
        for (Object o : original) {
            add(out, o);
        }
        return out;
    }

    private void add(List<Object> out, Object input) {
        if (input == null) {
            return;
        }

        if (input instanceof List) {
            List<Object> list = (List<Object>) input;
            for (Object i : list) {
                add(out, i);
            }
        } else {
            out.add(input);
        }
    }

}
