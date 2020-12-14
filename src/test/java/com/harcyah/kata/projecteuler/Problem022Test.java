package com.harcyah.kata.projecteuler;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.io.Resources;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem022Test {

    @Test
    public void testGetValueOf() {
        Problem022 sut = new Problem022();
        assertEquals(1, sut.getValueOf("A"));
        assertEquals(10, sut.getValueOf("ABCD"));
    }

    @Test
    public void testGetNamesScoreEasyCase() {
        Problem022 sut = new Problem022();
        assertEquals(30, sut.getNamesScores(ImmutableList.of("ABCD", "ABCD")));
    }

    @Test
    public void testGetNamesScoreHardCase() throws Exception {
        Problem022 sut = new Problem022();
        String resource = Resources.toString(getClass().getResource("projecteuler_022.txt"), StandardCharsets.UTF_8);
        String[] tokens = resource.split(",");
        List<String> names = Lists.newArrayList();
        for (String token : tokens) {
            names.add(token.substring(1, token.length() - 1));
        }
        Collections.sort(names);
        assertEquals(871198282L, sut.getNamesScores(names));
    }

}
