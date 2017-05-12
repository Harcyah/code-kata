package com.harcyah.kata.codingbat.functional2;

import java.util.List;
import java.util.stream.Collectors;

public class NoLong {

    public List<String> noLong(List<String> strings) {
        return strings.stream().filter(x -> x.length() < 4).collect(Collectors.toList());
    }

}
