package com.harcyah.kata.codingbat.warmup1.front3;

public class Front3 {

    public String front3(String str) {
        String prefix = str.length() < 3 ? str : str.substring(0, 3);
        return prefix + prefix + prefix;
    }

}