package com.harcyah.kata.exercism.food_chain;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FoodChain {

    private enum Animals {

        FLY("fly", true, "", "", null),
        SPIDER("spider", true, "It wriggled and jiggled and tickled inside her.\n", " that wriggled and jiggled and tickled inside her", FLY),
        BIRD("bird", true, "How absurd to swallow a bird!\n", "", SPIDER),
        CAT("cat", true, "Imagine that, to swallow a cat!\n", "", BIRD),
        DOG("dog", true, "What a hog, to swallow a dog!\n", "", CAT),
        GOAT("goat", true, "Just opened her throat and swallowed a goat!\n", "", DOG),
        COW("cow", true, "I don't know how she swallowed a cow!\n", "", GOAT),
        HORSE("horse", false, "She's dead, of course!", "", null);

        private final String name;
        private final Boolean idk;
        private final String comment;
        private final String cause;
        private final Animals parent;

        Animals(String name, Boolean idk, String comment, String cause, Animals parent) {
            this.name = name;
            this.idk = idk;
            this.comment = comment;
            this.cause = cause;
            this.parent = parent;
        }

        public String verse() {
            StringBuilder sb = new StringBuilder();
            sb.append("I know an old lady who swallowed a ");
            sb.append(name);
            sb.append(".\n");
            sb.append(comment);

            Animals current = this;
            Animals parent = this.parent;
            while (parent != null) {
                sb.append("She swallowed the ");
                sb.append(current.name);
                sb.append(" to catch the ");
                sb.append(parent.name);
                sb.append(parent.cause);
                sb.append(".");
                sb.append("\n");
                current = current.parent;
                parent = current.parent;
            }

            if (idk) {
                sb.append("I don't know why she swallowed the fly. Perhaps she'll die.");
            }

            return sb.toString();
        }
    }

    public String verse(int verse) {
        return Animals.values()[verse - 1].verse();
    }

    public String verses(int startVerse, int endVerse) {
        return IntStream.rangeClosed(startVerse, endVerse).mapToObj(this::verse).collect(Collectors.joining("\n\n"));
    }

}
