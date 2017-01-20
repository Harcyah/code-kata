package com.harcyah.kata.codingbat.string2.starOut;

public class StarOut {

    public String starOut(String source) {
        StringBuffer out = new StringBuffer();
        for (int i = 0; i < source.length(); i++) {
            int surroundStart = Math.max(0, i - 1);
            int surroundEnd = Math.min(i + 2, source.length());
            String surrounding = source.substring(surroundStart, surroundEnd);
            if (!surrounding.contains("*")) {
                out.append(source.charAt(i));
            }
        }
        return out.toString();
    }

}
