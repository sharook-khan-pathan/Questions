package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.print("Enter the index:");
		int index = sc.nextInt();
		al.remove(index);
		System.out.println(al);
		System.out.print("Enter a Number:");
		Object num = sc.next();
		boolean flag = false;
		for(Object ob : al) {
			if(ob == num) {
				flag = true;
				break;
			}
		}
		if(flag)
			System.out.println("Found");
		else
			System.out.println("Not Found");
	}

}
