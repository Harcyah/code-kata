package com.harcyah.kata.reddit.easy_2016_02_22;

public class Range {

    public int start;
    public int end;

    public Range(int start, int end) {
        this.start = Math.min(start, end);
        this.end = Math.max(start, end);
    }

}
