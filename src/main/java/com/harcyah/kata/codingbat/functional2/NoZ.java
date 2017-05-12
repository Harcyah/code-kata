package com.harcyah.kata.codingbat.functional2;

import java.util.List;
import java.util.stream.Collectors;

public class NoZ {

    public List<String> noZ(List<String> strings) {
        return strings.stream().filter(x -> !x.contains("z")).collect(Collectors.toList());
    }

}
