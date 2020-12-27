package com.harcyah.kata.exercism.word_searcher;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class WordSearcher {

    private enum Directions {

        LEFT_TO_RIGHT(new Point(1, 0)),
        RIGHT_TO_LEFT(new Point(-1, 0)),
        TOP_TO_BOTTOM(new Point(0, 1)),
        BOTTOM_TO_TOP(new Point(0, -1)),
        TOP_LEFT_TO_BOTTOM_RIGHT(new Point(1, -1)),
        TOP_RIGHT_TO_BOTTOM_LEFT(new Point(-1, -1)),
        BOTTOM_RIGHT_TO_TOP_LEFT(new Point(-1, 1)),
        BOTTOM_LEFT_TO_TOP_RIGHT(new Point(1, 1));

        private final Point direction;

        Directions(Point direction) {
            this.direction = direction;
        }

        public Point getDirection() {
            return direction;
        }

    }

    private static class Needle {

        private final String word;
        private final WordLocation location;

        private Needle(String word, Point start, Point end) {
            this.word = word;
            Pair pStart = new Pair(start.x + 1, start.y + 1);
            Pair pEnd = new Pair(end.x + 1, end.y + 1);
            this.location = new WordLocation(pStart, pEnd);
        }

        public boolean matches(String word) {
            return this.word.equals(word);
        }

        public WordLocation getLocation() {
            return location;
        }
    }

    @Getter
    @AllArgsConstructor
    private static class Point {

        private final int x;
        private final int y;

        public Point translate(Point direction) {
            return new Point(x + direction.x, y + direction.y);
        }

    }

    private Needle getWord(char[][] chars, int length, Point start, Point direction) {
        StringBuilder sb = new StringBuilder();
        Point here = new Point(start.getX(), start.getY());
        for (int i = 0; i < length; i++) {
            try {
                char c = chars[here.getY()][here.getX()];
                sb.append(c);
            } catch (ArrayIndexOutOfBoundsException e) {
                return null;
            }

            if (i < length - 1) {
                here = here.translate(direction);
            }
        }
        return new Needle(sb.toString(), start, here);
    }

    public Map<String, Optional<WordLocation>> search(Set<String> searchWords, char[][] chars) {
        Map<String, Optional<WordLocation>> locations = new HashMap<>();
        searchWords.forEach(x -> locations.put(x, Optional.empty()));

        for (int x = 0; x < chars.length; x++) {
            for (int y = 0; y < chars.length; y++) {
                Point start = new Point(x, y);
                for (String word : searchWords) {
                    for (Directions direction : Directions.values()) {
                        Needle needle = getWord(chars, word.length(), start, direction.getDirection());
                        if (needle != null && needle.matches(word)) {
                            locations.put(word, Optional.of(needle.getLocation()));
                        }
                    }
                }
            }
        }

        return locations;
    }

}
