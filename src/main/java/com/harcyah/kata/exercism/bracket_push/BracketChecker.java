package com.harcyah.kata.exercism.bracket_push;

import java.util.Stack;

final class BracketChecker {

    private static final char LEFT_BRACE = '{';
    private static final char LEFT_BRACKET = '[';
    private static final char LEFT_PARENTHESIS = '(';
    private static final char RIGHT_BRACE = '}';
    private static final char RIGHT_BRACKET = ']';
    private static final char RIGHT_PARENTHESIS = ')';

    private final String source;
    private final Stack<Character> stack = new Stack<Character>();

    public BracketChecker(String source) {
        this.source = source;
    }

    public boolean areBracketsMatchedAndNestedCorrectly() {
        for (char c : source.toCharArray()) {
            char before;
            switch (c) {
                case LEFT_BRACE:
                case LEFT_BRACKET:
                case LEFT_PARENTHESIS:
                    stack.push(c);
                    break;
                case RIGHT_BRACE:
                    if (!isPreviousCharacterAsExpected(LEFT_BRACE)) {
                        return false;
                    }
                    break;
                case RIGHT_BRACKET:
                    if (!isPreviousCharacterAsExpected(LEFT_BRACKET)) {
                        return false;
                    }
                    break;
                case RIGHT_PARENTHESIS:
                    if (!isPreviousCharacterAsExpected(LEFT_PARENTHESIS)) {
                        return false;
                    }
                    break;
                default:
                    break;
            }
        }
        return stack.isEmpty();
    }

    private boolean isPreviousCharacterAsExpected(char expectedBefore) {
        if (stack.isEmpty()) {
            return false;
        }

        char before = stack.peek();
        if (before != expectedBefore) {
            return false;
        } else {
            stack.pop();
            return true;
        }
    }

}
