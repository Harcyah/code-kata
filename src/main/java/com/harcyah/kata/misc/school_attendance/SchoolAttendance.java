package com.harcyah.kata.misc.school_attendance;

import com.google.common.collect.ComparisonChain;
import com.google.common.io.Resources;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SchoolAttendance {

    private final List<Student> students;

    public SchoolAttendance() throws IOException, ParseException {
        this.students = new ArrayList<>();
        this.students.addAll(read("com/harcyah/kata/misc/school_attendance/comma.txt", new StudentsCommaParser()));
        this.students.addAll(read("com/harcyah/kata/misc/school_attendance/pipe.txt", new StudentsPipeParser()));
        this.students.addAll(read("com/harcyah/kata/misc/school_attendance/space.txt", new StudentsSpaceParser()));
    }

    public List<Student> read(String file, Parser parser) throws IOException, ParseException {
        URL resource = Resources.getResource(file);
        List<String> lines = Resources.readLines(resource, StandardCharsets.UTF_8);
        List<Student> students = new ArrayList<>();
        for (String line : lines) {
            students.add(parser.parse(line));
        }
        return students;
    }

    public List<Student> getStudentsSortedByGenderAndLastNameAscending() {
        return students.stream()
                .sorted((o1, o2) -> ComparisonChain.start()
                        .compare(o1.getGender(), o2.getGender())
                        .compare(o1.getLastName(), o2.getLastName())
                        .result())
                .collect(Collectors.toList());
    }

    public List<Student> getStudentsSortedByBirthDateAscending() {
        return students.stream()
                .sorted((o1, o2) -> ComparisonChain.start()
                        .compare(o1.getDateOfBirth(), o2.getDateOfBirth())
                        .result())
                .collect(Collectors.toList());
    }

    public List<Student> getStudentsSortedByLastNameAscending() {
        return students.stream()
                .sorted((o1, o2) -> ComparisonChain.start()
                        .compare(o1.getLastName(), o2.getLastName())
                        .result())
                .collect(Collectors.toList());
    }

}
