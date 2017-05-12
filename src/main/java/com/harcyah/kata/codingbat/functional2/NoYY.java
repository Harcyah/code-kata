package com.harcyah.kata.codingbat.functional2;

import java.util.List;
import java.util.stream.Collectors;

public class NoYY {

    public List<String> noYY(List<String> strings) {
        return strings.stream()
            .map(x -> x + "y")
            .filter(x -> !x.contains("yy"))
            .collect(Collectors.toList());
    }

}
