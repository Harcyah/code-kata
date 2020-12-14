package com.harcyah.kata.exercism.rna_transcription;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RnaTranscriptionTest {

    @Test
    public void testRnaTranscriptionOfEmptyDnaIsEmptyRna() {
        assertEquals("", RnaTranscription.ofDna(""));
    }

    @Test
    public void testRnaTranscriptionOfCytosineIsGuanine() {
        assertEquals("G", RnaTranscription.ofDna("C"));
    }

    @Test
    public void testRnaTranscriptionOfGuanineIsCytosine() {
        assertEquals("C", RnaTranscription.ofDna("G"));
    }

    @Test
    public void testRnaTranscriptionOfThymineIsAdenine() {
        assertEquals("A", RnaTranscription.ofDna("T"));
    }

    @Test
    public void testRnaTranscriptionOfAdenineIsUracil() {
        assertEquals("U", RnaTranscription.ofDna("A"));
    }

    @Test
    public void testRnaTranscription() {
        assertEquals("UGCACCAGAAUU", RnaTranscription.ofDna("ACGTGGTCTTAA"));
    }

}
