package com.harcyah.kata.misc.square;

import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.List;
import java.util.TreeSet;

import static com.harcyah.kata.ResourceLoader.loadLines;

public class Reader {

    public TreeSet<Point> read() throws IOException {
        List<String> lines = loadLines("squares.txt");
        TreeSet<Point> points = new TreeSet<>();
        for (String line : lines) {
            Point point = new Point(
                Integer.parseInt(StringUtils.substringBefore(line, " ")),
                Integer.parseInt(StringUtils.substringAfter(line, " ")));
            points.add(point);
        }
        return points;
    }

}
