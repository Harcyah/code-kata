package com.harcyah.kata.exercism.atbash_cipher;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncodeTest {

    public static Collection<Object[]> getTestData() {
        return List.of(new Object[][]{
            {"no", "ml"},
            {"yes", "bvh"},
            {"OMG", "lnt"},
            {"mindblowingly", "nrmwy oldrm tob"},
            {"Testing, 1 2 3, testing.", "gvhgr mt123 gvhgr mt"},
            {"Truth is fiction.", "gifgs rhurx grlm"},
            {"The quick brown fox jumps over the lazy dog.", "gsvjf rxpyi ldmul cqfnk hlevi gsvoz abwlt"}
        });
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void test(String input, String expectedOutput) {
        assertEquals(expectedOutput, Atbash.encode(input));
    }

}
