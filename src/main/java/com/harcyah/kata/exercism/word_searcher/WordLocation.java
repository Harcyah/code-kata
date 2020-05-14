package com.harcyah.kata.exercism.word_searcher;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode
class WordLocation {

    private final Pair startCoord;
    private final Pair endCoord;

    @Override
    public String toString() {
        return "WordLocation{" +
                "startCoord=" + startCoord +
                ", endCoord=" + endCoord +
                '}';
    }

}
