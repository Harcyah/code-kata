package com.harcyah.kata.codingbat.functional1;

import java.util.List;
import java.util.stream.Collectors;

public class Copies3 {

    public List<String> copies3(List<String> strings) {
        return strings.stream().map(x -> x + x + x).collect(Collectors.toList());
    }

}
