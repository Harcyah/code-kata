package com.harcyah.kata.misc.version;

public class VersionComparator {

    public int compare(String left, String right) {
        Version vLeft = new Version(left);
        Version vRight = new Version(right);
        return vLeft.compareTo(vRight);
    }

}
