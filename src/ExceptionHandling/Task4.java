package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number:");
			int a = sc.nextInt();
			System.out.print("Enter a number:");
			int b = sc.nextInt();
			System.out.print("Enter a operator:");
			char op = sc.next().charAt(0);
			switch(op) {
				case '+':
					System.out.println("Addition:"+(a+b));
					break;
				case '-':
					System.out.println("Subraction:"+(a-b));
					break;
				case '*':
					System.out.println("Multiplication:"+(a*b));
					break;
				case '/':
					System.out.println("Division:"+(a/b));
					break;
				default:
					System.out.println("Invalid operator!");
			}
		}
		catch(InputMismatchException e) {
			System.out.println("Please enter valid numeric values for numbers.");
		}
		catch(ArithmeticException e) {
			System.out.println("Division by zero is not allowed.");
		}
	}
}