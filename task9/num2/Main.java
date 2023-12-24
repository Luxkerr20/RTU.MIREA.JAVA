package ru.mirea.task9.num2;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Влад", 90),
                new Student("Владик", 95),
                new Student("Владислав", 99),
                new Student("Владос", 100),
                new Student("Вальдемар", 1)
        };

        java.util.Arrays.sort(students, new SortingStudentsByGPA());

        System.out.println("Список студентов, отсортированный по убыванию баллов:");
        for (Student student : students) {
            System.out.println("Имя: " + student.getName() + ", Итоговый балл: " + student.getGpa());
        }
    }
}