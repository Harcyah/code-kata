package com.harcyah.kata.codingbat.string1.conCat;

public class ConCat {

    public String conCat(String a, String b) {
        if (a.length() == 0) {
            return b;
        }
        if (b.length() == 0) {
            return a;
        }

        StringBuffer out = new StringBuffer();
        out.append(a);
        char suffix = out.charAt(out.length() - 1);
        if (suffix == b.charAt(0)) {
            out.append(b.substring(1));
        } else {
            out.append(b);
        }
        return out.toString();
    }

}
