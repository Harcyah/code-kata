package com.harcyah.kata.misc.excel;

public class ExcelNumberingRecursiveImpl {

    public String getLabel(int number) {
        if (number > 26) {
            int q = number / 26;
            int r = number % 26;
            return getLabel(q) + toAlphabeticChar(r);
        } else {
            return toAlphabeticChar(number) + "";
        }
    }

    protected char toAlphabeticChar(int value) {
        return (char) (('A' + value) - 1);
    }

}
