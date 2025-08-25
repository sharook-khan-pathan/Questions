package ExceptionHandling;
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int a = sc.nextInt();
		System.out.print("Enter a number");
		int b = sc.nextInt();

		try {
			int c = a/b;
			System.out.println(c);
			}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
	}

}
