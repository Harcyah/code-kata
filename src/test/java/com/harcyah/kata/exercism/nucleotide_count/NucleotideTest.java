package com.harcyah.kata.exercism.nucleotide_count;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.entry;

public class NucleotideTest {
    @Test
    public void testEmptyDnaStringHasNoAdenosine() {
        Dna dna = new Dna("");
        assertThat(dna.count('A')).isEqualTo(0);
    }

    @Test
    public void testEmptyDnaStringHasNoNucleotides() {
        Dna dna = new Dna("");
        assertThat(dna.nucleotideCounts()).hasSize(4).contains(
                entry('A', 0),
                entry('C', 0),
                entry('G', 0),
                entry('T', 0)
        );
    }

    @Test
    public void testRepetitiveCytidineGetsCounted() {
        Dna dna = new Dna("CCCCC");
        assertThat(dna.count('C')).isEqualTo(5);
    }

    @Test
    public void testRepetitiveSequenceWithOnlyGuanosine() {
        Dna dna = new Dna("GGGGGGGG");
        assertThat(dna.nucleotideCounts()).hasSize(4).contains(
                entry('A', 0),
                entry('C', 0),
                entry('G', 8),
                entry('T', 0)
        );
    }

    @Test
    public void testCountsOnlyThymidine() {
        Dna dna = new Dna("GGGGGTAACCCGG");
        assertThat(dna.count('T')).isEqualTo(1);
    }

    @Test
    public void testCountsANucleotideOnlyOnce() {
        Dna dna = new Dna("CGATTGGG");
        dna.count('T');
        assertThat(dna.count('T')).isEqualTo(2);
    }

    @Test
    public void testDnaCountsDoNotChangeAfterCountingAdenosine() {
        Dna dna = new Dna("GATTACA");
        dna.count('A');
        assertThat(dna.nucleotideCounts()).hasSize(4).contains(
                entry('A', 3),
                entry('C', 1),
                entry('G', 1),
                entry('T', 2)
        );
    }

    @Test
    public void testValidatesNucleotides() {
        Dna dna = new Dna("GACT");
        assertThatThrownBy(() -> dna.count('X'))
            .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void testCountsAllNucleotides() {
        String s = "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC";
        Dna dna = new Dna(s);
        assertThat(dna.nucleotideCounts()).hasSize(4).contains(
                entry('A', 20),
                entry('C', 12),
                entry('G', 17),
                entry('T', 21)
        );
    }

}
