package com.harcyah.kata.reddit.easy_2016_02_22;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Scanner;

public class PlayingWithLightSwitches {

    public int apply(int lights, Iterable<Range> ranges) {
        BitSet bitSet = new BitSet(lights);
        for (Range range : ranges) {
            bitSet.flip(range.getStart(), range.getEnd() + 1);
        }
        return bitSet.cardinality();
    }

    public int applyFrom(InputStream stream) throws IOException {
        Scanner scanner = new Scanner(stream, StandardCharsets.UTF_8);
        int lights = scanner.nextInt();
        List<Range> ranges = new ArrayList<>();
        while (scanner.hasNextLine()) {
            ranges.add(new Range(scanner.nextInt(), scanner.nextInt()));
        }
        scanner.close();
        stream.close();
        return apply(lights, ranges);
    }

}
