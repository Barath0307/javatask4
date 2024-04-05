package com.task4Q3;

import java.util.Scanner;

public class WeekdaysArray {
    public static void main(String[] args) {
        // Array to store names of weekdays
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Ask user for day position
        System.out.print("Enter the day position (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int dayIndex = scanner.nextInt();

        try {
            // Print the corresponding day name
            String dayName = weekdays[dayIndex];
            System.out.println("The day is: " + dayName);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle array index out of bounds exception
            System.out.println("Error: Index out of bounds. Please enter a number between 0 and 6.");
        }
    }
}