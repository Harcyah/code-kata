package com.harcyah.kata.exercism.rectangles;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
class Point {

    private final int x;
    private final int y;

    @Override
    public String toString() {
        return "x:" + x + ", y:" + y;
    }

}
