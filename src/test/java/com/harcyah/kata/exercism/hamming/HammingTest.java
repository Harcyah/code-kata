package com.harcyah.kata.exercism.hamming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class HammingTest {

    @Test
    public void testNoDifferenceBetweenIdenticalStrands() {
        assertThat(Hamming.compute("A", "A")).isEqualTo(0);
    }

    @Test
    public void testCompleteHammingDistanceOfForSingleNucleotideStrand() {
        assertThat(Hamming.compute("A", "G")).isEqualTo(1);
    }

    @Test
    public void testCompleteHammingDistanceForSmallStrand() {
        assertThat(Hamming.compute("AG", "CT")).isEqualTo(2);
    }

    @Test
    public void testSmallHammingDistance() {
        assertThat(Hamming.compute("AT", "CT")).isEqualTo(1);
    }

    @Test
    public void testSmallHammingDistanceInLongerStrand() {
        assertThat(Hamming.compute("GGACG", "GGTCG")).isEqualTo(1);
    }

    @Test
    public void testValidatesFirstStrandNotLonger() {
        assertThatThrownBy(() -> Hamming.compute("AAAG", "AAA"))
            .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void testValidatesOtherStrandNotLonger() {
        assertThatThrownBy(() -> Hamming.compute("AAA", "AAAG"))
            .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void testLargeHammingDistance() {
        assertThat(Hamming.compute("GATACA", "GCATAA")).isEqualTo(4);
    }

    @Test
    public void testHammingDistanceInVeryLongStrand() {
        assertThat(Hamming.compute("GGACGGATTCTG", "AGGACGGATTCT")).isEqualTo(9);
    }

}
