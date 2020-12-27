package com.harcyah.kata.misc.version;

import com.google.common.base.Strings;
import com.google.common.collect.ComparisonChain;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.StringUtils;

@EqualsAndHashCode(of = {"major", "minor", "patch"})
public class Version implements Comparable<Version> {

    private final VersionPart major;
    private final VersionPart minor;
    private final VersionPart patch;

    public Version(String raw) {
        if (Strings.isNullOrEmpty(raw)) {
            major = VersionPart.UNKNOWN;
            minor = VersionPart.UNKNOWN;
            patch = VersionPart.UNKNOWN;
        } else {
            String[] tokens = StringUtils.split(raw, ".");
            major = tokens.length > 0 ? new VersionPart(tokens[0]) : VersionPart.UNKNOWN;
            minor = tokens.length > 1 ? new VersionPart(tokens[1]) : VersionPart.UNKNOWN;
            patch = tokens.length > 2 ? new VersionPart(tokens[2]) : VersionPart.UNKNOWN;
        }
    }

    @Override
    public int compareTo(Version that) {
        return ComparisonChain.start()
            .compare(this.major, that.major)
            .compare(this.minor, that.minor)
            .compare(this.patch, that.patch)
            .result();
    }

}
