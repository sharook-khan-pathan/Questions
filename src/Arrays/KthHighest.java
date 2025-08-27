package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class KthHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,4,6,7,8,2};
		Scanner sc = new Scanner(System.in);
	
		for(int i = 0 ; i < a.length; i++) {
			for(int j = 0; j < a.length-1; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j + 1];
                    a[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("Enter the number:");
		int k = sc.nextInt();
		System.out.println(a[a.length-k]);
	}

}
