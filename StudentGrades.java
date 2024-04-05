package com.task4Q4;

import java.util.HashMap;

public class StudentGrades {
    private HashMap<String, Integer> studentGrades;

    public StudentGrades() {
        studentGrades = new HashMap<>();
    }

    // Method to add a new student
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
    }

    // Method to remove a student
    public void removeStudent(String name) {
        studentGrades.remove(name);
    }

    // Method to display a student's grade by name
    public void displayGrade(String name) {
        Integer grade = studentGrades.get(name);
        if (grade != null) {
            System.out.println(name + "'s grade is: " + grade);
        } else {
            System.out.println("No grade found for student: " + name);
        }
    }

    public static void main(String[] args) {
        StudentGrades grades = new StudentGrades();

        // Adding some sample students
        grades.addStudent("Barath", 85);
        grades.addStudent("Asha", 92);
        grades.addStudent("Rithi", 78);

        // Displaying grade for a student
        grades.displayGrade("Barath");

        // Removing a student
        grades.removeStudent("Asha");

        // Displaying grade for a removed student
        grades.displayGrade("Rithi");
    }
}
