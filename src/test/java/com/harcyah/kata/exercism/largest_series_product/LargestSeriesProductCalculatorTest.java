package com.harcyah.kata.exercism.largest_series_product;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class LargestSeriesProductCalculatorTest {

    /*
     * See https://github.com/junit-team/junit4/wiki/Rules for information on
     * JUnit Rules in general and ExpectedExceptions in particular.
     */
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testCorrectlyCalculatesLargestProductOfLengthTwoWithNumbersInOrder() {
        LargestSeriesProductCalculator calculator = new LargestSeriesProductCalculator("0123456789");
        long expectedProduct = 72;

        long actualProduct = calculator.calculateLargestProductForSeriesLength(2);

        assertEquals(expectedProduct, actualProduct);
    }

    @Test
    public void testCorrectlyCalculatesLargestProductOfLengthTwoWithNumbersNotInOrder() {
        LargestSeriesProductCalculator calculator = new LargestSeriesProductCalculator("576802143");
        long expectedProduct = 48;

        long actualProduct = calculator.calculateLargestProductForSeriesLength(2);

        assertEquals(expectedProduct, actualProduct);
    }

    @Test
    public void testCorrectlyCalculatesLargestProductWhenSeriesLengthEqualsStringToSearchLength() {
        LargestSeriesProductCalculator calculator = new LargestSeriesProductCalculator("29");
        long expectedProduct = 18;

        long actualProduct = calculator.calculateLargestProductForSeriesLength(2);

        assertEquals(expectedProduct, actualProduct);
    }

    @Test
    public void testCorrectlyCalculatesLargestProductOfLengthThreeWithNumbersInOrder() {
        LargestSeriesProductCalculator calculator = new LargestSeriesProductCalculator("0123456789");
        long expectedProduct = 504;

        long actualProduct = calculator.calculateLargestProductForSeriesLength(3);

        assertEquals(expectedProduct, actualProduct);
    }

    @Test
    public void testCorrectlyCalculatesLargestProductOfLengthThreeWithNumbersNotInOrder() {
        LargestSeriesProductCalculator calculator = new LargestSeriesProductCalculator("1027839564");
        long expectedProduct = 270;

        long actualProduct = calculator.calculateLargestProductForSeriesLength(3);

        assertEquals(expectedProduct, actualProduct);
    }

    @Test
    public void testCorrectlyCalculatesLargestProductOfLengthFiveWithNumbersInOrder() {
        LargestSeriesProductCalculator calculator = new LargestSeriesProductCalculator("0123456789");
        long expectedProduct = 15120;

        long actualProduct = calculator.calculateLargestProductForSeriesLength(5);

        assertEquals(expectedProduct, actualProduct);
    }

    @Test
    public void testCorrectlyCalculatesLargestProductInLongStringToSearchV1() {
        LargestSeriesProductCalculator calculator = new LargestSeriesProductCalculator("73167176531330624919225119674426574742355349194934");

        long expectedProduct = 23520;

        long actualProduct = calculator.calculateLargestProductForSeriesLength(6);

        assertEquals(expectedProduct, actualProduct);
    }

    @Test
    public void testCorrectlyCalculatesLargestProductInLongStringToSearchV2() {
        LargestSeriesProductCalculator calculator = new LargestSeriesProductCalculator("52677741234314237566414902593461595376319419139427");

        long expectedProduct = 28350;

        long actualProduct = calculator.calculateLargestProductForSeriesLength(6);

        assertEquals(expectedProduct, actualProduct);
    }

    @Test
    public void testCorrectlyCalculatesLargestProductInLongStringToSearchFromProjectEuler() {
        LargestSeriesProductCalculator calculator = new LargestSeriesProductCalculator(
                "73167176531330624919225119674426574742355349194934969835203127745063262395783180169848018" +
                "6947885184385861560789112949495459501737958331952853208805511125406987471585238630507" +
                "1569329096329522744304355766896648950445244523161731856403098711121722383113622298934" +
                "2338030813533627661428280644448664523874930358907296290491560440772390713810515859307" +
                "9608667017242712188399879790879227492190169972088809377665727333001053367881220235421" +
                "8097512545405947522435258490771167055601360483958644670632441572215539753697817977846" +
                "1740649551492908625693219784686224828397224137565705605749026140797296865241453510047" +
                "4821663704844031998900088952434506585412275886668811642717147992444292823086346567481" +
                "3919123162824586178664583591245665294765456828489128831426076900422421902267105562632" +
                "1111109370544217506941658960408071984038509624554443629812309878799272442849091888458" +
                "0156166097919133875499200524063689912560717606058861164671094050775410022569831552000" +
                "5593572972571636269561882670428252483600823257530420752963450");

        long expectedProduct = 23514624000L;

        long actualProduct = calculator.calculateLargestProductForSeriesLength(13);

        assertEquals(expectedProduct, actualProduct);
    }

    @Test
    public void testCorrectlyCalculatesLargestProductOfZeroIfAllDigitsAreZeroes() {
        LargestSeriesProductCalculator calculator = new LargestSeriesProductCalculator("0000");
        long expectedProduct = 0;

        long actualProduct = calculator.calculateLargestProductForSeriesLength(2);

        assertEquals(expectedProduct, actualProduct);
    }

    @Test
    public void testCorrectlyCalculatesLargestProductOfZeroIfAllSeriesOfGivenLengthContainZero() {
        LargestSeriesProductCalculator calculator = new LargestSeriesProductCalculator("99099");
        long expectedProduct = 0;

        long actualProduct = calculator.calculateLargestProductForSeriesLength(3);

        assertEquals(expectedProduct, actualProduct);
    }

    @Test
    public void testSeriesLengthLongerThanLengthOfStringToTestIsRejected() {
        LargestSeriesProductCalculator calculator = new LargestSeriesProductCalculator("123");

        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage(
                "Series length must be less than or equal to the length of the string to search.");

        calculator.calculateLargestProductForSeriesLength(4);
    }

    @Test
    public void testCorrectlyCalculatesLargestProductOfLength0ForEmptyStringToSearch() {
        LargestSeriesProductCalculator calculator = new LargestSeriesProductCalculator("");
        long expectedProduct = 1;

        long actualProduct = calculator.calculateLargestProductForSeriesLength(0);

        assertEquals(expectedProduct, actualProduct);
    }

    @Test
    public void testCorrectlyCalculatesLargestProductOfLength0ForNonEmptyStringToSearch() {
        LargestSeriesProductCalculator calculator = new LargestSeriesProductCalculator("123");
        long expectedProduct = 1;

        long actualProduct = calculator.calculateLargestProductForSeriesLength(0);

        assertEquals(expectedProduct, actualProduct);
    }

    @Test
    public void testEmptyStringToSearchAndSeriesOfNonZeroLengthIsRejected() {
        LargestSeriesProductCalculator calculator = new LargestSeriesProductCalculator("");

        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage(
                "Series length must be less than or equal to the length of the string to search.");

        calculator.calculateLargestProductForSeriesLength(1);
    }

    @Test
    public void testStringToSearchContainingNonDigitCharacterIsRejected() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("String to search may only contains digits.");

        new LargestSeriesProductCalculator("1234a5");
    }

    @Test
    public void testNegativeSeriesLengthIsRejected() {
        LargestSeriesProductCalculator calculator = new LargestSeriesProductCalculator("12345");

        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Series length must be non-negative.");

        calculator.calculateLargestProductForSeriesLength(-1);
    }

    @Test
    public void testNullStringToSearchIsRejected() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("String to search must be non-null.");

        new LargestSeriesProductCalculator(null);
    }

}
