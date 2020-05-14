package com.harcyah.kata.exercism.binary_search;

import java.util.List;

public class BinarySearch<T extends Comparable<T>> {

    private static final int NOT_FOUND = -1;

    private List<T> elements;

    public BinarySearch(List<T> elements) {
        this.elements = elements;
    }

    public int indexOf(T needle) {
        return indexOf(needle, 0, elements.size() - 1);
    }

    private int indexOf(T needle, int leftIndex, int rightIndex) {
        if (leftIndex > rightIndex) {
            return NOT_FOUND;
        }

        int index = Math.floorDiv(leftIndex + rightIndex, 2);
        T actual = elements.get(index);

        int result = actual.compareTo(needle);
        if (result == 0) {
            return index;
        } else if (result > 0) {
            return indexOf(needle, leftIndex, index - 1);
        } else {
            return indexOf(needle, index + 1, rightIndex);
        }
    }

}
