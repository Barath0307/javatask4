package com.task4Q2;

//Define the custom exception class
class InvalidAgeException extends Exception {
public InvalidAgeException(String message) {
   super(message);
}
}

//Define the Voter class
public class Voter {
private int voterId;
private String name;
private int age;

// Parameterized constructor with age validation
public Voter(int voterId, String name, int age) throws InvalidAgeException {
   if (age < 18) {
       throw new InvalidAgeException("Invalid age for voter " + name);
   }
   this.voterId = voterId;
   this.name = name;
   this.age = age;
}

// Getters and setters
public int getVoterId() {
   return voterId;
}

public void setVoterId(int voterId) {
   this.voterId = voterId;
}

public String getName() {
   return name;
}

public void setName(String name) {
   this.name = name;
}

public int getAge() {
   return age;
}

public void setAge(int age) throws InvalidAgeException {
   if (age < 18) {
       throw new InvalidAgeException("Invalid age for voter " + name);
   }
   this.age = age;
}

// toString() method
@Override
public String toString() {
   return "Voter{" +
           "voterId=" + voterId +
           ", name='" + name + '\'' +
           ", age=" + age +
           '}';
}
}