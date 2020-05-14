package com.harcyah.kata.misc.square;

import com.google.common.io.Resources;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.TreeSet;

public class Reader {

    public TreeSet<Point> read() throws IOException {
        URL url = Resources.getResource("squares.txt");
        List<String> lines = Resources.readLines(url, StandardCharsets.UTF_8);
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
