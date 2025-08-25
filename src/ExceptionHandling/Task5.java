package ExceptionHandling;

import java.util.Scanner;

public class Task5 {

	public static void validateAge(int age) {
		if (age < 18) {
			throw new IllegalArgumentException("Access denied - You must be at least 18 years old.");
		} else {
			System.out.println("Access granted.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entee the age:");
		int num = sc.nextInt();
		try {
			validateAge(num); // You can change this value to test
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

}