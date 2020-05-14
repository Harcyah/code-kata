package com.harcyah.kata.reddit.easy_2016_03_21;

import com.google.common.collect.Maps;

import java.awt.Point;
import java.util.Map;

public class ClarenceTheSlowTypist {

    private static final Map<Character, Point> POINTS = Maps.newHashMap();

    static {
        String chars = "123456789.0";
        for (int i = 0; i < chars.length(); i++) {
            POINTS.put(chars.charAt(i), new Point(i % 3, Math.floorDiv(i, 3)));
        }
    }

    public double solve(String ip) {
        double length = 0.0;
        for (int i = 0; i < ip.length() - 1; i++) {
            char a = ip.charAt(i);
            char b = ip.charAt(i + 1);
            length += POINTS.get(a).distance(POINTS.get(b));
        }
        return length;
    }

}
