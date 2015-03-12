package com.harcyah.kata.misc.square;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;

import com.google.common.collect.Lists;

public class Reader {

	public List<Vector2D> read() throws IOException {
		InputStream stream = Reader.class.getResourceAsStream("/squares.txt");
		List<String> lines = IOUtils.readLines(stream);
		List<Vector2D> points = Lists.newArrayList();
		for (String line : lines) {
			Vector2D point = new Vector2D(
				Double.parseDouble(StringUtils.substringBefore(line, " ")),
				Double.parseDouble(StringUtils.substringAfter(line, " ")));
			points.add(point);
		}
		return points;
	}
}
