package com.harcyah.kata.exercism.grade_school;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class School {

    private static final List<String> EMPTY_LIST = new ArrayList<>();

    protected Map<Integer, List<String>> db = new TreeMap<>();

    public Map<Integer, List<String>> db() {
        return db;
    }

    public void add(String name, int grade) {
        List<String> students = db.get(grade);
        if (students == null) {
            students = new ArrayList<>();
        }
        students.add(name);
        students.sort(null);
        db.put(grade, students);
    }

    public List<String> grade(int grade) {
        return db.getOrDefault(grade, EMPTY_LIST);
    }

    public Map<Integer, List<String>> sort() {
        return db;
    }

}