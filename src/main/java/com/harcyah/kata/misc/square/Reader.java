package com.harcyah.kata.misc.square;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.TreeSet;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

public class Reader {

	public TreeSet<Point> read() throws IOException {
		InputStream stream = Reader.class.getResourceAsStream("/squares.txt");
		List<String> lines = IOUtils.readLines(stream);
		TreeSet<Point> points = new TreeSet<Point>();
		for (String line : lines) {
			Point point = new Point(
				Integer.parseInt(StringUtils.substringBefore(line, " ")),
				Integer.parseInt(StringUtils.substringAfter(line, " ")));
			points.add(point);
		}
		return points;
	}
}