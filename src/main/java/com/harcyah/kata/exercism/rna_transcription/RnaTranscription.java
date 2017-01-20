package com.harcyah.kata.exercism.rna_transcription;

import java.util.HashMap;
import java.util.Map;

public class RnaTranscription {

    private static final Map<Character, Character> MAPPING = new HashMap<>();

    static {
        MAPPING.put('G', 'C');
        MAPPING.put('C', 'G');
        MAPPING.put('T', 'A');
        MAPPING.put('A', 'U');
    }

    public static String ofDna(String source) {
        StringBuffer rna = new StringBuffer();
        char[] chars = source.toCharArray();
        for (char c : chars) {
            rna.append(MAPPING.get(c));
        }
        return rna.toString();
    }

}