package com.harcyah.kata.codingbat.string3.withoutString;

public class WithoutString {

    public String withoutString(String base, String remove) {
        StringBuffer out = new StringBuffer(base);
        String needle = remove.toLowerCase();
        int index;
        while ((index = out.toString().toLowerCase().indexOf(needle)) >= 0) {
            out.delete(index, index + needle.length());
        }
        return out.toString();
    }

}
