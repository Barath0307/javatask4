package com.task4Q1;

//AgeNotWithinRangeException class
class AgeNotWithinRangeException extends Exception {
 public AgeNotWithinRangeException(String message) {
     super(message);
 }
}

//NameNotValidException class
class NameNotValidException extends Exception {
 public NameNotValidException(String message) {
     super(message);
 }
}

//Student class
class Student {
 private int rollNo;
 private String name;
 private int age;
 private String course;

 // Parameterized constructor
 public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
     if (age < 15 || age > 21) {
         throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
     }
     if (!name.matches("[a-zA-Z ]+")) {
         throw new NameNotValidException("Name should contain only alphabets and spaces.");
     }

     this.rollNo = rollNo;
     this.name = name;
     this.age = age;
     this.course = course;
 }

 // Getters and setters
 public int getRollNo() {
     return rollNo;
 }

 public void setRollNo(int rollNo) {
     this.rollNo = rollNo;
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

 public void setAge(int age) {
     this.age = age;
 }

 public String getCourse() {
     return course;
 }

 public void setCourse(String course) {
     this.course = course;
 }

 // toString method to represent Student object as String
 @Override
 public String toString() {
     return "Student{" +
             "rollNo=" + rollNo +
             ", name='" + name + '\'' +
             ", age=" + age +
             ", course='" + course + '\'' +
             '}';
 }
}