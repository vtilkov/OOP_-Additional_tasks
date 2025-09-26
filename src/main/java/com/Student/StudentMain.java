package com.Student;

public class StudentMain {
    public static void main(String[] args) {

        System.out.println(" -- Стандартная проверка от 2-5 --");
        Student student1 = new Student("Иванов");
        student1.addGrade(2);
        student1.addGrade(3);
        student1.addGrade(4);
        student1.addGrade(5);

        System.out.println(student1);

        System.out.println(" -- Все четные числа в диапазоне от 1 до 100000 --");
        Student student2 = new Student("Петров", grade -> grade >= 1 && grade <= 100000 && grade % 2 == 0);
        student2.addGrade(4);
        student2.addGrade(3);
        student2.addGrade(100000);
        student2.addGrade(100001);

        System.out.println(student2);
    }
}