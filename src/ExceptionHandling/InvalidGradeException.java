package ExceptionHandling;

import java.util.Scanner;

public class InvalidGradeException {

    public static class InvalidGradeExceptionDemo extends Exception {
        public InvalidGradeExceptionDemo(String message) {
            super(message);
        }
    }

    public static void setGrade(int grade) throws InvalidGradeExceptionDemo {
        if (grade < 0 || grade > 100) {
            throw new InvalidGradeExceptionDemo("Grade must be between 0 and 100.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        String name = sc.nextLine();
        System.out.print("Enter grade (0-100): ");
        int grade = sc.nextInt();
        try {
            setGrade(grade);
            System.out.println("Student: " + name + ", Grade: " + grade);
        } catch (InvalidGradeExceptionDemo e) {
            System.out.println("Invalid grade for student " + name + ": " + e.getMessage());
        }
    }

}