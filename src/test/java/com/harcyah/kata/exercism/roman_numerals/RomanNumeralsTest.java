package com.harcyah.kata.exercism.roman_numerals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsTest {

    public static Collection<Object[]> getTestData() {
        return List.of(new Object[][]{
            {0, ""},
            {1, "I"},
            {2, "II"},
            {3, "III"},
            {4, "IV"},
            {5, "V"},
            {6, "VI"},
            {9, "IX"},
            {27, "XXVII"},
            {48, "XLVIII"},
            {59, "LIX"},
            {93, "XCIII"},
            {141, "CXLI"},
            {163, "CLXIII"},
            {402, "CDII"},
            {575, "DLXXV"},
            {911, "CMXI"},
            {1024, "MXXIV"},
            {3000, "MMM"}
        });
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void convertArabicNumberalToRomanNumeral(int input, String expectedOutput) {
        RomanNumeral romanNumeral = new RomanNumeral(input);

        assertEquals(expectedOutput, romanNumeral.getRomanNumeral());
    }

}
