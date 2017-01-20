package com.harcyah.kata.exercism.wordy;

final class WordProblemSolver {

    private static final String PREFIX = "What is ";
    private static final String SUFFIX = "?";

    private interface Applicable {

        int applyOn(int original, int value);

    }

    private enum Operator implements Applicable {
        PLUS("plus") {
            @Override
            public int applyOn(int original, int value) {
                return original + value;
            }
        },
        MINUS("minus") {
            @Override
            public int applyOn(int original, int value) {
                return original - value;
            }
        },
        MULTIPLY("multiplied by") {
            @Override
            public int applyOn(int original, int value) {
                return original * value;
            }
        },
        DIVIDE("divided by") {
            @Override
            public int applyOn(int original, int value) {
                return original / value;
            }
        };

        private final String english;

        Operator(String english) {
            this.english = english;
        }

        public String getEnglish() {
            return english;
        }
    }

    public int solve(String words) {
        if (!words.startsWith(PREFIX)) {
            throw new IllegalArgumentException("I'm sorry, I don't understand the question!");
        }
        if (!words.endsWith(SUFFIX)) {
            throw new IllegalArgumentException("Be polite!");
        }

        String contents = words.substring(PREFIX.length(), words.length() - SUFFIX.length());
        int firstSpaceIndex = contents.indexOf(" ");
        StringBuffer sb = new StringBuffer(contents.substring(firstSpaceIndex));
        String valueAsString = contents.substring(0, firstSpaceIndex);
        int value = Integer.parseInt(valueAsString);

        while (sb.length() > 0) {
            Operator operator = getNextOperator(sb);
            Integer operand = getNextValue(sb);
            value = operator.applyOn(value, operand);
        }

        return value;
    }

    private Integer getNextValue(StringBuffer sb) {
        // Drop first space
        sb.delete(0, 1);

        StringBuilder digits = new StringBuilder();
        int index;
        for (index = 0; index < sb.length(); index++) {
            char c = sb.charAt(index);
            if (Character.isDigit(c) || c == '-') {
                digits.append(c);
            } else {
                break;
            }
        }
        sb.delete(0, index);
        return Integer.parseInt(digits.toString());
    }

    private Operator getNextOperator(StringBuffer sb) {
        // Drop first space
        sb.delete(0, 1);

        for (Operator o : Operator.values()) {
            if (sb.toString().startsWith(o.getEnglish())) {
                sb.delete(0, o.getEnglish().length());
                return o;
            }
        }
        throw new IllegalArgumentException("I'm sorry, I don't understand the question!");
    }

}
