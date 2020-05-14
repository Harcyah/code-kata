package com.harcyah.kata.exercism.roman_numerals;

import lombok.AllArgsConstructor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@AllArgsConstructor
@RunWith(Parameterized.class)
public class RomanNumeralsTest {

    private final int input;
    private final String expectedOutput;

    @Parameters
    public static Collection<Object[]> data() {
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

    @Test
    public void convertArabicNumberalToRomanNumeral() {
        RomanNumeral romanNumeral = new RomanNumeral(input);

        assertEquals(expectedOutput, romanNumeral.getRomanNumeral());
    }

}
