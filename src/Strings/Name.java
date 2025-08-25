package Strings;
import java.util.Scanner;
public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Name:");
		String str = sc.nextLine();
		String[] name = str.split("\\s+");
		for(int i = 0; i < name.length; i++) {
			if(i == name.length - 1) {
				System.out.print(name[i]);
			} else {
				System.out.print(name[i].charAt(0) + ".");
			}
		}
	}

}