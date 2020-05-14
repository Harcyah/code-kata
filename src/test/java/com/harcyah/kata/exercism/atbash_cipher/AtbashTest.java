package com.harcyah.kata.exercism.atbash_cipher;

import lombok.AllArgsConstructor;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Enclosed.class)
public class AtbashTest {

    @AllArgsConstructor
    @RunWith(Parameterized.class)
    public static class EncodeTest {

        private final String input;
        private final String expectedOutput;

        @Parameters
        public static Collection<Object[]> data() {
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

        @Test
        public void test() {
            assertEquals(expectedOutput, Atbash.encode(input));
        }

    }

    @AllArgsConstructor
    @RunWith(Parameterized.class)
    public static class DecodeTest {

        private final String input;
        private final String expectedOutput;

        @Parameters
        public static Collection<Object[]> data() {
            return List.of(new Object[][]{
                {"vcvix rhn", "exercism"},
                {"zmlyh gzxov rhlug vmzhg vkkrm thglm v", "anobstacleisoftenasteppingstone"},
                {"gvhgr mt123 gvhgr mt", "testing123testing"}
            });
        }

        @Test
        public void test() {
            assertEquals(expectedOutput, Atbash.decode(input));
        }

    }

}
