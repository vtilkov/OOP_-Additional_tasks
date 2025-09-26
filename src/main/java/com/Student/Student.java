package com.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public final class Student {
    private List<Integer> grades = new ArrayList<>();
    private String name;
    private final Predicate<Integer> gradeValidationRule;

    public Student(String name) {
        this(name, grade -> grade >= 2 && grade <= 5); //по умолчанию (оценки от 2 до 5)
    }

    public Student(String name, Predicate<Integer> gradeValidationRule) { //с пользовательской валидацией
        this.name = name;
        this.gradeValidationRule = gradeValidationRule;
    }

    public void addGrade(int grade) {
        if (gradeValidationRule.test(grade)) {
            grades.add(grade);
        }
    }

    public String toString() {
        return "Студент: оценки = " + grades + ", Имя = " + name + '}'; //выведем
    }
}