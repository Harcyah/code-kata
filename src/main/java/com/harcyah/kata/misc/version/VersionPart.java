package com.harcyah.kata.misc.version;

import com.google.common.base.Strings;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Getter
@EqualsAndHashCode
public class VersionPart implements Comparable<VersionPart> {

    private static final Table<VersionType, VersionType, VersionPartComparator> COMPARATORS = HashBasedTable.create();

    private static final Pattern NUMBER_PATTERN = Pattern.compile("(\\d+)");
    private static final Pattern ALPHANUMERICAL_PATTERN = Pattern.compile("(?<num>\\d+)(?<txt>\\w*)");

    private static final Integer DEFAULT_NUMBER = null;
    private static final String DEFAULT_STRING = null;

    private final Integer number;
    private final String string;
    private final String raw;
    private final VersionType type;

    static {
        COMPARATORS.put(VersionType.ALPHANUMERIC, VersionType.ALPHANUMERIC, (p1, p2) -> p1.raw.compareTo(p2.raw));
        COMPARATORS.put(VersionType.STRING, VersionType.STRING, (p1, p2) -> p1.string.compareTo(p2.string));
        COMPARATORS.put(VersionType.STRING, VersionType.NUMBER, (p1, p2) -> p1.raw.compareTo(p2.raw));
        COMPARATORS.put(VersionType.NUMBER, VersionType.NUMBER, (p1, p2) -> p1.number.compareTo(p2.number));
        COMPARATORS.put(VersionType.NUMBER, VersionType.STRING, (p1, p2) -> -1);
        COMPARATORS.put(VersionType.NUMBER, VersionType.ALPHANUMERIC, (p1, p2) -> -1);
    }

    public static final VersionPart UNKNOWN = new VersionPart();

    protected VersionPart() {
        this.number = DEFAULT_NUMBER;
        this.string = DEFAULT_STRING;
        this.raw = "";
        this.type = VersionType.EMPTY;
    }

    public VersionPart(String raw) {
        if (Strings.isNullOrEmpty(raw)) {
            this.number = null;
            this.string = null;
            this.raw = null;
            this.type = VersionType.EMPTY;
            return;
        }

        Matcher numberMatcher = NUMBER_PATTERN.matcher(raw);
        if (numberMatcher.matches()) {
            this.number = Integer.parseInt(raw);
            this.string = null;
            this.raw = raw;
            this.type = VersionType.NUMBER;
            return;
        }

        Matcher alphanumMatcher = ALPHANUMERICAL_PATTERN.matcher(raw);
        if (alphanumMatcher.matches()) {
            this.number = Integer.parseInt(alphanumMatcher.group(1));
            this.string = alphanumMatcher.group(2);
            this.raw = raw;
            this.type = VersionType.ALPHANUMERIC;
            return;
        }

        this.number = null;
        this.string = raw;
        this.raw = raw;
        this.type = VersionType.STRING;
    }

    @Override
    public int compareTo(VersionPart that) {
        if (this.equals(that)) {
            return 0;
        }

        if (this.equals(UNKNOWN)) {
            return -1;
        }

        if (that.equals(UNKNOWN)) {
            return 1;
        }

        VersionPartComparator comparator = COMPARATORS.get(this.type, that.type);
        if (comparator == null) {
            throw new UnsupportedOperationException("Cannot find comparator between " + this.type + " and " + that.type);
        }

        return comparator.compare(this, that);
    }

}
