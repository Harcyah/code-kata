package com.harcyah.kata.misc.school_attendance;

import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StudentsSpaceParser implements Parser {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("d-MM-yyyy");

    @Override
    public Student parse(String line) throws ParseException {
        String[] tokens = StringUtils.split(line, " ");
        return new Student(
            tokens[1],
            tokens[2],
            tokens[0],
            Gender.from(tokens[3]),
            null,
            dateFormat.parse(tokens[4]));
    }

}
