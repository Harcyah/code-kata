package com.harcyah.kata.codingbat.warmup1.nearHundred;

public class NearHundred {

    public boolean nearHundred(int n) {
        return (Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10);
    }

}
