package com.harcyah.kata.exercism.twelve_days;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TwelveDays {

    public static String verse(int number) {
        StringBuilder lyrics = new StringBuilder("On the " + getOrdinal(number) + " day of Christmas my true love gave to me, ");

        for (int i=number; i>1; i--) {
            lyrics.append(getGift(i));
            lyrics.append(", ");
        }

        if (number > 1) {
            lyrics.append("and ");
        }

        lyrics.append(getGift(1));
        lyrics.append(System.lineSeparator());

        return lyrics.toString();
    }

    public static String verses(int from, int to) {
        return IntStream
            .range(from, to + 1)
            .mapToObj(TwelveDays::verse)
            .collect(Collectors.joining(System.lineSeparator()));
    }

    public static String sing() {
        return verses(1, 12);
    }

    private static String getGift(int number) {
        switch (number) {
            case 1: return "a Partridge in a Pear Tree.";
            case 2: return "two Turtle Doves";
            case 3: return "three French Hens";
            case 4: return "four Calling Birds";
            case 5: return "five Gold Rings";
            case 6: return "six Geese-a-Laying";
            case 7: return "seven Swans-a-Swimming";
            case 8: return "eight Maids-a-Milking";
            case 9: return "nine Ladies Dancing";
            case 10: return "ten Lords-a-Leaping";
            case 11: return "eleven Pipers Piping";
            case 12: return "twelve Drummers Drumming";
        }
        return "";
    }

    private static String getOrdinal(int number) {
        switch (number) {
            case 1: return "first";
            case 2: return "second";
            case 3: return "third";
            case 4: return "fourth";
            case 5: return "fifth";
            case 6: return "sixth";
            case 7: return "seventh";
            case 8: return "eighth";
            case 9: return "ninth";
            case 10: return "tenth";
            case 11: return "eleventh";
            case 12: return "twelfth";
        }
        return "";
    }
}
