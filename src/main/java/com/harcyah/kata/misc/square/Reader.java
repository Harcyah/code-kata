package com.harcyah.kata.misc.square;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.TreeSet;

public class Reader {

    public TreeSet<Point> read() throws IOException {
        InputStream stream = getClass().getResourceAsStream("squares.txt");
        List<String> lines = IOUtils.readLines(stream, StandardCharsets.UTF_8);
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
