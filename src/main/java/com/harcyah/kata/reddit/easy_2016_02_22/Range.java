package com.harcyah.kata.reddit.easy_2016_02_22;

import lombok.Getter;

@Getter
public class Range {

    private final int start;
    private final int end;

    public Range(int start, int end) {
        this.start = Math.min(start, end);
        this.end = Math.max(start, end);
    }

}
