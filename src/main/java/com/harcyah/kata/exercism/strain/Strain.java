package com.harcyah.kata.exercism.strain;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Strain {

    public static <T> List<T> keep(List<T> input, Function<T, Boolean> function) {
        List<T> output = new ArrayList<>();
        for (T element : input) {
            if (function.apply(element)) {
                output.add(element);
            }
        }
        return output;
    }

    public static <T> List<T> discard(List<T> input, Function<T, Boolean> function) {
        List<T> output = new ArrayList<>();
        for (T element : input) {
            if (function.apply(element) == false) {
                output.add(element);
            }
        }
        return output;
    }

}