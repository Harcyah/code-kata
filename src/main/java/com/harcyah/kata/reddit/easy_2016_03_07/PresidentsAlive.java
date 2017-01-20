package com.harcyah.kata.reddit.easy_2016_03_07;

import com.google.common.io.Resources;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class PresidentsAlive {

    public int findYearWithMostPresidentsAlive() throws IOException {
        Map<Integer, Integer> yearsCounter = new HashMap<>();
        URL resource = getClass().getResource("presidents.csv");
        List<String> lines = Resources.readLines(resource, StandardCharsets.UTF_8);
        lines.remove(0);

        for (String line : lines) {
            String[] tokens = line.split(",");
            int yearOfBirth = Integer.parseInt(StringUtils.right(tokens[1], 4));
            int yearOfDeath = 0;
            if (StringUtils.isBlank(tokens[3])) {
                yearOfDeath = 2016;
            } else {
                yearOfDeath = Integer.parseInt(StringUtils.right(tokens[3], 4));
            }

            IntStream.range(yearOfBirth, yearOfDeath).boxed().forEach(x -> {
                yearsCounter.compute(x, (k, v) -> v == null ? 1 : v + 1);
            });
        }

        return yearsCounter.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .limit(1)
                .findFirst()
                .get()
                .getKey();
    }

}
