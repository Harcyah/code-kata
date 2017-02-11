package com.harcyah.kata.exercism.bob;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Bob {

    private interface Matcher extends Comparable<Matcher> {

        boolean matches(String what);

        String getContents();

        Float getWeight();

        @Override
        default int compareTo(Matcher o) {
            return this.getWeight().compareTo(o.getWeight());
        }

    }

    public static class SureMatcher implements Matcher {

        @Override
        public boolean matches(String what) {
            return what.endsWith("?");
        }

        @Override
        public String getContents() {
            return "Sure.";
        }

        @Override
        public Float getWeight() {
            return 1.0f;
        }

    }

    public static class YellMatcher implements Matcher {

        @Override
        public boolean matches(String what) {
            long characters = what.chars().filter(x -> Character.isLetter(x)).count();
            long upperCase = what.chars().filter(x -> Character.isLetter(x) && Character.isUpperCase(x)).count();
            return characters > 0 && characters == upperCase;
        }

        @Override
        public String getContents() {
            return "Whoa, chill out!";
        }

        @Override
        public Float getWeight() {
            return 2.0f;
        }

    }

    public static class FineMatcher implements Matcher {

        @Override
        public boolean matches(String what) {
            return what.trim().isEmpty();
        }

        @Override
        public String getContents() {
            return "Fine. Be that way!";
        }

        @Override
        public Float getWeight() {
            return 4.0f;
        }

    }

    public static class WhatMatcher implements Matcher {

        @Override
        public boolean matches(String what) {
            return true;
        }

        @Override
        public String getContents() {
            return "Whatever.";
        }

        @Override
        public Float getWeight() {
            return 0.5f;
        }

    }

    protected List<Matcher> matchers = new ArrayList<>();

    public Bob() {
        matchers.add(new SureMatcher());
        matchers.add(new FineMatcher());
        matchers.add(new WhatMatcher());
        matchers.add(new YellMatcher());
    }

    public String hey(String what) {
        TreeSet<Matcher> matching = new TreeSet<>();
        for (Matcher matcher : matchers) {
            if (matcher.matches(what)) {
                matching.add(matcher);
            }
        }
        return matching.last().getContents();
    }

}
