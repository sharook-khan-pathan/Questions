package ExceptionHandling;
import java.util.Scanner;
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5};
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter the index:");
			String index = sc.nextLine();
			int num = Integer.parseInt(index);
			System.out.println(a[num]);
			
		}
		catch(NumberFormatException e) {
			System.out.println("Enter Vaild Number");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("This message is form finally block");
		}
	}

}
