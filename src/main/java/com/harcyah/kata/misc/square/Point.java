package com.harcyah.kata.misc.square;

import com.google.common.collect.ComparisonChain;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Point implements Comparable<Point> {

    private final int x;
    private final int y;

    public Point(Point u1, Point u2) {
        this.x = u1.x + u2.x;
        this.y = u1.y + u2.y;
    }

    @Override
    public int compareTo(Point o) {
        return ComparisonChain.start()
            .compare(this.x, o.x)
            .compare(this.y, o.y)
            .result();
    }

}
