package com.harcyah.kata.codingbat.functional2;

import java.util.List;
import java.util.stream.Collectors;

public class No34 {

    public List<String> no34(List<String> strings) {
        return strings.stream().filter(x -> x.length() != 3 && x.length() != 4).collect(Collectors.toList());
    }

}
