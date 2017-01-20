package com.harcyah.kata.codingbat.recursion1.nestParen;

public class NestParen {

    public boolean nestParen(String str) {
        if (str.isEmpty()) {
            return true;
        }
        if (str.length() == 1) {
            return false;
        }

        boolean startsWith = str.charAt(0) == '(';
        boolean endsWith = str.charAt(str.length() - 1) == ')';

        if (startsWith) {
            if (endsWith) {
                return nestParen(str.substring(1, str.length() - 1));
            } else {
                return nestParen(str.substring(0, str.length() - 1));
            }
        } else {
            return nestParen(str.substring(1));
        }
    }

}
