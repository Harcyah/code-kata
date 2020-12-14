package com.harcyah.kata.exercism.atbash_cipher;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecodeTest {

    public static Collection<Object[]> getTestData() {
        return List.of(new Object[][]{
            {"vcvix rhn", "exercism"},
            {"zmlyh gzxov rhlug vmzhg vkkrm thglm v", "anobstacleisoftenasteppingstone"},
            {"gvhgr mt123 gvhgr mt", "testing123testing"}
        });
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void test(String input, String expectedOutput) {
        assertEquals(expectedOutput, Atbash.decode(input));
    }

}
