package Arrays;

import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
//		for(int i = arr.length-1; i >= 0; i--) {
//			System.out.println(arr[i]);
//		}
		int arr1[] = new int[arr.length];
		for(int i = arr.length-1,j = 0; i >= 0;j++, i--) {
			arr1[j] = arr[i];
		}
		
		System.out.println(Arrays.toString(arr1));
	}

}
