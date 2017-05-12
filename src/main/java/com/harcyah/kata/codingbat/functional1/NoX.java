package com.harcyah.kata.codingbat.functional1;

import java.util.List;
import java.util.stream.Collectors;

public class NoX {

    public List<String> noX(List<String> strings) {
        return strings.stream().map(x -> x.replaceAll("x", "")).collect(Collectors.toList());
    }

}
