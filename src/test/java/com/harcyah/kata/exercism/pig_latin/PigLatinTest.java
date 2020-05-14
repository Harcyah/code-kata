package com.harcyah.kata.exercism.pig_latin;

import lombok.AllArgsConstructor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@AllArgsConstructor
@RunWith(Parameterized.class)
public class PigLatinTest {

    private final String input;
    private final String expectedOutput;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return List.of(new Object[][]{
            // Ay is added to words that start with vowels
            {"apple", "appleay"},
            {"ear", "earay"},
            {"igloo", "iglooay"},
            {"object", "objectay"},
            {"under", "underay"},

            // First letter and ay are moved to the end of words that start with consonants
            {"pig", "igpay"},
            {"koala", "oalakay"},
            {"yellow", "ellowyay"},
            {"xenon", "enonxay"},

            // Ch is treated like a single consonant
            {"chair", "airchay"},

            // Qu is treated like a single consonant
            {"queen", "eenquay"},

            // Qu and a single preceding consonant are treated like a single consonant
            {"square", "aresquay"},

            // Th is treated like a single consonant
            {"therapy", "erapythay"},

            // Thr is treated like a single consonant
            {"thrush", "ushthray"},

            // Sch is treated like a single consonant
            {"school", "oolschay"},

            // Yt is treated like a single vowel
            {"yttria", "yttriaay"},

            // Xr is treated like a single vowel
            {"xray", "xrayay"},

            // Phrases are translated
            {"quick fast run", "ickquay astfay unray"}
        });
    }

    @Test
    public void test() {
        assertEquals(expectedOutput, PigLatin.translate(input));
    }

}
