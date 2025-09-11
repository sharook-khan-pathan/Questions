package ExceptionHandling;
import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age:");
		String age = sc.nextLine();
		try {
			int agenum = Integer.parseInt(age);
		}
		catch(NumberFormatException e) {
			//e.printStackTrace();
			System.out.println("Enter valid number");
		}
		
	}

}
