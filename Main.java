package com.task4Q5;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Pop: " + stack.pop()); // Output: 30
        System.out.println("Pop: " + stack.pop()); // Output: 20

        stack.push(40);
        stack.push(50);

        System.out.println("Is Stack empty? " + stack.isEmpty()); // Output: false

        while (!stack.isEmpty()) {
            System.out.println("Pop: " + stack.pop());
        }

        System.out.println("Is Stack empty? " + stack.isEmpty()); // Output: true
    }
}